package aula01.exercicios.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno allan = new Aluno("Allan", 19, 8.5);
        Aluno brayan = new Aluno("Brayan", 17, 5.5);
        Aluno bruno = new Aluno("Bruno", 20, 7.0);

        System.out.print("Digite a nova nota final do aluno: ");
        double nota = scanner.nextDouble();
        allan.atualizaNota(nota);

        allan.exibirInformacoes();
        brayan.exibirInformacoes();
        bruno.exibirInformacoes();

        allan.verificarAprovacao();
        brayan.verificarAprovacao();
        bruno.verificarAprovacao();
    }
}
