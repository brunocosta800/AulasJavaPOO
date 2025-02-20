package aula02.exercicios.exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        String nomeTarefa;
        ArrayList<Tarefas> listaTarefas = new ArrayList<>();

        do{
            System.out.println("""
            Escolha uma opção:
            1 - Adicionar tarefa
            2 - Listar tarefas
            3 - Marcar tarefa como concluída
            4 - Remover uma tarefa
            5 - Sair do programa
            """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome da tarefa: ");
                    nomeTarefa = scanner.nextLine();
                    listaTarefas.add(new Tarefas(nomeTarefa));
                    break;
                case 2:
                    for (Tarefas tarefa : listaTarefas){
                        System.out.println("Nome da tarefa: " + tarefa.nome);
                        System.out.println("Status da tarefa: " + tarefa.status + "\n");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome da tarefa que deseja marcar como concluída: ");
                    String nomeBuscaConcluida = scanner.nextLine();
                    for (Tarefas tarefa : listaTarefas){
                        if(tarefa.nome.equals(nomeBuscaConcluida)){
                            tarefa.concluirTarefa();
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome da tarefa que deseja excluir: ");
                    String nomeBuscaExcluir = scanner.nextLine();
                    for (Tarefas tarefa : listaTarefas){
                        if(tarefa.nome.equals(nomeBuscaExcluir)){
                            listaTarefas.remove(tarefa);
                        }
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
                    break;
            }
        }while(opcao != 5);
    }
}
