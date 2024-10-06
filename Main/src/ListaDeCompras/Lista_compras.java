package ListaDeCompras;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista_compras {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> listadecompras = new ArrayList<>();

    public void listaCompras() {
        int opcion;
        do {
            System.out.println( "Bienvenido a tu lista de compras \n" +
                    "Escribe el numero de la opcion que deseas \n" +
                    "1. Ver productos de la lista de compras \n" +
                    "2. Insertar un producto a la lista de compras \n" +
                    "3. Buscar un producto de la lista de compras \n" +
                    "4. Eliminar un producto de la lista de compras \n" +
                    "0. Salir \n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Finalizando ...");
                    break;
                case 1:
                    verLista();
                    break;
                case 2:
                    insertarProducto();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
            }
        } while (opcion != 0);
    }

    // Ver la lista
    public void verLista() {
        if (listadecompras.isEmpty()) {
            System.out.println("\nTu lista de compras esta vacia");
        } else {
            System.out.println("\nEsta es tu lista de compras: ");
            for (String item : listadecompras) {
                System.out.println("* " + item);
            }
        }
    }

    // Insertar producto a la lista
    public void insertarProducto() {
        System.out.println("Cuantos productos deseas agregar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el producto: ");
            listadecompras.add(sc.next());
        }
    }

    // Eliminar productos
    public void eliminarProducto() {
        System.out.println("Cuantos productos deseas eliminar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el producto: ");
            String producto = sc.next();
            if (listadecompras.contains(producto)) {
                listadecompras.remove(producto);
            }else{
                System.out.println(" \nEl producto no existe en tu lista de compras");
            }
        }
    }

    // Buscar producto
    public void buscarProducto() {
        System.out.println("Cuantos productos deseas buscar: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el producto: ");
            String producto = sc.next();
            if (listadecompras.contains(producto)) {
                System.out.println("\nEl producto " + producto + " si esta en la lista de compras ");
            } else {
                System.out.println("\nEl producto " + producto + " no esta en la lista de compras ");
            }
        }
    }
}
