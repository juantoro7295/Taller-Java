package co.tallerJava.sofka.ejercicio_17;

public class App17 {
    private Electrodomestico[] listaElectrodomesticos;


    public App17() {
        this.listaElectrodomesticos = new Electrodomestico[10];
        this.crearElectrodomesticos();

    }

    public void crearElectrodomesticos() {
        Electrodomestico lavadora1 = new Lavadora();
        Electrodomestico lavadora2 = new Lavadora(15.0, 30.0, 15.0);
        Electrodomestico lavadora3 = new Lavadora(15.0, "color", 'B', 12.0, 7.0);
        Electrodomestico television1 = new Television();
        Electrodomestico television2 = new Television(30.0, 10.0, 20.0, true);
        Electrodomestico television3 = new Television(30.0, 15.0, 20.0, false);
        Electrodomestico electrodomestico1 = new Electrodomestico();
        Electrodomestico electrodomestico2 = new Electrodomestico(10.0, 5.0);
        Electrodomestico electrodomestico3 = new Electrodomestico(11.0, "rojo", 'C', 5.0);
        Electrodomestico electrodomestico4 = new Electrodomestico(3.0, "gris", 'A', 6.0);

        listaElectrodomesticos[0] = lavadora1;
        listaElectrodomesticos[1] = lavadora2;
        listaElectrodomesticos[2] = lavadora3;
        listaElectrodomesticos[3] = television1;
        listaElectrodomesticos[4] = television2;
        listaElectrodomesticos[5] = television3;
        listaElectrodomesticos[6] = electrodomestico1;
        listaElectrodomesticos[7] = electrodomestico2;
        listaElectrodomesticos[8] = electrodomestico3;
        listaElectrodomesticos[9] = electrodomestico4;
    }

    public void precioTotalElectrodomesticos() {
        double precioFinalLavadora = 0;
        double precioFinalTelevision = 0;
        double precioFinalElectrodomesticos = 0;

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                precioFinalLavadora += electrodomestico.preciofinal();
            } else if (electrodomestico instanceof Television) {
                precioFinalTelevision += electrodomestico.preciofinal();
            } else if (electrodomestico != null) {
                precioFinalElectrodomesticos += electrodomestico.preciofinal();
            }

        }
        System.out.println("LAVADORAS, Precio total: "+precioFinalLavadora);
        System.out.println("TElEVISORES, Precio total: "+precioFinalTelevision);
        System.out.println("ELECTRODOMESTICOS, Precio total: "+precioFinalElectrodomesticos);
    }

    public static void main(String[] args) {
        App17 app = new App17();
        app.precioTotalElectrodomesticos();
    }


}
