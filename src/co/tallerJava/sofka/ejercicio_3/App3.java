package co.tallerJava.sofka.ejercicio_3;

public class App3 {
    public static void main(String[] args) {
        Circulo Circulo = new Circulo();
        EntradaDeDatos entradaDeDatos = new EntradaDeDatos();

        entradaDeDatos.mensaje("ingrese el radio del circulo: ");
        Circulo.setRadio(entradaDeDatos.datosPorTeclado());

       entradaDeDatos.mensaje("El area del circulo es: "+Double.toString(Circulo.calcularAreaCirculo(Circulo.getRadio())));
    }
}
