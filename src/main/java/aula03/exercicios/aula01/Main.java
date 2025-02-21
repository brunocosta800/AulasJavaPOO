package aula03.exercicios.aula01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double preco;
        System.out.print("Digite o nome do produto: ");
        nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        preco = scanner.nextDouble();
        Produto feijao = new Produto(nome, preco);
        System.out.println(feijao.getPreco());
    }
}
