/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavencrudjdbc.dao;

import com.mycompany.mavencrudjdbc.entities.ProyectoDeLey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laugo
 */
public class ProyectoDeLeyImpl implements IProyectoDeLeyDao{
    private Connection conn;
    String INSERTINTO="INSERT INTO proyectodeley(nombre, asunto) values(?,?)";
    String GETALL="SELECT * FROM proyectodeley";
    public ProyectoDeLeyImpl(Connection conn){
    this.conn=conn;
    }
    
    public void insertar(ProyectoDeLey t) throws SQLException {
        PreparedStatement stat=null;
        
        try {
            stat=conn.prepareStatement(INSERTINTO);
            stat.setString(1, t.getNombre());
            stat.setString(2, t.getAsunto());
            if (stat.executeUpdate()==0){
            throw new SQLException("La base de datos no guardó");
            }
        } catch (Exception e) {
            throw new SQLException("Error en la base de datos");
        }finally {
            if (stat != null){
                try {
                    stat.close();
                } catch (Exception e) {
                    throw new SQLException("Error en la base de datos");
                }
            }
        }
    }
      
    public ProyectoDeLey convertir(ResultSet rs) throws SQLException {
        String nombre = rs.getString("nombre");
        String asunto = rs.getString("asunto");
        ProyectoDeLey proyecto = new ProyectoDeLey(nombre, asunto);
        proyecto.setId(rs.getInt("id"));
        return proyecto;
    }

 
       
    
    public List<ProyectoDeLey> obtenerTodos() throws SQLException {
        PreparedStatement stat=null;
        ResultSet rs=null;
        List<ProyectoDeLey> proyectos=new ArrayList<>();
         try {
             stat=conn.prepareStatement(GETALL);
             rs=stat.executeQuery();
             while (rs.next()) {
                 proyectos.add(convertir(rs));
                 
             }
             
                     
        } catch (Exception e) {
            throw new SQLException("Error en la base de datos");
        }finally {
            if (stat != null){
                try {
                    stat.close();
                } catch (Exception e) {
                    throw new SQLException("Error en la base de datos");
                }
            }
             if (rs != null){
                try {
                    rs.close();
                } catch (Exception e) {
                    throw new SQLException("Error en la base de datos");
                }
            }
        }
         return proyectos;
    }
    
}
