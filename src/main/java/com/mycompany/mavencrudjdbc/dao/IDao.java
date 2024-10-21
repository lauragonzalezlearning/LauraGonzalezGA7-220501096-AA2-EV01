/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavencrudjdbc.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Laugo
 */
public interface IDao <T,K>{
    void insertar(T t) throws SQLException;
    List<T> obtenerTodos() throws SQLException;
    
}
