
package com.crowlabs.mensajes_app;

import lombok.Data;

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
