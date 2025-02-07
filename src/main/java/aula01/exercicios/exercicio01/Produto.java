package aula01.exercicios.exercicio01;

import java.util.Objects;
import java.util.Scanner;

public class Produto {
    Scanner scanner = new Scanner(System.in);

    String nome;
    float preco;
    int quantidade;

    public Produto(int quantidade, float preco, String nome) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
    }

    public void exibirDetalhes() {
        System.out.println("Nome do produto: " + nome + "\nPreco: " + preco + "\nQuantidade: " + quantidade + "\n");
    }

    public void atualizaEstoque(String opcao, int quantidade) {
        if(opcao.equals("aumentar")){
            this.quantidade += quantidade;
        }
        else if(opcao.equals("diminuir")){
            this.quantidade -= quantidade;
        }
    }

    public void calcularValorEstoque() {
        float valorEstoque = this.preco * this.quantidade;
        System.out.println("O valor do estoque do produto " + nome + " é: " + valorEstoque);
    }
}
