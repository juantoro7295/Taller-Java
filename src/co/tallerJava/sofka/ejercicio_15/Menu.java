package co.tallerJava.sofka.ejercicio_15;

import static co.tallerJava.sofka.ejercicio_15.PalabrasMenu.*;

public class Menu {

    private int valorIngresado;
    private boolean continuo;

    public Menu(int valorIngresado){
        continuo = true;
        this.valorIngresado = valorIngresado;
    }

    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
    public void pedirValorIngresado(int valorIngresado){
        this.valorIngresado = valorIngresado;
    }

    public void mientrasCondicionMostrar(Teclado teclado){
        do{
            mostrarMenu(teclado);
            pedirValorIngresado(teclado.pedirDatosPorTeclado());
            segunCasoMenu(teclado);
        }while(this.continuo);
    }

    public void segunCasoMenu(Teclado teclado){
        switch(this.valorIngresado){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                this.continuo = false;
                break;
            default:
                teclado.mensaje("Opcion incorrecta");
                break;
        }
    }

    public void mostrarMenu(Teclado teclado){
        teclado.mensaje(TITULO);
        teclado.mensaje(NUEVO_ACTOR);
        teclado.mensaje(BUSCAR_ACTOR);
        teclado.mensaje(ELIMINAR_ACTOR);
        teclado.mensaje(MODIFICAR_ACTOR);
        teclado.mensaje(VER_TODOS_LOS_ACTORES);
        teclado.mensaje(VER_PELICULAS_DE_LOS_ACTORES);
        teclado.mensaje(VER_CATEGORIA_DE_LAS_PELICULAS_DE_LOS_ACTORES);
        teclado.mensaje(SALIR);

    }
}
