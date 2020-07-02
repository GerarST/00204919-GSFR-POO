package com.GSFR.x00204919;

public class Recibo {
    private String servicio, NIE;
    private double monto;

    public Recibo(String servicio, String NIE, double monto) {
        this.servicio = servicio;
        this.NIE = NIE;
        this.monto = monto;
    }

    public String getServicio() {
        return servicio;
    }
}
