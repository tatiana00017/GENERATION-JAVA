package TallerFunciones;

import java.util.Scanner;

public class Taller_funciones {

    public void Calculadora(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" ");
            System.out.println("Escribe numero 1");
            int a = sc.nextInt();
            System.out.println("Escribe numero 2");
            int b = sc.nextInt();
            System.out.println("Bienvenido a la calculadora \n" +
                    "1. Suma \n" +
                    "2. Resta \n" +
                    "3. Mulriplicacion \n" +
                    "4. Division \n" +
                    "5. Potencia \n" +
                    "0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar la calculadora");
                    break;
                case 1:
                    System.out.println("El resultado de la suma de " + a + " + " + b + " es " + Suma(a, b));
                    break;
                case 2:
                    System.out.println("El resultado de la resta de " + a + " - " + b + " es " + Resta(a, b));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion de " + a + " x " + b + " es " + Mulriplicacion(a, b));
                    break;
                case 4:
                    if(a==0 || b==0){
                        System.out.println("No se puede realizar division con 0");
                    } else {
                        System.out.println("El resultado de la division de " + a + " / " + b + " es " + Division(a, b));
                    }
                    break;
                case 5:
                    System.out.println("El resultado de la potencia de " + a + " ^ " + b + " es " + Potencia(a, b));
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 0);
    }

    public int Suma (int a, int b){
        int result = a + b;
        return result;
    }

    public int Resta (int a, int b){
        int result = a - b;
        return result;
    }

    public int Mulriplicacion (int a, int b){
        int result = a * b;
        return result;
    }

    public float Division (int a, int b){
        float result = (float) a/b;
        return result;
    }

    public float Potencia (int a, int b){
        float result = (float) Math.pow(a, b);
        return result;
    }
}
