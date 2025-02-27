package aula02.exercicios.exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produtos> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("""
                    Escolha uma opção abaixo:
                    1 - Cadastrar produto
                    2 - Listar produtos
                    3 - Atualizar quantidade de produto
                    4 - Remover um produto
                    5 - Buscar um produto pelo nome
                    6 - Sair do programa
                    """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    String nomeProduto;
                    int quantidade;

                    System.out.print("Digite o nome do produto: ");
                    nomeProduto = scanner.nextLine();

                    System.out.print("Digite a quantidade do produto: ");
                    quantidade = scanner.nextInt();

                    estoque.add(new Produtos(nomeProduto, quantidade));

                    break;

                case 2:
                    for (Produtos produto : estoque) {
                        produto.imprimirProduto();
                    }
                    break;

                case 3:
                    String nomeProdutoAtualizar, opcaoAtualizar;
                    int quantidadeAtualizar;
                    System.out.print("Digite o nome do produto: ");
                    nomeProdutoAtualizar = scanner.nextLine();

                    System.out.print("Digite a quantidade: ");
                    quantidadeAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Você gostaria de diminuir ou aumentar a quantidade? ");
                    opcaoAtualizar = scanner.nextLine();

                    for (Produtos produto : estoque) {
                        if (produto.getNome().equals(nomeProdutoAtualizar)){
                            produto.mudarQuantidade(quantidadeAtualizar, opcaoAtualizar);
                        }
                    }
                    break;

                case 4:
                    String nomeProdutoDeletar;
                    System.out.print("Digite o nome do produto: ");
                    nomeProdutoDeletar = scanner.nextLine();

                    estoque.removeIf(produto -> produto.getNome().equals(nomeProdutoDeletar));
                    break;

                case 5:
                    String nomeProdutoPesquisar;
                    System.out.print("Digite o nome do produto: ");
                    nomeProdutoPesquisar = scanner.nextLine();

                    for (Produtos produto : estoque) {
                        if (produto.getNome().equals(nomeProdutoPesquisar)){
                            produto.imprimirProduto();
                        }
                    }
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 6);


    }
}
