/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crowlabs.mensajes_app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import lombok.Data;
import lombok.Synchronized;

/**
 *
 * @author croweloper
 */
public @Data class Mensaje {

    private int id_mensaje;
    private String mensaje;
    private String autor_mensaje;
    private String fecha_mensaje;
    

    public Mensaje(int id_mensaje, String mensaje, String autor_mensaje, String fecha_mensaje) {
        this.id_mensaje = id_mensaje;
        this.mensaje = mensaje;
        this.autor_mensaje = autor_mensaje;
        this.fecha_mensaje = fecha_mensaje;
    }

    public Mensaje() {
    }

    
}
