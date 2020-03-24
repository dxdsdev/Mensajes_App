/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowlabs.mensajes_app;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author croweloper
 */
public class MensajeService {

    public static void CreateMessageDB() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println(" Escribe tu nombre");
        String autor = sc.nextLine();

        Mensaje msg = new Mensaje();
        msg.setMensaje(mensaje);
        msg.setAutor_mensaje(autor);

        MensajeDAO.CreateMessageDB(msg);

    }

    public static void ReadMessageDB() {

        MensajeDAO.ReadMessageDB();

    }
    
    
    
    

    public static void DeleteMessageDB() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Escribe el ID del Mensaje a borrar");
        int id = sc.nextInt();

        MensajeDAO.DeleteMessageDB(id);

    }

    public static void UpdateMessageDB() {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Escribe el Nuevo Mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println(" Escribe el ID del Mensaje a Actualizar");
        int id = sc.nextInt();
               
        Mensaje msg = new Mensaje();
        msg.setMensaje(mensaje);
        msg.setFecha_mensaje("");
        msg.setId_mensaje(id);
        
        MensajeDAO.UpdateMessageDB(msg);

    }
    

}
