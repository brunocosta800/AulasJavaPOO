package aula02_colecoes.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Allan", 19);
        Pessoa pessoa2 = new Pessoa("Brayan", 17);
        Pessoa pessoa3 = new Pessoa("Bruno", 20);

        Pessoa[] matrizPessoas = new Pessoa[4];

        matrizPessoas[0] = pessoa1;
        matrizPessoas[1] = pessoa2;
        matrizPessoas[2] = pessoa3;

        for (Pessoa pessoa : matrizPessoas){
            System.out.println(pessoa);
        }

        matrizPessoas[0].falar("Salve");

        matrizPessoas[3] = new Pessoa("Marcus", 17);
        System.out.println(matrizPessoas[3].nome);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(new Pessoa("Carlos", 30));

        System.out.println("Tamanho da lista: " + listaPessoas.size());
        listar(listaPessoas);
        listaPessoas.remove(pessoa1);
        listar(listaPessoas);

        listaPessoas.set(0, pessoa2);
        listar(listaPessoas);

        listaPessoas.add(0, pessoa3);
        listar(listaPessoas);

        listaPessoas.forEach(System.out::println);
        List<Pessoa> listaFiltrada = listaPessoas.stream().filter(p -> p.idade >= 10).toList();
        listaFiltrada.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as informações a seguir: ");
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        listaPessoas.add(new Pessoa(nome, idade));
        listaPessoas.forEach(System.out::println);
    }
    public static void listar(ArrayList<Pessoa> lista){
        System.out.println("");
        for (Pessoa pessoa : lista){
            System.out.println(pessoa);
        }
    }
}
