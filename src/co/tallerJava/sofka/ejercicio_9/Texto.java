package co.tallerJava.sofka.ejercicio_9;

public class Texto {
    private String frase;
    private String textoAgregar;

    public Texto() {
        frase = "La sonrisa sera la mejor arma contra la tristeza";
        textoAgregar = "";

    }

    public void cambiarVocalAporVocalEenFrase(){
        this.frase = frase.replace("a","e");
    }
    public void pedirTextoAdicional(String textoAgregar){
        this.textoAgregar = textoAgregar;
    }
    public void unirTextos(){
        this.frase += " "+ this.textoAgregar;
    }
    public String mostrarFraseFinal(){
         return this.frase;
    }
}
