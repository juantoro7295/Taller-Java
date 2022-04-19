package co.tallerJava.sofka.ejercicio_4;


public class Producto {
    private double precio;
    private static final double IVA = 0.21;

    public Producto() {
        precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double calcularPrecioConIva(double precio){
        Calculo productoIva = ( x-> x=x+(x*IVA));
        return productoIva.impuesto(precio);
    }
}
