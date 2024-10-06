package Persona;

public class Persona {
    String nombre;
    int edad;
    String genero;

    public Persona(){

    }

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void saludar(){
        System.out.println("Hola yo soy: " + nombre + " y tengo "+ edad +" años y mi genero es "+ genero);
    }

    public void despedirse(){
        System.out.println(nombre + " esta dormido");
    }
}
