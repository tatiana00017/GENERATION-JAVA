package NumeroMayor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba numero 1");
        int a = sc.nextInt();
        System.out.println("Escriba numero 2");
        int b = sc.nextInt();

        if (a>25 && b>25) {
            System.out.println("Ambos numeros son mayor que 25");
        } else if (a>25 || b>25) {
            System.out.println("Un numero es mayor que 25");
        } else {
            System.out.println("Ningun numero es mayor que 25");
        }





    }
}
