/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavencrudjdbc;

import com.mycompany.mavencrudjdbc.dao.IProyectoDeLeyDao;
import com.mycompany.mavencrudjdbc.dao.ProyectoDeLeyImpl;
import com.mycompany.mavencrudjdbc.entities.ProyectoDeLey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laugo
 */
public class MAVENCrudJDBC {

    public static void main(String[] args) throws SQLException{
        Connection connection=null;
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectodeley","root","root");
            System.out.println("Entré a la Base de datos");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("No se pudo conectar a la DB");
        }
        IProyectoDeLeyDao proyectoDaos=new ProyectoDeLeyImpl(connection);
       /* ProyectoDeLey proyecto=new ProyectoDeLey("Reforma Laboral","Se fomenta la creación de nuevos empleos");
         
        try {
          proyectoDaos.insertar(proyecto);
        } catch (SQLException ex) {
            throw new SQLException("Error en SQL");
        } */
       
         
        try {
            List<ProyectoDeLey> p = new ArrayList<>();
            p = proyectoDaos.obtenerTodos();
            for (ProyectoDeLey proyecto : p) {
                System.out.println(proyecto);
            }
        } catch (SQLException ex) {
            throw new SQLException("Error en SQL");
        }
 
 
 
 
        
    }
}
