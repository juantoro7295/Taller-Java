package co.tallerJava.sofka.ejercicio_3;

import java.util.Scanner;

public class EntradaDeDatos {

    private double valorDeEntrada;

    public EntradaDeDatos() {
        valorDeEntrada = 0;
    }

    public double getValorDeEntrada() {
        return valorDeEntrada;
    }

    public void setValorDeEntrada(double valorDeEntrada) {
        this.valorDeEntrada = valorDeEntrada;
    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

    public double datosPorTeclado(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();

    }
}
