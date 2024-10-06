package Constructor;

public class Constructor {
    // Atributos
    String color;
    String marca;
    int modelo;

    // Decalarar el constructor
    // Dos tipos de constructor vacio y el que lleva parametros
    public Constructor(){
        // Buenas practicas
    }

    public Constructor(String color, String marca, int modelo){
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public void mostrarDatos(){
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}
