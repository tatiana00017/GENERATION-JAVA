package Exepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Tipos de excepciones:
// Verificadas
// Protege nuestra aplicacion de errores externos
// No Verificados
// Señalan los errores en el codigo
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // Archivo de texto
//        try {
//            File file = new File("E://file.txt");
//            FileReader fr = new FileReader(file);
//        } catch (Exception e) {
//            System.out.println("no se encontro el archivo");
//        }
//        System.out.println("Esto deberia pasar despues de abrir archivo");


        try {
            int dividir = 5 / 0;
            System.out.println("total " + dividir);
        } catch (Exception e) {
            System.out.println("no se puede dividir entre 0");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }

//        int[] numeros = {1, 2, 3};
//        System.out.println("El numeros es: " + numeros[5]);


    }
}
