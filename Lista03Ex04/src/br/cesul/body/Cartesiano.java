package br.cesul.body;

public class Cartesiano {

    private double x;
    private double y;


    public Cartesiano(double x, double y){
        this.x = x;
        this.y = y;

    }
    public double block(){
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }
    public double distance(Cartesiano outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.x - this.x, 2) + Math.pow(outroPonto.y - this.y, 2));
    }

}
