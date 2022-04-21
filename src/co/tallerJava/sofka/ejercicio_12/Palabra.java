package co.tallerJava.sofka.ejercicio_12;

public class Palabra {
     private String palabra1;
     private String palabra2;

     private boolean paso;

    public Palabra(String palabra1, String palabra2, boolean paso) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.paso = paso;
    }

     public void pedirPalabra1(String palabra1){
         this.palabra1 = palabra1.toLowerCase();

     }
     public void pedirPalabra2(String palabra2){
         this.palabra2 = palabra2.toLowerCase();

     }
     public boolean palabra1TieneMasLongitud(){
        if(this.palabra1.length()>this.palabra2.length()){
            return this.paso=true;
        }
        return paso;
     }

    public boolean palabra2TieneMasLongitud(){
        if(this.palabra2.length()>this.palabra1.length()){
            return this.paso = true;
        }
        return paso;
    }


     public boolean verificarSiSonIguales(Teclado teclado){
          if(this.palabra1.compareTo(this.palabra2)==0){
              teclado.mensaje("Las palabras son iguales");
              return  this.paso = true;

          }
         return paso;
     }

     public void estadoCondicionPalabra1MayorAPalabra2(Teclado teclado){
         if(!verificarSiSonIguales(teclado) && palabra1TieneMasLongitud()){
             this.palabra1 = palabra1.replace(this.palabra2,"");
             teclado.mensaje("La diferencia entre las dos palabras es: "+this.palabra1);

         }


     }
    public void estadoCondicionPalabra2MayorAPalabra1(Teclado teclado){
        if(!verificarSiSonIguales(teclado) && palabra2TieneMasLongitud()){
            this.palabra2 = palabra2.replace(this.palabra1,"");
            teclado.mensaje("La diferencia entre las dos palabras es: "+this.palabra2);

        }

    }

    public void unificador(Teclado teclado){
        estadoCondicionPalabra2MayorAPalabra1(teclado);
        estadoCondicionPalabra1MayorAPalabra2(teclado);

    }








}
