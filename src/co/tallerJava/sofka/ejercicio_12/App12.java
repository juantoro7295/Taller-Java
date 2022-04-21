package co.tallerJava.sofka.ejercicio_12;

public class App12 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Palabra palabra = new Palabra("","",false);

        teclado.mensaje("APLICACION PALABRAS IGUALES O DIFRENTES");
        teclado.mensaje("Ingrese la primera palabra: ");
        palabra.pedirPalabra1(teclado.pedirPalabraPorTeclado());
        teclado.mensaje("Ingrese la segunda palabra: ");
        palabra.pedirPalabra2(teclado.pedirPalabraPorTeclado());
        palabra.unificador(teclado);
        




    }
}
