package co.tallerJava.sofka.ejercicio_7;

import java.util.Scanner;

public class Teclado {
    private final Scanner scanner;

public Teclado(){
    scanner = new Scanner(System.in);
}

public void mensaje(String mensaje){
    System.out.println(mensaje);
}

public int obtenerDatosPorTeclado(){
    return scanner.nextInt();
}




}
