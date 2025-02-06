package concessionaria;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "Hyundai",
                "HB20",
                "Vermelho",
                "Jorge",
                2021,
                1.4f,
                200.00f,
                150,
                false
        );

        Carro carro2 = new Carro(
                "Tesla",
                "Model S",
                "Branco",
                "Matheus",
                2023,
                1.8f,
                400.00f,
                200,
                true
        );


        System.out.println(carro1);
        carro1.testDrive();
        carro1.comprar("Bruno");

        System.out.println(carro2);
        carro2.testDrive();
        carro2.comprar("Alex");
        carro2.valorFipe(2025);
    }
}
