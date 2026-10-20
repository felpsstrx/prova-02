import model.Frete;
import model.Pessoa;
import model.Usuario;
import validacoes.Senha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String username = sc.nextLine();
        Usuario usuario = new Usuario(username);
        System.out.println("Usuário válido? " + usuario.validarUsername());

        System.out.print("Digite a senha: ");
        String textoSenha = sc.nextLine();
        Senha senha = new Senha(textoSenha);
        System.out.println(senha.validar());

        System.out.print("Digite a distância em km: ");
        double distancia = Double.parseDouble(sc.nextLine().replace(",", "."));
        System.out.print("Digite o peso: ");
        double peso = Double.parseDouble(sc.nextLine().replace(",", "."));
        Frete frete = new Frete(distancia, peso);
        System.out.println("Valor do frete: R$ " + String.format("%.2f", frete.calcular()));

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o ano atual: ");
        int anoAtual = Integer.parseInt(sc.nextLine());
        Pessoa pessoa = new Pessoa(anoNascimento);
        System.out.println("Idade: " + pessoa.calcularIdade(anoAtual));

        sc.close();
    }
}
