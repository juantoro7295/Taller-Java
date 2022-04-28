package co.tallerJava.sofka.ejercicio_16;

public class Persona extends Teclado {
    private String nombre;
    private int edad;
    private String dNi;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dNi = generaDni();
        this.sexo = "H";
        this.peso = 0;
        this.altura = 0.0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dNi = generaDni();
        this.sexo = sexo.toUpperCase();
        comprobarSexo(this.sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dNi = generaDni();
        this.sexo = sexo.toUpperCase();
        comprobarSexo(this.sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int cacularPesoIdealIMC() {
        double iMC = this.peso / (Math.pow(this.altura, 2));
        int resultado = -999;
        if (iMC < 20) {
            return resultado = -1;
        }
        if (iMC >= 20 && iMC <= 25) {
            return resultado = 0;
        }
        if (iMC > 25) {
            return resultado = 1;
        }
        return resultado;

    }

    public void mensajeRespuestaPesoIdeal() {
        switch (cacularPesoIdealIMC()) {
            case -1:
                mensajePorPantalla("Te encuentras por debajo del peso ideal");
                break;
            case 0:
                mensajePorPantalla("Te encuentras en el peso ideal");
                break;
            case 1:
                mensajePorPantalla("Te encuentras por encima del peso ideal");
                break;
            default:
                mensajePorPantalla("No se puedo calcular");
                break;
        }
    }


    public boolean esMayorDeEdad() {
        boolean esMayorDeEdad = false;
        if (this.edad >= 18) {
            return esMayorDeEdad = true;

        }
        return esMayorDeEdad;
    }

    public void mensajeRespuestaEsMayorDeEdad() {
        if (esMayorDeEdad()) {
            mensajePorPantalla("Es mayor de edad");
        }
        if (!esMayorDeEdad()) {
            mensajePorPantalla("No es mayor de edad");
        }
    }

    public void comprobarSexo(String sexo) {
        if (sexo.equals("H") || sexo.equals("M")) {
            this.sexo = sexo;
        } else {
            this.sexo = "H";
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dNi=" + dNi +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public int generarNumeroAleatorio() {
        return (int) (Math.random() * 100000000);
    }

    public String generaDni() {
        String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int posicion = generarNumeroAleatorio() % 26;
        return letras[posicion] + "" + generarNumeroAleatorio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getdNi() {
        return dNi;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
