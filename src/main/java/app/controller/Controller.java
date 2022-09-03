package app.controller;

import app.entity.Triangle;
import app.service.TriangleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Controller {

    @Autowired
    TriangleService triangleService;

    @GetMapping("/triangle")
    public double getTriangle(@RequestParam BigDecimal a, @RequestParam BigDecimal b, @RequestParam BigDecimal c) {
        Triangle triangle = new Triangle(a,b,c);

        return  triangleService.getArea(triangle);
    }
}
