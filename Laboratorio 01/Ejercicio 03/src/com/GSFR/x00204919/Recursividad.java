package com.GSFR.x00204919;

public class Recursividad {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Recursividad(int Numero){
        numero = Numero;
    }

    public int imprimir(int n, int numBase) {
        int aux = 0;
        if (n == 1){
            return 1;
        }
        else{
               aux = imprimir(n+1,numBase);
        return aux;
            }
        }

    }
