package org.example.spritboot.Casa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Puerta {

    private String nombre;

    @Autowired
    private Marco marco;
    @Autowired
    private picaporte picaporte;
    public Puerta() {}
    @Autowired
    public Puerta(Marco marco, picaporte picaporte) {
        this.nombre = "Puerta";
        this.marco = marco;
        this.picaporte = picaporte;
    }

    public Puerta(String nombre, Marco marco, picaporte picaporte)
    {
        this.nombre = nombre;
        this.marco = marco;
        this.picaporte = picaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Marco getMarco() {
        return marco;
    }

    public void setMarco(Marco marco) {
        this.marco = marco;
    }

    public org.example.spritboot.Casa.picaporte getPicaporte() {
        return picaporte;
    }

    public void setPicaporte(org.example.spritboot.Casa.picaporte picaporte) {
        this.picaporte = picaporte;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "nombre='" + nombre + '\'' +
                ", marco=" + marco +
                ", picaporte=" + picaporte +
                '}';
    }
}
