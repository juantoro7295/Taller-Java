package co.tallerJava.sofka.ejercicio_10;

import java.util.Scanner;

public class Teclado {
    private final Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public String pedirDatosPorTeclado(){
        return scanner.nextLine();
    }

    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }

}
