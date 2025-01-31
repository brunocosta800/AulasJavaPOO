package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(
                "Rafael",
                18,
                1.8f,
                new Endereco(
                        "Rua",
                        "Catanduva",
                        "66",
                        "Baeta Neves",
                        "SBC",
                        "SP")
        );

        pessoa1.falar("Alôôôôôôôô");
        pessoa1.comer("Arroz");
        System.out.println(pessoa1);

    }
}
