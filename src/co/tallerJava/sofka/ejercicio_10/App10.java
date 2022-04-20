package co.tallerJava.sofka.ejercicio_10;

public class App10 {
    public static void main(String[] args) {
        Frase frase = new Frase();
        Teclado teclado = new Teclado();

        teclado.mensaje("QUITAR ESPACIOS DE UNA CADENA");
        teclado.mensaje("Ingrese la cadena: ");
        frase.pedirLaCadena(teclado.pedirDatosPorTeclado());
        frase.quitarEspacioCadena();
        teclado.mensaje("RESULTADO: ");
        teclado.mensaje(frase.mostrarCadena());
    }
}
