package co.tallerJava.sofka.ejercicio_17;

public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;


    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarColor(color);
        this.consumoEnergetico = consumoEnergetico;
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(char letra) {
        char[] letrasCorrectas = {'A', 'B', 'C', 'D', 'E', 'F'};
        boolean letraEncontrada = false;
        for (char l : letrasCorrectas) {
            if (letra == l) {
                letraEncontrada = true;
            }
        }
        if (!letraEncontrada) {
            this.consumoEnergetico = 'F';
        }
    }

    public void comprobarColor(String color) {
        String[] colores = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorEncontrado = false;
        for (String c : colores) {
            if (c == color.toLowerCase()) {
                colorEncontrado = true;
            }
            if (!colorEncontrado) {
                this.color = "blanco";
            }
        }
    }

    public void precioSegunConsumoEnergetico() {
        switch (this.consumoEnergetico) {
            case 'A':
                this.precioBase += 100;
                break;
            case 'B':
                this.precioBase += 80;
                break;
            case 'C':
                this.precioBase += 60;
                break;
            case 'D':
                this.precioBase += 50;
                break;
            case 'E':
                this.precioBase += 30;
                break;
            case 'F':
                this.precioBase += 10;
                break;
            default:
                System.out.println("No se encontro el consumo");
                break;

        }
    }

    public void precioPorPeso() {
        if (this.peso >= 0 && this.peso < 20) {
            this.precioBase += 10;
        }
        if (this.peso >= 20 && this.peso < 49) {
            this.precioBase += 50;
        }
        if (this.peso >= 50 && this.peso < 79) {
            this.precioBase += 80;
        }
        if (this.peso >= 80) {
            this.precioBase += 100;

        }
    }

    public double preciofinal(){
        precioSegunConsumoEnergetico();
        precioPorPeso();
        return this.precioBase;
    }


}
