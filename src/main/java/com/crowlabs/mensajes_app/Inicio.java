/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowlabs.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author croweloper
 */
public class Inicio {
    
    public static void main(String[] args) {
        System.out.println("Hola mundo desde com.crowlabs.mensajes_app.Inicio.main()");
        
        Conexion conexion=new Conexion();
        try{
            Connection cnx=conexion.getConnection();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    
}
