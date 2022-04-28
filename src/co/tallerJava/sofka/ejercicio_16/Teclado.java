package co.tallerJava.sofka.ejercicio_16;

import java.util.Scanner;

public class Teclado {
    private final Scanner scanner;

    public Teclado() {
        scanner = new Scanner(System.in);
    }

    public int pedirUnIntPorTeclado(){
        return scanner.nextInt();
    }
    public String pedirUnStringPorTeclado(){
        return scanner.next();
    }
    public double pedirUnDoublePorTeclado(){
        return scanner.nextDouble();
    }

    public void mensajePorPantalla(String mensaje){
        System.out.println(mensaje);
    }
}

