package validacoes;

public class Senha {

    private String valor;

    public Senha(String valor) {
        this.valor = valor;
    }

    public String validar() {
        if (valor.length() <= 3) {
            return "Senha deve possuir mais de 3 caracteres!";
        } else if (valor.length() > 100) {
            return "Por favor digite uma senha menor que 100!";
        } else {
            return "Senha Válida!";
        }
    }
}
