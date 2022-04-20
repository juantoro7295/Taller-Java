package co.tallerJava.sofka.ejercicio_7;




public class NumeroMayor {

    private int valorAComparar;
    private boolean continuar;


    public NumeroMayor(int valorAComparar) {
        this.valorAComparar = valorAComparar;
        continuar = false;

    }
    public boolean verificarMayorIgualCero(){
        if(this.valorAComparar>=0){
            System.out.println("El numero: "+this.valorAComparar+" es MAYOR o IGUAL a CERO, Cumple la condicion");
            return this.continuar = true;
        }
        System.out.println("El numero: "+this.valorAComparar+" Es MENOR a CERO , No cumple condicion");
        return this.continuar = false;
    }

    public void unificador( Teclado teclado){
        do {
            System.out.println("Ingresa Un Numero: ");
            this.valorAComparar = teclado.obtenerDatosPorTeclado();
        }while(!verificarMayorIgualCero());
    }


}
