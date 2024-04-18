package br.cesul.app;

import br.cesul.body.Square;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(8);
        System.out.println("O perímetro é " + square.getPerimeter());
        System.out.println("A área é " + square.getArea());
    }
}
