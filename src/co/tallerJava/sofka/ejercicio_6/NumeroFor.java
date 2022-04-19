package co.tallerJava.sofka.ejercicio_6;

public class NumeroFor  {
    private int contador;
    private final int numeroObjetivo;

    public NumeroFor(){
        contador = 0;

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
    public void unificador(){
        for(int i=0; i<numeroObjetivo; i++){
            contador++;
            esPar();
            esImpar();
        }
    }
}
