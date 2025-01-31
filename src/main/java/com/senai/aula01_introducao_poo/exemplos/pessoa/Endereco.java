package com.senai.aula01_introducao_poo.exemplos.pessoa;

public class Endereco {
    String logradouro, nomeRua, numero, bairro, cidade, estado;

    public Endereco(String logradouro, String nomeRua, String numero, String bairro, String cidade, String estado) {
        this.logradouro = logradouro;
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "logradouro='" + this.logradouro + '\'' +
                ", nomeRua='" + this.nomeRua + '\'' +
                ", numero='" + this.numero + '\'' +
                ", bairro='" + this.bairro + '\'' +
                ", cidade='" + this.cidade + '\'' +
                ", estado='" + this.estado + '\'' +
                '}';
    }
}
