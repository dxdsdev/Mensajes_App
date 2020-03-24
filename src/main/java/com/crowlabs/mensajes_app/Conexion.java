/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowlabs.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author croweloper
 */
public class Conexion {
    
    public Connection getConnection(){
        Connection connection=null;        
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            /*if (connection!=null) {
                System.out.println("Conexion Exitosa");
            }*/
                               
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        return connection;
    }
    
}
