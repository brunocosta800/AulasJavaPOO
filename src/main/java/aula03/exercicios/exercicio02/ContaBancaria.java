package aula03.exercicios.exercicio02;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            throw new IllegalArgumentException("O saldo não pode ser negativo");
        }
    }

    public ContaBancaria(String titular, double saldo) {
        setTitular(titular);
        setSaldo(saldo);
    }

    public void depositar(double valor){
        setSaldo(valor + this.saldo);
        System.out.println("O saldo da conta agora é: " + getSaldo());
    }

    public void sacar(double valor){
        setSaldo(this.saldo - valor);
        System.out.println("O saldo da conta agora é: " + getSaldo());
    }
}
