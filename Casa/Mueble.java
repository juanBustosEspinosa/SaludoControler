package org.example.spritboot.Casa;

import org.springframework.stereotype.Component;

@Component

public class Mueble {
    private String nombre;

    public Mueble() {
        this.nombre = "Mueble";
    }

    public Mueble(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "Mueble{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
