package co.tallerJava.sofka.ejercicio_4;

import java.util.Scanner;

public class Teclado {
    private double valor;

    public Teclado(){
        valor = 0;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double datosPorTeclado(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();

    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
}
