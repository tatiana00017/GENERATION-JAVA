package Operacion;

import java.util.Scanner;

public class Operacion3Main {
    public static void main(String[] args) {
        Opertracion3 operaciones = new Opertracion3();

        // Lo primero es leer los datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Operacion.Operacion con dos numeros");
        System.out.println("\nIngrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();


        // Mostrar resultados
        int suma =operaciones.suma(a, b);
        int resta = operaciones.resta(a, b);
        int multiplicacion = operaciones.multiplicacion(a, b);
        int division = operaciones.division(a, b);
        operaciones.mostrarResultados(suma,resta,multiplicacion,division);

    }
}
