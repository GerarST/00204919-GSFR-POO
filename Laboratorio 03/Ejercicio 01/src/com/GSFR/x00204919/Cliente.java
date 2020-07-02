package com.GSFR.x00204919;

import javax.swing.*;

public class Cliente {
    private String nombre, tramite;
    private int edad;
    private Recibo recibo;
    private Movimiento movimiento;

    public Cliente(String nombre, String tramite, int edad) {
        this.nombre = nombre;
        this.tramite = tramite;
        this.edad = edad;
    }

    public Cliente(String nombre, String tramite, int edad, String servicio, String NIE, double monto){
        this(nombre, tramite, edad);
        recibo = new Recibo(servicio, NIE, monto);
        movimiento = null;
    }

    public Cliente(String nombre, String tramite, int edad, String tipo, double monto){
        this(nombre, tramite, edad);
        movimiento = new Movimiento(tipo, monto);
        recibo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void atenderCliente(){
        if (movimiento == null){
            JOptionPane.showMessageDialog(null,"El cliente ha pagado un recibo de " + recibo.getServicio());
        }else{
            JOptionPane.showMessageDialog(null, "El cliente ha realizado un movimiento de tipo " + movimiento.getTipo());
        }
    }


}
