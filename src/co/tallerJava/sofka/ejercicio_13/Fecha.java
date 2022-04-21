package co.tallerJava.sofka.ejercicio_13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fecha {
     private DateTimeFormatter patronDtf;


     public void imprimir(String mensaje){
         System.out.println(mensaje);
     }
    public void ObtenerFechayHoraActual(){
         this.patronDtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        imprimir("(AAAA/MM/DD) (HH:MM:SS) -> "+patronDtf.format(LocalDateTime.now()));
    }


}
