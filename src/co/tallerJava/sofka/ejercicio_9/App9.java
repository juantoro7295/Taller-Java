package co.tallerJava.sofka.ejercicio_9;

public class App9 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Texto texto = new Texto();

        texto.cambiarVocalAporVocalEenFrase();
        teclado.mensaje("Ingrese el texto que le desea agregar a la frase: ");
        texto.pedirTextoAdicional(teclado.pedirDatosPorTeclado());
        texto.unirTextos();
        teclado.mensaje("LA FRASE ES LA SIGUIENTE: ");
        teclado.mensaje(texto.mostrarFraseFinal());

    }
}
