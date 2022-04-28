package co.tallerJava.sofka.ejercicio_17;

public class Television extends Electrodomestico {
    private double resolucion;
    private boolean sintonizadorTDT;


    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double preciofinal() {
        double precioBase = super.preciofinal();
        if(resolucion>40){
            precioBase += precioBase *1.30;
        }
        if(Boolean.TRUE.equals(sintonizadorTDT)){
            precioBase += 50;
        }
        return precioBase;
    }
}
