/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavencrudjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Laugo
 */
public class ManagerDao {
    private Connection conn;
    public ManagerDao(String host, String username, String password, String db)throws SQLException{
        conn=DriverManager.getConnection("jdbc:mysql//"+host+"/"+db,username,password);
        
        
    }
}
