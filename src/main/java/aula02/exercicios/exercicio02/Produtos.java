package aula02.exercicios.exercicio02;

public class Produtos {
    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produtos(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void mudarQuantidade(int quantidade, String tipoMudanca){
        if(tipoMudanca.equalsIgnoreCase("aumentar")){
            this.quantidade += quantidade;
        }else if(tipoMudanca.equalsIgnoreCase("diminuir")){
            this.quantidade -= quantidade;
        }
    }

    public void imprimirProduto() {
        System.out.println("Nome do produto: " + getNome() + "\nQuantidade: " + getQuantidade());
    }
}
