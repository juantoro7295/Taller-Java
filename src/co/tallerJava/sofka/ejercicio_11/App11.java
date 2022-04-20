package co.tallerJava.sofka.ejercicio_11;

public class App11 {
    public static void main(String[] args) {
        Frase frase = new Frase("");
        Teclado teclado = new Teclado();

        teclado.mensaje("APLICACION PARA CALCULAR LONGITUD Y CANTIDAD DE VOCALES DE UNA CADENA");
        teclado.mensaje("ingrese cadena: ");
        frase.pedirFrase(teclado.pedirDatosPorTeclado());
        frase.contarCantidadVocales();
        teclado.mensaje("La longitud de la frase es: "+ frase.obtenerLongitudDeLaFrase());
        teclado.mensaje("La frase contiene "+frase.obtenerCantidadVocales()+" vocales");

    }
}
