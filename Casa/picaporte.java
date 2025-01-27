package org.example.spritboot.Casa;

import org.springframework.stereotype.Component;

@Component
public class picaporte {

    private String nombre;

    public picaporte() {
        this.nombre = "picaporte ";
    }
    public picaporte(String nombre) {
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
        return "picaporte{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
