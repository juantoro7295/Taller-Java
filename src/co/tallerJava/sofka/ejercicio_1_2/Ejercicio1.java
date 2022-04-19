package co.tallerJava.sofka.ejercicio_1_2;

public class Ejercicio1 {
    public void variableAEsMayorB(int variableA, int variableB){
        Calcular quienEsMayor = ((x, y)-> (x>y));
        if(quienEsMayor.operacion(variableA,variableB)){
            mensaje(variableA +" es MAYOR a "+ variableB);
        }
    }
    public void variableAEsMenorB(int variableA, int variableB){
        Calcular quienEsMayor = ((x, y)-> (x<y));
        if(quienEsMayor.operacion(variableA,variableB)){
            mensaje(variableA +" es MENOR a "+ variableB);
        }
    }

    public void sonIguales(int variableA, int variableB){
        Calcular sonIguales = ((x, y)-> (x==y));
        if(sonIguales.operacion(variableA,variableB)){
            mensaje(variableA+" es IGUAL a "+ variableB);
        }
    }
    public void unificador(int variableA, int variableB){
        variableAEsMayorB(variableA,variableB);
        variableAEsMenorB(variableA,variableB);
        sonIguales(variableA,variableB);

    }

    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }


    public static void main(String[] args) {
         int variableA = 5;
         int variableB = 5;
        Ejercicio1 app = new Ejercicio1();
        app.unificador(variableA,variableB);


    }
}
