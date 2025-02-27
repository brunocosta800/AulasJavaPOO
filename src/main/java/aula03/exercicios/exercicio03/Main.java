package aula03.exercicios.exercicio03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cargosPossiveis = new ArrayList<>();
        cargosPossiveis.add("Gerente");
        cargosPossiveis.add("Analista");
        cargosPossiveis.add("Programador");

        Funcionario bruno = new Funcionario(" ", "Programador", 1320.00, cargosPossiveis);
    }
}
