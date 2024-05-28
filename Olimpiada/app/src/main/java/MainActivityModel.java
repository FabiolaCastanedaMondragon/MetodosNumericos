package com.tesji.olimpiada.model;

public class MainActivityModel {package com.tesji.olimpiada.model;

    public class MainActivityModel {
        private String nombreAtleta1;
        private int horas1;
        private int minutos1;
        private int segundos1;


        private String nombreAtleta2;
        private int horas2;
        private int minutos2;
        private int segundos2;

        // Constructor
        public MainActivityModel(String nombreAtleta1, int horas1, int minutos1, int segundos1,
                                 String nombreAtleta2, int horas2, int minutos2, int segundos2) {
            this.nombreAtleta1 = nombreAtleta1;
            this.horas1 = horas1;
            this.minutos1 = minutos1;
            this.segundos1 = segundos1;
            this.nombreAtleta2 = nombreAtleta2;
            this.horas2 = horas2;
            this.minutos2 = minutos2;
            this.segundos2 = segundos2;
        }

        // Método para calcular el tiempo total utilizado por ambos atletas
        public String calcularTiempoTotal() {
            int totalHoras = horas1 + horas2;
            int totalMinutos = minutos1 + minutos2;
            int totalSegundos = segundos1 + segundos2;

            // Manejar el acarreo de segundos y minutos
            totalMinutos += totalSegundos / 60;
            totalSegundos %= 60;

            totalHoras += totalMinutos / 60;
            totalMinutos %= 60;

            return "Tiempo total utilizado por ambos atletas:\n" +
                    "Horas: " + totalHoras + "\n" +
                    "Minutos: " + totalMinutos + "\n" +
                    "Segundos: " + totalSegundos;
        }
    }

    private String nombre;
    private int puntaje;

    // Constructor
    public MainActivityModel(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    //  calcular el puntaje total
    public String calcularTotal() {
        int factor = calcularFactor(puntaje);
        int total = puntaje * factor;
        return "Nombre del jugador: " + nombre + "\nPuntaje Total: " + total;
    }

    // Método para calcular el factor según el puntaje original
    private int calcularFactor(int puntaje) {
        if (puntaje == 0) {
            return 0;
        } else if (puntaje >= 1 && puntaje <= 5) {
            return 6;
        } else if (puntaje >= 6 && puntaje <= 8) {
            return 9;
        } else if (puntaje >= 9 && puntaje <= 10) {
            return 10;
        } else {
            return -1; // Manejar caso de puntajes fuera de rango
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}