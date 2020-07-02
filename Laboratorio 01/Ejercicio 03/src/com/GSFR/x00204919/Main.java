package com.GSFR.x00204919;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Recursividad unaPrueba = new Recursividad(0);
        int numero = 0;
        numero = in.nextInt(); in.nextLine();
        System.out.println(unaPrueba.imprimir(numero, numero));

    }
}
