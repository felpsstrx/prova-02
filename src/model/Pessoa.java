package model;

public class Pessoa {

    private int anoNascimento;

    public Pessoa(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
