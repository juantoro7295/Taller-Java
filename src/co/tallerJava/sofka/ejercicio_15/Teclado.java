package co.tallerJava.sofka.ejercicio_15;

import java.util.Scanner;

public class Teclado {
    private final Scanner scanner;

    public Teclado(){
        scanner = new Scanner(System.in);
    }
    public int pedirDatosPorTeclado(){
        return scanner.nextInt();
    }
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

}
