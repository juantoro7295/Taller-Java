package co.tallerJava.sofka.ejercicio_4;

public class App4 {
    public static void main(String[] args) {
        Producto producto = new Producto();
        Teclado teclado = new Teclado();

        teclado.mensaje("ingrese el precio del producto al que se le va aplicar el IVA: ");
        producto.setPrecio(teclado.datosPorTeclado());


        teclado.mensaje("El precio del PRODUCTO con IVA es de: "+ producto.calcularPrecioConIva(producto.getPrecio()));
    }
}
