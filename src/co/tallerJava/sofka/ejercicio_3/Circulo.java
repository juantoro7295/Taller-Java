package co.tallerJava.sofka.ejercicio_3;

public class Circulo {
    private double radio;
    private static final double PI = Math.PI;


    public Circulo() {
        radio = 0;


    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularAreaCirculo(double radio){
        Calcular circulo = (r -> PI*Math.pow(r,2));
        return circulo.area(radio);
    }



}
