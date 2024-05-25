package com.tesji.atlets.model;

public class MainActivityModel {

    private int nume1; // Número de minutos del atleta 1
    private int nume2; // Número de minutos del atleta 2
    private float tim1; // Tiempo en segundos del atleta 1
    private float tim2; // Tiempo en segundos del atleta 2

    public MainActivityModel(int nume1, int nume2, float tim1, float tim2) {
        this.nume1 = nume1;
        this.nume2 = nume2;
        this.tim1 = tim1;
        this.tim2 = tim2;
    }

    public String calculaTiempo() {


        float totalSegundos = (nume1 * 60) + tim1 + (nume2 * 60) + tim2;
        if (tim1 < 0 || tim2 < 0 || tim1 > 59 || tim2 > 59) {
            return "Favor de Ingresar datos Validos";
        } else {

            int horas = (int) (totalSegundos / 3600);
            int minutos = (int) ((totalSegundos % 3600) / 60);
            int segundos = (int) (totalSegundos % 3600) % 60;

            return "Tiempo Total: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos";
        }
    }
}