package com.tesji.practicaspinner.Model;

public class CarrerasModel{

    private int monto;
    private int cliente;
    private int descuento;
    private int total;
    private int rebaja;

    public String mostrarResultado(){
        String InfoResultado="";


        if(cliente==1 && descuento==1 ){
            rebaja= (monto*15)/100;
            total=monto-rebaja;
            InfoResultado="El descuento es del 15% : \n "+ rebaja+ " pesos \n \n" +
                    "El precio total es: \n "+ total+ " pesos";

        }else if(cliente==1 && descuento==2){
            rebaja=(monto*10)/100;
            total=monto+rebaja;
            InfoResultado="El aumento es del 10% : \n"+ rebaja+ " pesos \n \n" +
                    "El precio total es : \n "+ total+ " pesos";
        }else if(cliente==2 && descuento==1){
            rebaja=(monto*20)/100;
            total=monto-rebaja;
            InfoResultado="El descuento es del 20% :\n "+ rebaja+ " pesos \n \n" +
                    "El precio total es : \n "+ total+ " pesos";


        }else if(cliente==2 && descuento==2){
            rebaja=(monto*5)/100;
            total=monto+rebaja;
            InfoResultado="El aumento es del 5% :\n "+ rebaja+ " pesos \n \n" +
                    "El precio total es : \n"+ total+ " pesos";
        }
        return InfoResultado;

    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}