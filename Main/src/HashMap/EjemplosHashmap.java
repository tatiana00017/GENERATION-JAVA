package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjemplosHashmap {
    public void ejercicio(){
        System.out.println("\nHola , sea Bienvenido a la fruteria :v");
        // Definimos nuestro map
        Map<String, Double> inventario = new HashMap<>();

        inventario.put("Manzana", 1.40);
        inventario.put("Pera", 2.40);
        inventario.put("Uvas", 3.40);
        inventario.put("Bananos", 4.40);

        // Queremos que se vea bonito y le vamos a agregar un $

        System.out.println("\nInventario de frutas: ");
        // Quiero ver tanto keys como valor
        // KeySet() Arreglo con las llaves
        for (String fruta : inventario.keySet()) {
            // Quiero agregar el valor de cada una de esas claves
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }

        String frutaCliente = "Manzana";
        System.out.println("El cliente pide "+ frutaCliente );
        if (inventario.containsKey(frutaCliente)) {
            System.out.println("Si tenemos "+frutaCliente+" en el inventario");
        } else {
            System.out.println("Hoy no hay, vuelva a intentarlo mañana");
        }

        // Nuestro cliente si compro
        System.out.println("Compra realizada :v");
        // Eliminar la fruta vendida
        inventario.remove(frutaCliente);
        System.out.println("Ya se agoto Manzana");

        // Revisar que tenemos
        System.out.println("\nInventario actualizado: ");
        for (String fruta : inventario.keySet()) {
            System.out.println(fruta + ": $" + inventario.get(fruta));
        }
        System.out.println("\n La cantidad de frutas que tengo es: " + inventario.size());


    }
    Scanner sc = new Scanner(System.in);
    Map<String, String> biblioteca = new HashMap<>();
    public void ejercicio2(){
        int opcion;
        do {
            System.out.println("Bienvenido a la Biblioteca \n" +
                    "Ingresa la opcion que deseas \n" +
                    "1. Ver todos los libros \n" +
                    "2. Agregar libros \n" +
                    "3. Buscar libros \n" +
                    "4. Eliminar libros");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Gracias por visitar la biblioteca, vuelva pronto");
                    break;
                case 1:
                    verLibros();
                    break;
                case 2:
                    agregarLibros();
                    break;
                case 3:
                    buscarLibros();
                    break;
                case 4:
                    eliminarLibros();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }


        }while(opcion != 0);

    }

    public void verLibros(){
        if (biblioteca.isEmpty()) {
            System.out.println("No hay libros");
        }else {
            System.out.println("Estos son los libros: ");
            for (String libro : biblioteca.keySet()) {
                System.out.println("Nombre libro: "+ libro + " - Autor: " + biblioteca.get(libro));
            }
        }
    }

    public void agregarLibros(){
        System.out.println("Cuantos libros deseas agregar: ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe nombre del libro");
            String nombre=sc.nextLine();

            System.out.println("Escribe autor del libro");
            String autor=sc.nextLine();
            biblioteca.put(nombre, autor);
        }
    }

    public void buscarLibros(){
        String buscar=sc.next();
        if (biblioteca.containsKey(buscar)) {
            System.out.println("El libro "+ buscar +" esta en la biblioteca");
        } else {
            System.out.println("El libro "+ buscar +" no esta en la biblioteca");
        }
    }

    public void eliminarLibros(){
        System.out.println("Cuantos libros deseas eliminar: ");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Escribe nombre del libro que deseas eliminar: ");
            String eliminar=sc.nextLine();
            if (biblioteca.containsKey(eliminar)) {
                biblioteca.remove(eliminar);
                System.out.println("El libro "+ eliminar +" esta eliminado");
            }else {
                System.out.println("El libro "+ eliminar +" no esta en la biblioteca");
            }
        }
    }
}
