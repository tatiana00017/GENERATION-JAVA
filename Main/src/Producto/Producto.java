package Producto;

import java.util.Scanner;

public class Producto {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private String codigoBarras;
    private int precioUnitario;
    private int cantidadStock;

    Producto (){
    }

    Producto (String nombre, String codigoBarras, int precioUnitario, int cantidadStock){
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public void obtenerNombre(){
        System.out.println("Nombre: "+ nombre);
    }

    public void obtenerCodigoBarras(){
        System.out.println("CodigoBarras: "+ codigoBarras);
    }

    public void obtenerPrecioUnitario(){
        System.out.println("Precio Unitario: "+ precioUnitario);
    }

    public void obtenerCantidadStock(){
        System.out.println("Cantidad Stock: "+ cantidadStock);
    }

    public void agregarStock(int cantidad){
        cantidadStock += cantidad;
        }

    public void vender(){

    }
}





