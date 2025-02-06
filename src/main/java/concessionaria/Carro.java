package concessionaria;

import static java.lang.Math.pow;

public class Carro {
    String marca, modelo, cor, nomeDono;
    int ano;
    float motor, preco, quilometragem;
    boolean eletrico;

    public Carro(String marca, String modelo, String cor, String nomeDono, int ano, float motor, float preco, float quilometragem, boolean eletrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.nomeDono = nomeDono;
        this.ano = ano;
        this.motor = motor;
        this.preco = preco;
        this.quilometragem = quilometragem;
        this.eletrico = eletrico;
    }

    public void testDrive(){
        System.out.println("Veículo " + modelo + " foi testado e aprovado");
    }

    public void comprar(String nomeCliente){
        System.out.println("Parabéns pela compra " + nomeCliente + " do " + marca + " " + modelo);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", nomeDono='" + nomeDono + '\'' +
                ", ano=" + ano +
                ", motor=" + motor +
                ", preco=" + preco +
                ", quilometragem=" + quilometragem +
                ", eletrico=" + eletrico +
                '}';
    }

    public void valorFipe(int ano){
        int idade = ano - this.ano;
        float valorAtual = (float)(preco * (pow(1 - 0.02f, idade)));
        System.out.printf("O %s no ano %d vale R$%,.2f na tabela fipe", modelo, this.ano, valorAtual);
    }
}
