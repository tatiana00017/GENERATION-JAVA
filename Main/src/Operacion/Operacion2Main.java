package Operacion;

import java.util.Scanner;

public class Operacion2Main {
    public static void main(String[] args) {
        Operacion2 operaciones = new Operacion2();

        // Lo primero es leer los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Operacion.Operacion con dos numeros");
        System.out.println("\nIngrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        // llamar a los metodos
        operaciones.suma(a, b);
        operaciones.resta(a, b);
        operaciones.multiplicacion(a, b);
        operaciones.division(a, b);

        // Mostrar resultados
        operaciones.mostrarResultados();
    }
}
