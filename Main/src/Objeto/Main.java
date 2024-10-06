package Objeto;

public class Main {
    public static void main(String[] args) {
        // Creamos el objeto

        Auto auto1=new Auto();

        // Sar valores a los atributos

        auto1.color = "Rojo";
        auto1.marca = "Ferrari";
        auto1.modelo = 2025;

        System.out.println("\nColor carro: "+auto1.color + "\nMarca carro: "+auto1.marca + "\nModelo carro: "+auto1.modelo);

        Auto auto2=new Auto();
        auto2.color = "Verde";
        auto2.marca = "Ferrari";
        auto2.modelo = 2023;

        System.out.println("\nColor carro: "+auto2.color + "\nMarca carro: "+auto2.marca + "\nModelo carro: "+auto2.modelo);

    }
}
