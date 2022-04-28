package co.tallerJava.sofka.ejercicio_17;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = 5;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double preciofinal() {
        double precioBase = super.preciofinal();
        if(carga>30){
            precioBase +=30;
        }
        return precioBase;
    }


}
