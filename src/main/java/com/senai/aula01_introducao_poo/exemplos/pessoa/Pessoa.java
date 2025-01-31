package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    public void falar(String frase) {
        System.out.println(this.nome + ": " + frase);
    }
    public void comer(String alimento) {
        System.out.println(this.nome + " comeu " + alimento);
    }

    public Pessoa(String nome, int idade, float altura, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", altura=" + this.altura +
                ", endereco=" + this.endereco +
                '}';
    }
}
