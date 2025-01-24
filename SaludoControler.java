package org.example.spritboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SaludoControler {
    @GetMapping("/Saludo")
    public String saludo() {
        return "Hola Mundo";
    }
}
