package Cuenta;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria(1, 2500.5, "Mariana");
        CuentaBancaria cuenta2 = new CuentaBancaria(2, 0.0, "Tatiana");
        CuentaBancaria cuenta3 = new CuentaBancaria(3, 1000, "Wualter");
        int cuenta;
        do {
            System.out.println("Bienvenido al banco Tatis \n" +
                    "\nElija la cuenta \n" +
                    "1. Cuenta 1 \n" +
                    "2. Cuenta 2 \n" +
                    "3. Cuenta 3 \n" +
                    "0. Salir");
            cuenta = sc.nextInt();
            if (cuenta == 1 || cuenta == 2 || cuenta == 3) {
                CuentaBancaria[] cuentas = {cuenta1, cuenta2, cuenta3};
                int opcion;
                do {
                    System.out.println("Ingresa la opcion que deseas \n" +
                            "1. Consultar saldo \n" +
                            "2. Consultar titular \n" +
                            "3. Modificar saldo \n" +
                            "4. Modificar titular \n" +
                            "0. Salir ");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 0:
                            System.out.println("Saliendo ...");
                            break;
                        case 1:
                            System.out.println("su saldo es: " + cuentas[cuenta - 1].getSaldo());
                            break;
                        case 2:
                            System.out.println("El titular es: " + cuentas[cuenta - 1].getTitular());
                            break;
                        case 3:
                            System.out.println("Ingresa el saldo");
                            cuentas[cuenta - 1].setSaldo(sc.nextDouble());
                            break;
                        case 4:
                            System.out.println("Ingresa el nombre del titular");
                            cuentas[cuenta - 1].setTitular(sc.next());
                            break;
                        default:
                            System.out.println("Ingresa una opcion valida");
                            break;
                    }
                } while (opcion != 0);
            } else {
                System.out.println("Cuenta invalida");
            }
        }while(cuenta != 0);
    }
}
