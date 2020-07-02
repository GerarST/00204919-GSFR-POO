package com.company;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros que desee: ");
        int num = in.nextInt();
        in.nextLine();
        int a = 0, b = 1;
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                System.out.print(a + "," + b + ",");
            } else if (i == 3) {
                a = a + b;
                b = a + b;
                System.out.print(a + "," + b + ",");
            } else {
                a = a + b;
                b = a + b;
                System.out.print(a + "," + b + ",");
            }

        }
    }
}
