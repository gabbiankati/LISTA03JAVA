package br.cesul.app;

import br.cesul.body.Cartesiano;

public class Main {


    public static void main(String[] args){

        Cartesiano ponto1 = new Cartesiano(2.5, -2.5);
        System.out.println("Ponto1 está no quadrante: " + ponto1.block());

        Cartesiano ponto2 = new Cartesiano(-1.8, -1.0);
        System.out.println("Ponto2 está no quadrante: " + ponto2.block());

        double distancia = ponto1.distance(ponto2);
        System.out.println("A distância entre o Ponto1 e o Ponto2 é: " + distancia);

    }
}
