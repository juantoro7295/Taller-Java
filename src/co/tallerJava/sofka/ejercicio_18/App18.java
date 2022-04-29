package co.tallerJava.sofka.ejercicio_18;

import java.sql.Array;
import java.util.Collection;
import java.util.Collections;

public class App18 {
    VideoJuego[] videoJuegos;
    Serie[] series;

    public App18() {
        this.videoJuegos = new VideoJuego[5];
        this.series = new Serie[5];
        crearObjetos();
    }

    public void crearObjetos() {
        VideoJuego juego1 = new VideoJuego();
        VideoJuego juego2 = new VideoJuego("mario", 15);
        VideoJuego juego3 = new VideoJuego("league of legends", 30);
        VideoJuego juego4 = new VideoJuego("valorant", 25, "bala", "riot");
        VideoJuego juego5 = new VideoJuego("pug", 17, "bala", "PugCompani");

        videoJuegos[0] = juego1;
        videoJuegos[1] = juego2;
        videoJuegos[2] = juego3;
        videoJuegos[3] = juego4;
        videoJuegos[4] = juego5;


        Serie serie = new Serie();
        Serie serie1 = new Serie("serie1", "javier");
        Serie serie2 = new Serie("serie2", "andres");
        Serie serie3 = new Serie("serie3", 5, "terror", "alfonso");
        Serie serie4 = new Serie("serie4", 2, "comedia", "ramon");

        series[0] = serie;
        series[1] = serie1;
        series[2] = serie2;
        series[3] = serie3;
        series[4] = serie4;


    }

    public void entregarSeries() {
        for (Serie s : series) {
            if (s.getTitulo().contains("i")) {
                s.entregar();
            }
        }
    }

    public void entregarJuegos() {
        for (VideoJuego j : videoJuegos) {
            if (j.getHorasEstimadas() >= 10) {
                j.entregar();

            }
        }
    }

    public void contarYDevolverSeriesYJuegos() {
        int contadorSeries = 0;
        int contadorJuegos = 0;

        for (VideoJuego j : videoJuegos) {
            if (j.isEntregado()) {
                contadorJuegos++;
                j.devolver();
            }
        }
        for (Serie s : series) {
            if (s.isEntregado()) {
                contadorSeries++;
                s.devolver();
            }
        }
        System.out.println("Series entregadas: " + contadorSeries);
        System.out.println("Juegos entregados: " + contadorJuegos);
    }

    public void juegoConMasHorasEstimadas() {
        VideoJuego mayor = videoJuegos[0];
        for (int i = 0; i < videoJuegos.length; i++) {
            if (videoJuegos[i].getHorasEstimadas() > mayor.getHorasEstimadas()) {
                mayor = videoJuegos[i];
            }
        }
        System.out.println("El juego con mas horas estimadas es: "+mayor.toString());
    }

    public void serieConMasTemporadas() {
        Serie mayor = series[0];
        for (int i = 0; i < series.length; i++) {
            if (series[i].getNumeroDeTemporadas() > mayor.getNumeroDeTemporadas()) {
                mayor = series[i];
            }
        }
        System.out.println("La Serie con mas temporadas es: "+mayor.toString());
    }





    public static void main(String[] args) {
        App18 app = new App18();
        app.entregarJuegos();
        app.entregarSeries();
        app.contarYDevolverSeriesYJuegos();
        app.juegoConMasHorasEstimadas();
        app.serieConMasTemporadas();

    }

}
