package aula03.exercicios.exercicio02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBruno = new ContaBancaria("Bruno Costa Dourado", -5);
        contaBruno.depositar(15.00);
        contaBruno.sacar(10.00);
    }
}
