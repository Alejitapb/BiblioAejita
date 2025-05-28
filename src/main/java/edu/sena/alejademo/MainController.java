package edu.sena.alejademo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@SpringBootApplication(scanBasePackages = "edu.sena")
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
