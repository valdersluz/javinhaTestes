package br.edu.ifba.inf008.myproject;

import java.math.BigDecimal;
import java.math.RoundingMode;

class GeometryCalculator
{
    private float base;
    private float height;
    private float side1;
    private float side2;
    private float side3;
    private float radius;

    // construtores

    public GeometryCalculator()
    {

    }

    // retângulo
    public GeometryCalculator(double side1, double side2, int casasDecimais)
    {
        BigDecimal temp1 = BigDecimal.valueOf(side1);
        BigDecimal temp2 = BigDecimal.valueOf(side2);

        this.side1 = temp1.setScale(casasDecimais, RoundingMode.HALF_UP).floatValue();
        this.side2 = temp2.setScale(casasDecimais, RoundingMode.HALF_UP).floatValue();
    }

    // triângulo
    public GeometryCalculator(double side1, double side2, double side3, int casasDecimais)
    {

        this(side1, side2, casasDecimais);

        BigDecimal temp = BigDecimal.valueOf(side3);
        this.side3 = temp.setScale(casasDecimais, RoundingMode.HALF_UP).floatValue();
    }

    // círculo
    public GeometryCalculator(double radius, int casasDecimais)
    {
        BigDecimal temp = BigDecimal.valueOf(radius);
        this.radius = temp.setScale(casasDecimais, RoundingMode.HALF_UP).floatValue();
    }


    //------------------ get e set -------------------------------

    public float getBase() {
    return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getSide1() {
        return side1;
    }

    public void setSide1(float side1) {
        this.side1 = side1;
    }

    public float getSide2() {
        return side2;
    }

    public void setSide2(float side2) {
        this.side2 = side2;
    }

    public float getSide3() {
        return side3;
    }

    public void setSide3(float side3) {
        this.side3 = side3;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    //------------------------------------------------------------

    // métodos e métodos sobrecarregados

    public double calculateArea(double radius)
    {

        return Math.PI * radius * radius;

    }

    public double calculateArea(double base, double height)
    {
        return base * height;
    }

    public double calculateArea(double side1, double side2, double side3)
    {
        double p = (side1 + side2 + side3)/2;

        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double calculatePerimeter(double... sides)//varargs
    {

    }



}
