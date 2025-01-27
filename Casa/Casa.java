package org.example.spritboot.Casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Casa {
    private String nombre;
    private float metros;

    @Autowired
    private Habitacion habitacion;


    public Casa() {}
    @Autowired
    public Casa(Habitacion habitacion) {
        this.nombre = "Casa";
        this.metros = 40.0f;
        this.habitacion= habitacion;
    }


    public Casa(String nombre, float metros, Habitacion habitacion) {
        this.nombre = nombre;
        this.metros = metros;
        this.habitacion = habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getMetros() {
        return metros;
    }

    public void setMetros(float metros) {
        this.metros = metros;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                ", habitacion=" + habitacion +
                '}';
    }
}
