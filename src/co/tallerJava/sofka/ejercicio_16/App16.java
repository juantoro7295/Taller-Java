package co.tallerJava.sofka.ejercicio_16;

public class App16 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();

        teclado.mensajePorPantalla("Ingrese Nombre: ");
        String nombre = teclado.pedirUnStringPorTeclado();

        teclado.mensajePorPantalla("Ingrese Edad, Ej: 19");
        int edad = teclado.pedirUnIntPorTeclado();

        teclado.mensajePorPantalla("Ingrese sexo, Opciones (H o M)");
        String sexo = teclado.pedirUnStringPorTeclado();

        teclado.mensajePorPantalla("Ingrese su peso, Ej: 75");
        double peso = teclado.pedirUnDoublePorTeclado();

        teclado.mensajePorPantalla("Ingrese su altura, Ej: 1,75");
        double altura = teclado.pedirUnDoublePorTeclado();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(18);
        persona3.setSexo("H");
        persona3.setPeso(70);
        persona3.setAltura(1.80);

        teclado.mensajePorPantalla("---------------------------------");

        persona1.mensajeRespuestaPesoIdeal();
        persona1.mensajeRespuestaEsMayorDeEdad();
        teclado.mensajePorPantalla(persona1.toString());

        teclado.mensajePorPantalla("---------------------------------");

        persona2.mensajeRespuestaPesoIdeal();
        persona2.mensajeRespuestaEsMayorDeEdad();
        teclado.mensajePorPantalla(persona2.toString());

        teclado.mensajePorPantalla("---------------------------------");

        persona3.mensajeRespuestaPesoIdeal();
        persona3.mensajeRespuestaEsMayorDeEdad();
        teclado.mensajePorPantalla(persona3.toString());




    }
}
