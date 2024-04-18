package br.cesul.body;

public class Square {

    private double side;

    public Square( double side) {
    this.side = side;
    }

    public double getPerimeter() { return 4 * side; }
    public double getArea() { return side * side; }
}
