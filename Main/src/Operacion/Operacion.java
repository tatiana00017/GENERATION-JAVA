package Operacion;

import java.util.Scanner;

public class Operacion {
    // Metodo define las acciones que un objeto puede realizar
    // mosdificadordeacceso tipoderetorno nombredelmetodo()

    // Vamos a crear un programa que pida dos numeros y realice operaciones

    // Atributos:

    int num1;
    int num2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Metodos
    // Pedir numeros:

    public void pedirNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Operacion.Operacion con dos numeros");
        System.out.println("\nIngrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
    }

    public void suma(){
        suma=num1+num2;
    }

    public void resta(){
        resta=num1-num2;
    }

    public void multiplicacion(){
        multiplicacion=num1*num2;
    }

    public void division(){
        division=num1/num2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+ suma +
        "\nLa resta es: "+ resta +
        "\nLa multiplicacion es: "+multiplicacion +
        "\nLa division es: "+division);
    }


}
