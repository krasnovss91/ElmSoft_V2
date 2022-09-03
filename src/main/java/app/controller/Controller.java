package app.controller;

import app.entity.Triangle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Controller {
    @GetMapping("/triangle")
    public Triangle getTriangle(@RequestParam BigDecimal a, @RequestParam BigDecimal b, @RequestParam BigDecimal c) {
        return new Triangle(a, b, c);
    }
}
