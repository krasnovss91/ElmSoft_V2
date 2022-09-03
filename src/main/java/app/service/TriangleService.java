package app.service;

import app.entity.Triangle;

import java.math.BigDecimal;

public interface TriangleService {
   BigDecimal getPerimetre(BigDecimal a, BigDecimal b, BigDecimal c);
 //  BigDecimal getPerimetre();
   double getArea(Triangle triangle);
  // Double getArea();
}
