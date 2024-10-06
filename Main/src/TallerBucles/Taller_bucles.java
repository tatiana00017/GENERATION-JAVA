package TallerBucles;

import java.util.Random;
import java.util.Scanner;

public class Taller_bucles {
    public void ejercicio1(){
        int count=1;
        int suma=0;
        while(count<=100){

            suma =suma+count;
            count++;
        }
        System.out.println(count);
        System.out.println(suma);
    }

    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int count=1;
        do{
            System.out.println(count + " x " + num + " = " + (num*count));

            count++;
        }
        while(count <=10);
    }

    public void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 2 || num==1) {
            System.out.println("El numero " + num + " no es primo ");
        } else {
            System.out.println("El numero " + num + " es primo ");
        }
    }

    public void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        int saldo=0;
        int num=0;
        do{
            System.out.println("Ingrese la opcion que desea \n" +
                    "1. Consultar saldo \n" +
                    "2. Retirar \n" +
                    "3. Depositar \n" +
                    "0. Salir");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Su saldo es: " + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar :");
                    int num2 = sc.nextInt();
                    if(num2>saldo){
                        System.out.println("No puede retirar este valor, consulte su saldo");
                    }else {
                        saldo = saldo-num2;
                    }
                    break;
                case 3:
                    System.out.println("Cuanto desea depositar : ");
                    int num3 = sc.nextInt();
                    saldo = saldo+num3;

            }

        }while(num!=0);
    }

    public void ejercicio5(){
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()";
        StringBuilder contrasena = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {

            contrasena.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
            contrasena.append(minusculas.charAt(random.nextInt(minusculas.length())));
            contrasena.append(numeros.charAt(random.nextInt(numeros.length())));
            contrasena.append(especiales.charAt(random.nextInt(especiales.length())));
        }
        System.out.println("Contraseña generada: " + contrasena.toString());
    }

    public void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(10);
        int num1= 11;
        while(num1 != num){
            System.out.println("Adivina el numero \n" +
                    "Ingrese un numero");
            num1 = sc.nextInt();
        }
        System.out.println("Felicidades adivinaste el numero " + num);
    }




}
