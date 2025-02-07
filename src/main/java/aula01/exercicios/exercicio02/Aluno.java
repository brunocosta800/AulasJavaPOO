package aula01.exercicios.exercicio02;

import java.util.Scanner;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome + "\nIdade: " + idade + "\nNota Final: " + nota + "\n");
    }

    public void atualizaNota(double nota) {
        System.out.println("A nota de " + nome + " agora é " + this.nota);
    }

    public void verificarAprovacao() {
        if(this.nota >= 6.0){
            System.out.println("O aluno " + nome + " está aprovado");
        }
        else{
            System.out.println("O aluno " + nome + " está reprovado");
        }
    }
}
