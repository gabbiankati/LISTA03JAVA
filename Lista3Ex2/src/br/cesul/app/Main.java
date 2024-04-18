package br.cesul.app;

import br.cesul.Eletion.Eletion;

public class Main {

    public static void main(String[] args) {
        Eletion eletion = new Eletion(400, 600, 50, 30);
        String result =  eletion.getResultEletion();
        System.out.println("Resultado da eleição: " + result);
    }
}
