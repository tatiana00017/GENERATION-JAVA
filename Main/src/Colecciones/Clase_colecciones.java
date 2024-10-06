package Colecciones;//    operaciones basicas:
//    Agregar
//    Eliminar
//    Recorrer

import java.util.ArrayList;
import java.util.Scanner;

public class Clase_colecciones {
    public static void main(String[] args) {
        System.out.println("Vamos a ver colecciones");

        // Arrays: Una lista de elementos del mismo tipo

        int[] numeros = new int[3];

        numeros[0]= 10;
        numeros[1]= 20;
        numeros[2]= 40;

        // ArrayList, Linkdlist, Stack
        // Listas: Conjunto de elementos relacionados entre si
        // arrayList: Es la implementacion dimanica de una lista.
        // List<String> frutas = new ArrayList<>();

        ArrayList<String> frutas = new ArrayList<>();

        // Agregar elementos: add
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Pera");
        System.out.println(frutas);

        // Insertar elemento en una posicion en una posicion especifica
        frutas.add(1,"Uva");
        System.out.println(frutas);

        // Eliminar un elemento por su valro
        frutas.remove("Pera");
        System.out.println(frutas);

        // Obtener el valor por su indice
        System.out.println(frutas.get(2));

        // Otro tipo de operaciones
        // size() Devuelve el tamaño
        // contains() Verifica si la lista contiene un elemento
        // indexOf() Devuelve el primer elemento encontrado, si no esta devuelve -1
        // clear() Elimina todos los elementos

        //Buscar un elemento en la lista
        boolean tieneOno = frutas.contains("Uva");
        System.out.println(tieneOno);

        // Cuando usar cada uno:
        // Arrays
        // Se conoce el tamaño exacto
        // Cuando no se requieran muchas operaciones de add y remove

    }

    public void ejemplo2(){
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre, si quieres salir escriba fin");
        //nombres.add(sc.nextLine());
        String nombre ;
        while(!(nombre = sc.nextLine()).equals("fin")){
            nombres.add(nombre);
        }

        // Buscar un nombre
        System.out.println("\nIngrese un nombre a buscar");
        String buscar = sc.nextLine();
        if(nombres.contains(buscar)){
            System.out.println("El nombre es: "+ nombre + " si esta");
        } else {
            System.out.println("El nombre es: "+ nombre + " no esta");
        }

        // Eliminar nombre
        System.out.println("\nIngrese un nombre a eliminar");
        String eliminar = sc.nextLine();
        if(nombres.remove(eliminar)){
            System.out.println("Se elimino el nombre: "+ nombre );
        } else {
            System.out.println("El nombre es: "+ nombre + " no esta");
        }

        // Ver mi lista acrualizada
        System.out.println(" \n La lista es");

        //for each
//        for (int i = 0; i < nombres.lenght; i++) {
//            System.out.println(nombres.get(i));
//        }
        for (String n : nombres) {
            System.out.println(n);
        }



    }


}
