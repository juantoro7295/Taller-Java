package co.tallerJava.sofka.ejercicio_1_2;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 extends Ejercicio1{



    @Override
    public void unificador(int variableA, int variableB) {
        super.unificador(variableA, variableB);
    }

    @Override
    public void mensaje(String mensaje) {
        super.mensaje(mensaje);
    }

    public int pedirPorTecladoVaribleA(){
        Scanner scanner = new Scanner(System.in);
        mensaje("ingrese el valor de la variable A: ");
        return scanner.nextInt();
    }
    public int pedirPorTecladoVariableB(){
        Scanner scanner = new Scanner(System.in);
        mensaje("ingrese el valor de la variable B: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Ejercicio2 app = new Ejercicio2();
        app.unificador(app.pedirPorTecladoVaribleA(), app.pedirPorTecladoVariableB());
    }
}


