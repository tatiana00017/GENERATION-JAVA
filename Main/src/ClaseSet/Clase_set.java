package ClaseSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Clase_set {
    public void ejercicio1(){

        //Asistencia

        System.out.println("Bienvenidos a la clase");
        Set<String> nombresEstudiantes = new HashSet<>();
        nombresEstudiantes.add("Jesneth");
        nombresEstudiantes.add("Carla");
        nombresEstudiantes.add("Andres");
        nombresEstudiantes.add("Jhonatan");
        nombresEstudiantes.add("Sergio");
        nombresEstudiantes.add("JuanPa");

        if(nombresEstudiantes.contains("Sergio")){
            System.out.println("\nSi asistio sergio a la clase");
        } else {
            System.out.println("\nNo asistio sergio a la clase");
        }

        // Luego llego Ana
        nombresEstudiantes.add("Ana");

        // Pero Jesneth se fue
        nombresEstudiantes.remove("Jesneth");

        // Si no estuviera
        if (nombresEstudiantes.contains("Jesneth")){
            System.out.println("\nJesneth si esta");
        } else {
            System.out.println("\nJesneth capo clase");
        }

        // Pero siguen llegando tarde
        nombresEstudiantes.add("Rafa");

        if (nombresEstudiantes.isEmpty()){
            System.out.println("\nNo hay nadie en clase");
        } else {
            System.out.println("\nAun hay "+ nombresEstudiantes.size()+" estudiantes en la clase");
        }

        System.out.println("Quien esta aun en clase: ");
        for (Object nombre : nombresEstudiantes ) {
            System.out.println(nombre);
        }
    }

//    Ejercicio:
//    Escribe un programa que lea una lista de números enteros desde el teclado y
//    elimine los duplicados, mostrando únicamente los números únicos.

    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        System.out.println("Cuantos numeros deseas agregar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa numero "+(i+1));
            numeros.add(sc.nextInt());
        }
        System.out.println("\n La lista de numeros es:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
