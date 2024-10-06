package Taller1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercicio 1
//        System.out.println("Cual es la calificacion del estudiante");
//        int calificacion = sc.nextInt();
//        System.out.println("Cual fue la asistencia del estudiante de 1 a 100");
//        int asistecia = sc.nextInt();
//        if (calificacion >= 60 || asistecia >= 80 ) {
//            System.out.println("Aprobado");
//        } else {
//            System.out.println("Reprobado");
//        }

        // Ejercicio 2

//        System.out.println("Cual es su edad");
//        int edad = sc.nextInt();
//        if (edad >= 18){
//            System.out.println("Usted es un adulto");
//        } else if (edad <= 17 && edad >= 13) {
//            System.out.println("Usted es un adolescente");
//        } else {
//            System.out.println("Usted es un niño");
//        }

        // Ejercicio 3

//        System.out.println("Cual es su edad");
//        int edad1 = sc.nextInt();
//        if (edad1 >= 18){
//            System.out.println("Cual es su salario al año");
//            int salario = sc.nextInt();
//            if (salario > 40000){
//                System.out.println("Usted debe pagar impuestos");
//            } else {
//                System.out.println("Usted no debe pagar impuestos");
//            }
//        } else {
//            System.out.println("Usted no debe pagar impuestos");
//        }

        // Ejercicio 4

//        System.out.println("Ingrese su contraseña");
//        String contraseña = sc.next();
//        if (contraseña.length() <= 8 && contraseña.matches(".*\\d.*") ) {
//            System.out.println("Contraseña valida");
//        } else {
//            System.out.println("Contraseña invalida");
//        }

        // Ejercicio 5

        System.out.println("Cual es tu edad");
        int edad2 = sc.nextInt();
        String miembro = null;
        String invitado = null;
        if (edad2 > 18) {
            System.out.println("Es usted miembro si/no");
            miembro = sc.next();
            if (miembro.equals("no")) {
                System.out.println("Es usted invitado por un miembro si/no");
                invitado = sc.next();
            }
            if (miembro.equals("si") || invitado.equals("si")) {
                System.out.println("Puede acceder al evento");
            } else {
                System.out.println("No puede acceder al evento");
            }
        } else {
            System.out.println("No puede acceder al evento");
        }
    }
}
