package gettersySetters;
import java.util.*;
import java.util.Scanner;
//Getters y Setters
// Un metodo especial
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante("Tatis", "Campos" , 1);
        // despues de crear los stters y setters puedo empezar a traer o mosificcar datos
        System.out.println("El nombre del estudiante es: " + estudiante2.getNombre());
        System.out.println("El apellido es : " + estudiante2.getApellido());
        System.out.println("El ccodigo es: " + estudiante2.getCodigo());

        System.out.println("Ingrese nombre del estudiante 1");
        estudiante1.setNombre(sc.nextLine());
        System.out.println("Ingrese apellido del estudiante 1");
        estudiante1.setApellido(sc.nextLine());
        System.out.println("Ingrese codigo del estudiante 1");
        estudiante1.setCodigo(sc.nextInt());

        System.out.println("El nombre de estudiante 1 es: " + estudiante1.getNombre());
        System.out.println("El apellido es : " + estudiante1.getApellido());
        System.out.println("El ccodigo es: " + estudiante1.getCodigo());

    }
}
