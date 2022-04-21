package co.tallerJava.sofka.ejercicio_14;

public class App14 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Numero numero = new Numero(0);

        teclado.mensaje("APLICACION QUE DE 2 EN 2, HASTA 1000");
        teclado.mensaje("Ingrese un numero: ");
        numero.pedirNumeroInicial(teclado.obtenerDatosPorTeclado());
        numero.pasarNumerode2en2(teclado);
    }
}
