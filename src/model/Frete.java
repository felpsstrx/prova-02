package model;

public class Frete {

    private double distancia;
    private double peso;

    public Frete(double distancia, double peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

    public double calcular() {
        if (distancia <= 100) {
            return 1.50 * peso;
        } else {
            return 2 * peso;
        }
    }
}
