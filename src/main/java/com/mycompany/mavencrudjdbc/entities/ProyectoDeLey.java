/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavencrudjdbc.entities;

/**
 *
 * @author Laugo
 */
public class ProyectoDeLey {
    private int id;
    private String nombre;
    private String asunto;
    
    public ProyectoDeLey(){
        
        
    }
    public ProyectoDeLey(String nombre, String asunto){ 
        this.nombre=nombre;
        this.asunto=asunto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "ProyectoDeLey{" + "id=" + id + ", nombre=" + nombre + ", asunto=" + asunto + '}';
    }
    
}
