package aula02.exercicios.exercicio01;

public class Tarefas {
    String nome;
    boolean status;

    public Tarefas(String nome) {
        this.nome = nome;
        this.status = false;
    }

    public void concluirTarefa(){
        this.status = true;
    }
}
