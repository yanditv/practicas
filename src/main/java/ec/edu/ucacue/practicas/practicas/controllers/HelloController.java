package ec.edu.ucacue.practicas.practicas.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping("/hola")
    public String getHello() {
        return "Hello World";
    }

    @PostMapping("/post")
    public String postMethodName(@RequestParam String name) {
        return "Hello " + name;
    }
}
