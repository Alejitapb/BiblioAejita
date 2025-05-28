package edu.sena.alejademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "¡Aplicación Spring Boot funcionando!";
    }

    @GetMapping("/test")
    public String test() {
        return "Endpoint de prueba";
    }
}

