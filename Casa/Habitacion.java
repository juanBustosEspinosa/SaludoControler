package org.example.spritboot.Casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Habitacion {

    private String nombre;
    private int id;
    private float metros;


    @Autowired
    private Puerta puerta;
    @Autowired
    private Mueble mueble;
public Habitacion() {}
    @Autowired
    public Habitacion(Puerta puerta, Mueble mueble) {
        nombre = "Habitacion";
        id = 1;
        metros = 3.0f;
        this.puerta = puerta;
        this.mueble = mueble;
    }


    public Habitacion(String nombre, int id, float metros, Puerta puerta, Mueble mueble) {
        this.nombre = nombre;
        this.id = id;
        this.metros = metros;
        this.puerta = puerta;
        this.mueble = mueble;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMetros() {
        return metros;
    }

    public void setMetros(float metros) {
        this.metros = metros;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Mueble getMueble() {
        return mueble;
    }

    public void setMueble(Mueble mueble) {
        this.mueble = mueble;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                ", metros=" + metros +
                ", puerta=" + puerta +
                ", mueble=" + mueble +
                '}';
    }
}
