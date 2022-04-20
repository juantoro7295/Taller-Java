package co.tallerJava.sofka.ejercicio_8;

import java.util.Scanner;

public class Teclado {

    private final Scanner scanner;

    public Teclado(){
        scanner = new Scanner(System.in);
    }

    public String perdirDatosPorTeclado(){
        return scanner.next();
    }

    public void mensaje(){
        System.out.println("VERICAR DIA LABORAL");
        System.out.println("Ingrese un dia de la semana: ");
    }
    public void mensajeEsDiaLaboral(String mensaje){
        System.out.println("El "+ mensaje +" Es un dia laboral");

    }
    public void mensajeDiaNoLaboral(String mensaje){
        System.out.println("El "+ mensaje +" No es un dia laboral");

    }
}
