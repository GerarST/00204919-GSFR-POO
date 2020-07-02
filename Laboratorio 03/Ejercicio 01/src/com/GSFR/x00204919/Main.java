package com.GSFR.x00204919;

import java.util.Queue;
import java.util.LinkedList;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        Queue<Cliente> colaClientes = new LinkedList<>();

	   int op = 0;

	   do {

            op = Integer.parseInt(JOptionPane.showInputDialog(null, mainMenu()));
	       switch (op){
               case 1:
                   colaClientes.add(agregarCliente());
                   break;
               case 2:
                   Cliente clienteAtendido = colaClientes.remove();
                   clienteAtendido.atenderCliente();
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null, "Hay " + colaClientes.size() + " clientes en espera.");
                   break;
               case 0: JOptionPane.showMessageDialog(null,"Saliendo . . .");
                   break;

           }

	   }while(op != 0);

    }
        static String mainMenu(){
            return "1. Agregar cuenta.\n2. Atender Cliente.\n3. Consultar clientes en cola.\n0. Salir.";
        }

        static Cliente agregarCliente(){
            String nombre, tramite;
            int edad;

            nombre = JOptionPane.showInputDialog(null, "Digite el nombre:");
            tramite = JOptionPane.showInputDialog(null, "Digite el tramite:");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la edad:"));

            if (tramite.equalsIgnoreCase("recibo")){
                String servicio, NIE;
                double monto;

                servicio = JOptionPane.showInputDialog(null, "Digite el servicio: ");
                NIE = JOptionPane.showInputDialog(null,"Digite el NIE: ");
                monto = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el monto: "));

                return new Cliente(nombre,tramite,edad,servicio,NIE,monto);
            }else{
                String tipo;
                double monto;

                tipo = JOptionPane.showInputDialog(null,"Digite el tipo: ");
                monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el monto: "));

                return new Cliente(nombre,tramite,edad,tipo,monto);
            }

        }
}
