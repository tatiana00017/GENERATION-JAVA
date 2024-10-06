package Taller;

import java.util.Arrays;
import java.util.Scanner;

public class Taller {
    public void ejercicio_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celsius ");
        float gradosC= sc.nextFloat();
        float gradosF= (float) (gradosC*9/5)+32;
        float gradosK= (float) (gradosC+273.15);

        System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit y %.2f grados Kelvin%n", gradosC, gradosF, gradosK);
    }

    public void ejercicio_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero 1");
        float num1 = sc.nextInt();
        System.out.println("Ingrese numero 2");
        float num2 = sc.nextInt();

        System.out.println("Ingrese solo el numero de la operacion que desea \n" +
                "1. Suma \n" +
                "2. Resta \n" +
                "3. Multiplicacion \n" +
                "4. Division"
        );
        int num = sc.nextInt();
        float result;
        switch(num){
            case 1:
                result = (num1+num2);
                System.out.println("El resultado de la suma es " + result);
                break;
            case 2:
                result = (num1-num2);
                System.out.println("El resultado de la resta es " + result);
                break;
            case 3:
                result = (num1*num2);
                System.out.println("El resultado de la multiplicacion es " + result);
                break;
            case 4:
                result = (num1/num2);
                if (num2==0){
                    System.out.println("No se puede dividir por 0");
                } else {
                    System.out.println("El resultado de la division es " + result);
                }
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }

    public void ejercicio_3(){
        Scanner sc = new Scanner(System.in);
        int[] numeros= new int[3];
        for (int i=0; i<3; i++){
            System.out.println("Ingrese el numero " + (i+1));
            numeros[i] = sc.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("El numero mayor es " + numeros[2] + " y el numero menor es " + numeros[0]);
    }

    public void ejercicio_4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese longitud a del triangulo");
        float a = sc.nextFloat();
        System.out.println("Ingrese la longitud b del triangulo");
        float b = sc.nextFloat();
        System.out.println("Ingrese la longitud c del triangulo");
        float c = sc.nextFloat();

        if((a+b)<=c || (b+c)<=a || (c+a)<= b){
            System.out.println("El triangulo es ivalido");
        } else if (a==b && b==c){
            System.out.println("El triangulo es equilatero");
        } else if (a==b || b==c) {
            System.out.println("El triangulo es isosceles");
        } else if (a!=b && a!=c && b!=c) {
            System.out.println("El triangulo es escaleno");
        }
    }

    public void ejercicio_5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un año");
        int num= sc.nextInt();
        if (num%4==0){
            System.out.println("El año " + num + " es biciesto");
        } else {
            System.out.println("El año " + num + " no es biciesto");
        }
    }

    public void ejercicio_6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su peso en kilogramos");
        float peso= sc.nextFloat();
        System.out.println("Ingrese su altura en metros");
        float altura= sc.nextFloat();
        float imc = peso/(altura*altura);
        if (imc<18.5){
            System.out.println("Esta usted delgado");
        } else if (imc < 25) {
            System.out.println("Esta usted en el peso ideal");
        } else if (imc < 30) {
            System.out.println("Esta usted en sobrepeso");
        } else if (imc < 35) {
            System.out.println("Esta usted en obesidad leve");
        } else if(imc < 40 ){
            System.out.println("Esta usted en obesidad media");
        } else {
            System.out.println("Esta usted en obesidad alta");
        }
    }
}
