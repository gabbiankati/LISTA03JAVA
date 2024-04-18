package br.cesul.Eletion;
public class Eletion {

    private int candidatoA;
    private int candidatoB;
    private int votosNulos;
    private int votosBranco;

    public Eletion(int candidatoA, int candidatoB, int votosNulos, int votosBranco) {
        this.candidatoA = candidatoA;
        this.candidatoB = candidatoB;
        this.votosNulos = votosNulos;
        this.votosBranco = votosBranco;
    }

    public String getResultEletion() {
        int totalVotos = candidatoA + candidatoB + votosBranco + votosNulos;
        double percentualVotosA = (double) candidatoA / totalVotos * 100;
        double percentualVotosB= (double) candidatoB / totalVotos * 100;

        if (percentualVotosA > 50) {
            return "Candidato A";
        } else if (percentualVotosB > 50) {
            return "Candidato B";
        } else {
            return "Segundo turno!";
        }
    }
}
