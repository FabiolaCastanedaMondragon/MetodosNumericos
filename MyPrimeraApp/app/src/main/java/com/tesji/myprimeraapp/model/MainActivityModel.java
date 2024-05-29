package com.tesji.myprimeraapp.model;
import java.util.Calendar;

public class MainActivityModel {
    //En Estructura de Datos es mi TDA
    // TDA = Datos + Operaciones

    //Definir Datos
    private String nombre;   //atributo

    private int anioNac;

    int añoActual=Calendar.getInstance().get(Calendar.YEAR);

    //Definimos Operaciones
    public String calcularEdad(){
        int edad;
        edad=2024-anioNac;
        return"Hola"+nombre +
                "\nTu edad es"+edad+"años";
    }
    //set para nombre (mètodo)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }
    /*
    public void setNombre(String nombre){    //argumento
        this.nombre=nombre;
    }
    //get para nombre
    public String getNombre(){
        return nombre;
    }*/

}

