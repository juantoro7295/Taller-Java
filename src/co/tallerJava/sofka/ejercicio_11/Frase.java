package co.tallerJava.sofka.ejercicio_11;

public class Frase {
    private String frase;
    private int longitud;
    private int cantidadVocales;

    public Frase(String frase) {
        this.frase = frase;
        longitud = 0;
        cantidadVocales = 0;
    }

    public void pedirFrase(String frase) {
        this.frase = frase.toLowerCase();
    }
    public void pedirLongitud(int longitud) {
        this.longitud = longitud;
    }
    //Nota: yo tome la longitud contando los espacios de la frase,
    // los pude haber quitado con frase.replace(" ", "");

    public int obtenerLongitudDeLaFrase(){
       return this.longitud = frase.length();
    }
    public void contieneVocal(int i){
        if(this.frase.charAt(i) == 'a' || this.frase.charAt(i) == 'e' ||
                this.frase.charAt(i) == 'i' || this.frase.charAt(i) == 'o'||this.frase.charAt(i) == 'u')
        {
            this.cantidadVocales++;
        }
    }
    public void contarCantidadVocales(){
        for(int i = 0; i< this.frase.length();i++){
            contieneVocal(i);
        }
    }

    public int obtenerCantidadVocales(){
        return this.cantidadVocales;
    }


}
