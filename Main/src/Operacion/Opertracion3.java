package Operacion;

public class Opertracion3 {
    // Metodo define las acciones que un objeto puede realizar retornan



    public int suma(int num1, int num2){
        int suma=num1+num2;
        return suma;
    }

    public int resta(int num1, int num2){
        int resta=num1-num2;
        return resta;
    }

    public int multiplicacion(int num1, int num2){
        int multiplicacion=num1*num2;
        return multiplicacion;
    }

    public int division(int num1, int num2){
        int division=num1/num2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, int division){
        System.out.println("La suma es: "+ suma +
                "\nLa resta es: "+ resta +
                "\nLa multiplicacion es: "+multiplicacion +
                "\nLa division es: "+division);
    }



}
