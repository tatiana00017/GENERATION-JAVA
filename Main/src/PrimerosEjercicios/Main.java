package PrimerosEjercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nombre
        System.out.println("Escriba su nombre");
        String nombre = sc.next();
        System.out.println("Hola "+ nombre + " ten un lindo dia ! ");

        // Edad
        System.out.println("Escriba su edad");
        int edad = sc.nextInt();
        if(edad>18){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menos de edad");
        }

        // Numero decimal
        System.out.println("Ingrese un numero decimal");
        float numero = sc.nextFloat();
        System.out.printf("Su numero decimal es: %.2f ", numero);
        System.out.println("");
        sc.nextLine();

        // Frase
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        System.out.println("Su frase es: " + frase);

        // Promedio
        int[] numeros= new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese numero " + (i+1) + ": ");
            numeros[i]= sc.nextInt();
        }
        float promedio= (numeros[0]+numeros[1]+numeros[2])/3;
        System.out.println("El promedio de los numeros es: " + promedio);

    }
}
