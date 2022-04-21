package co.tallerJava.sofka.ejercicio_14;

public class Numero {

    private static final int VALORFIJO = 1000;
    private int numeroInicial;
    public Numero(int numeroInicial) {
        this.numeroInicial = numeroInicial;
    }
    public void pedirNumeroInicial(int numeroInicial){
        this.numeroInicial = numeroInicial;
    }
    public void pasarNumerode2en2(Teclado teclado){
        for (int i = this.numeroInicial; i <=VALORFIJO;i+=2){
          teclado.mensaje("numero: "+i);
        }
    }

}
