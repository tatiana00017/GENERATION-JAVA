package Operacion;

public class OperacionMain {
    public static void main(String[] args) {
        Operacion operaciones = new Operacion();

        // Lo primero es leer los datos
        operaciones.pedirNumeros();

        // llamar a los metodos
        operaciones.suma();
        operaciones.resta();
        operaciones.multiplicacion();
        operaciones.division();

        // Mostrar resultados
        operaciones.mostrarResultados();
    }
}
