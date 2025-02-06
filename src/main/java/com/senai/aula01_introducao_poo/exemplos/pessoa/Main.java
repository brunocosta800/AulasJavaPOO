package com.senai.aula01_introducao_poo.exemplos.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        String[] etiqueta = {"Nome: ", "Idade: ", "Altura: ", "Endereço: \n\t Logradouro: ", "\t Nome do endereço: ", "\t Número: ", "\t Bairro: ", "\t Cidade: ", "\t Estado: "};
        String[] dados = new String[etiqueta.length];

        System.out.println("Preencha os dados a seguir: ");
        for (int i = 0; i < etiqueta.length; i++) {
            System.out.print(etiqueta[i]);
            dados[i] = scanner.nextLine();
        }

        Pessoa pessoa2 = new Pessoa(
                dados[0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        dados[4],
                        dados[5],
                        dados[6],
                        dados[7],
                        dados[8]
                )

        );

    }
}
