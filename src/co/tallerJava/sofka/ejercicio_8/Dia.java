package co.tallerJava.sofka.ejercicio_8;



public class Dia {

    private String  dia;

    public Dia(){

        dia = "";

    }
    public void verificarSiEsdiaLaboral(Teclado teclado){
        teclado.mensaje();
        this.dia = teclado.perdirDatosPorTeclado().toLowerCase();
        switch(this.dia){
            case "lunes":
                teclado.mensajeEsDiaLaboral("lunes");
                break;
            case "martes":
                teclado.mensajeEsDiaLaboral("martes");
                break;
            case "miercoles":
                teclado.mensajeEsDiaLaboral("miercoles");
                break;
            case "jueves":
                teclado.mensajeEsDiaLaboral("jueves");
                break;
            case "viernes":
                teclado.mensajeEsDiaLaboral("viernes");
                break;
            case "sabado":
                teclado.mensajeDiaNoLaboral("sabado");
                break;
            case "domingo":
                teclado.mensajeDiaNoLaboral("domingo");
                break;
            default:
                System.out.println("No existe ese dia");

                break;
            }

        }




    }

