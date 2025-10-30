package br.edu.ifba.inf008.myproject;

class GeometryCalculator
{
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
    private double radius;

    // construtores

    public GeometryCalculator()
    {

    }

    // retângulo
    public GeometryCalculator(double side1, double side2)
    {
        this.side1 = side1;
        this.side2 = side2;
    }

    // triângulo
    public GeometryCalculator(double side1, double side2, double side3)
    {
        this(side1, side2);
        this.side3 = side3;
    }

    // círculo
    public GeometryCalculator(double radius)
    {
        this.radius = radius;
    }

    // métodos e métodos sobrecarregados

    public double calculateArea(double radius)
    {

    }

    public double calculateArea(double base, double height)
    {

    }

    public double calculateArea(double side1, double side2, double side3)
    {

    }

    public double calculateArea(double radius)
    {

    }

    public double calculatePerimeter(double... sides)//varargs
    {

    }


}
