package co.tallerJava.sofka.ejercicio_10;

public class Frase {
    private String frase;

    public Frase(){
        this.frase = "";
    }

    public  void pedirLaCadena(String frase){
        this.frase = frase;
    }
    public void quitarEspacioCadena(){
        this.frase = frase.replace(" ", "");
    }

    public String mostrarCadena(){
        return this.frase;
    }

}
