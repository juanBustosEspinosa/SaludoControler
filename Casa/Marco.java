package org.example.spritboot.Casa;

import org.springframework.stereotype.Component;

@Component

public class Marco {

    private String nombre;
    public Marco() {
        this.nombre="Marco";
    }

    public Marco(String nombre) {
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
        return "Marco{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
