package app.service;

import app.entity.Triangle;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TriangleServiceImpl implements TriangleService {

    @Override
    public BigDecimal getPerimetre(BigDecimal a, BigDecimal b, BigDecimal c) {

        BigDecimal d = new BigDecimal("2.0");
        return (a.add(b).add(c)).divide(d);
    }

    @Override
    public double getArea(Triangle triangle) {
        BigDecimal p = getPerimetre(triangle.getA(), triangle.getB(), triangle.getC());

        BigDecimal a = p.subtract(triangle.getA());
        BigDecimal b = p.subtract(triangle.getB());
        BigDecimal c = p.subtract(triangle.getC());

        return Math.sqrt((p.multiply(a).multiply(b).multiply(c)).doubleValue());
    }
}
