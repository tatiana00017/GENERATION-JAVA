package Operacion;

public class Operacion2 {
    // Metodo define las acciones que un objeto puede realizar
    // mosdificadordeacceso tipoderetorno nombredelmetodo()

    // Vamos a crear un programa que pida dos numeros y realice operaciones

    // Atributos:
    int suma;
    int resta;
    int multiplicacion;
    int division;


    // Metodos
    // Pedir numeros:



    public void suma(int num1, int num2){
        suma=num1+num2;
    }

    public void resta(int num1, int num2){
        resta=num1-num2;
    }

    public void multiplicacion(int num1, int num2){
        multiplicacion=num1*num2;
    }

    public void division(int num1, int num2){
        division=num1/num2;
    }

    public void mostrarResultados(){
        System.out.println("La suma es: "+ suma +
                "\nLa resta es: "+ resta +
                "\nLa multiplicacion es: "+multiplicacion +
                "\nLa division es: "+division);
    }


}
