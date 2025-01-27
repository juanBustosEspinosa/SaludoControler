package org.example.spritboot.Casa;

import org.example.spritboot.Coche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ControladorCasa {
@Autowired
private Casa casa;

    @Autowired
    private Habitacion habitacion;

    @Autowired
    private Puerta puerta;

    @Autowired
    private Mueble mueble;

    @Autowired
    private Marco marco;

    @Autowired
    private picaporte picaporte;

        @GetMapping("/Casa")
        public ResponseEntity<Casa> ObtenerCasa() {
            casa.setNombre("Popeye");
            casa.setMetros(120.14f);
            habitacion.setMetros(12.4f);
            habitacion.setId(2);
            habitacion.setNombre("Habitacion");
            puerta.setNombre("Puerta");
            marco.setNombre("Marco");
            picaporte.setNombre("Picaporte");
            puerta.setMarco(marco);
            puerta.setPicaporte(picaporte);
            habitacion.setPuerta(puerta);
            mueble.setNombre("Mueble");
            habitacion.setMueble(mueble);
            casa.setHabitacion(habitacion);





            System.out.println(casa.toString());
            return ResponseEntity.ok(casa);
        }

        @PostMapping("/Casa")
        public ResponseEntity<Casa> ejemploCasa(@RequestBody Casa c) {
            System.out.println(c);
            return ResponseEntity.ok(c);
        }
    }


