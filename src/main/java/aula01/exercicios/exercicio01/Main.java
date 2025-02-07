package aula01.exercicios.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto feijao = new Produto(20, 8.0f, "Feijão");
        Produto cenoura = new Produto(10, 3.0f, "Cenoura");

        System.out.println("Você deseja aumentar ou diminuir o estoque? Digite aumentar ou diminuir: ");

        String opcao = scanner.nextLine();
        opcao = opcao.toLowerCase();
        System.out.println();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.println();

        feijao.atualizaEstoque(opcao, quantidade);

        feijao.exibirDetalhes();
        cenoura.exibirDetalhes();

        feijao.calcularValorEstoque();
        cenoura.calcularValorEstoque();
    }
}
