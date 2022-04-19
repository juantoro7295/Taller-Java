package co.tallerJava.sofka.ejercicio_5;

public class NumeroWhile {
    private int contador;
    private boolean condicion;
    private final int numeroObjetivo;

    public NumeroWhile(){
        contador = 0;
        condicion = true;
        numeroObjetivo = 100;
    }

    public void mensaje(int contador, String tipo){
        System.out.println("Numero "+tipo+": "+contador);
    }
    public void esPar(){
        if(contador%2 == 0){
            mensaje(contador,"par");
        }

    }
    public void esImpar(){
        if(contador%2 != 0){
            mensaje(contador, "impar");
        }

    }
    public void verificarNumeroObjetivo(){
        if(contador ==  numeroObjetivo){
            condicion = false;
        }
    }
   public void unificador(){
       while (condicion){
           contador++;
           esPar();
           esImpar();
           verificarNumeroObjetivo();
       }
   }
}
