/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowlabs.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author croweloper
 */
public class Inicio {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int opcion=0;
        do{
            System.out.println("---------------------------------");
            System.out.println(" Aplicacion de Mensajes");
            System.out.println(" 1. Crear Mensaje");
            System.out.println(" 2. Listar Mensajes");
            System.out.println(" 3. Editar Mensajes");
            System.out.println(" 4. Eliminar Mensajes");
            System.out.println(" 5. Salir");
            
            opcion=sc.nextInt();
            
            switch(opcion){
                case 1:
                    MensajeService.CreateMessageDB();
                    break;
                case 2:
                    MensajeService.ReadMessageDB();
                    break;
                case 3:
                    MensajeService.UpdateMessageDB();
                    break;
                case 4:
                    MensajeService.DeleteMessageDB();
                    break;
                default:
                    break;
                
            }
            
        }while(opcion!=5);
        
        //System.out.println("Hola mundo desde com.crowlabs.mensajes_app.Inicio.main()");
        
        Conexion conexion=new Conexion();
        try{
            Connection cnx=conexion.getConnection();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    
}
