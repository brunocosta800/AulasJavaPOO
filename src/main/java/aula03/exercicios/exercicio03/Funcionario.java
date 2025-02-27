package aula03.exercicios.exercicio03;

import java.util.ArrayList;

public class Funcionario {
    private String nome, cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }else{
            this.nome = nome;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo, ArrayList<String> cargos) {
        if(cargos.contains(cargo)){
            this.cargo = cargo;
        }else{
            throw new IllegalArgumentException("O cargo não existe na empresa");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 1320.00){
            this.salario = salario;
        }else{
            throw new IllegalArgumentException("O salario não pode ser menor que R$1320");
        }
    }

    public Funcionario(String nome, String cargo, double salario, ArrayList<String> cargos) {
        setNome(nome);
        setCargo(cargo, cargos);
        setSalario(salario);
    }

    public void aumentarSalario(double valor){
        double salarioAnterior = this.salario;
        setSalario(this.salario + valor);
        System.out.println("O salario aumentou " + ((valor / salarioAnterior) * 100) + "%");
    }
}
