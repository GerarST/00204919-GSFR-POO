package com.GSFR.x00204919;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        herramientasMinecraft unaHerramienta = new herramientasMinecraft("", "", 0, 0, "");
        ArrayList <herramientasMinecraft> ListaHerramientas = new ArrayList<>();

        int Opcion = 0;
        //int Seleccion = 0;

        String nombre = "";
        String material = "";
        double durabilidad = 0;
        double danio = 0;
        String encantamiento = "";
        double cantBloques = 0;
        double cantAtaques = 0;

        do {
            mainMenu();
            Opcion = in.nextInt(); in.nextLine();

            switch (Opcion){
                case 1:
                    System.out.print("Nombre de la herramienta: ");
                    nombre = in.nextLine();
                    System.out.print("Material de la herramienta: ");
                    material = in.nextLine();
                    System.out.print("Durabilidad de la herramienta: ");
                    durabilidad = in.nextDouble(); in.nextLine();
                    System.out.print("Daño de la herramienta: ");
                    danio = in.nextDouble(); in.nextLine();
                    System.out.print("Encantamientos: ");
                    encantamiento = in.nextLine();

                    ListaHerramientas.add(new herramientasMinecraft(nombre,material,durabilidad,danio,encantamiento));
                    
                    break;
                case 2:
                    for (herramientasMinecraft e: ListaHerramientas) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    System.out.println("Que tipo de herramienta desea buscar?");
                    nombre = in.nextLine();

                    for (herramientasMinecraft aux: ListaHerramientas) {

                        if (aux.getNombre().equalsIgnoreCase(nombre))
                            System.out.println(aux.toString());
                    }

                    break;
                case 4:
                    System.out.println("Cuantos bloques desea picar?");
                    cantBloques = in.nextDouble(); in.nextLine();

                    for (herramientasMinecraft Elemento: ListaHerramientas) {
                        Elemento.Picar(true, cantBloques);
                    }
                    break;
                case 5:
                    System.out.println("Cuantos ataques desea dar?");
                     cantAtaques = in.nextDouble(); in.nextLine();

                    for (herramientasMinecraft Elemento: ListaHerramientas) {
                        Elemento.Picar(true, cantAtaques);
                    }
                    break;
                case 0:
                    break;
            }

        }while(Opcion != 0);


    }
     static void mainMenu(){
            System.out.println("Menu de opciones: ");
            System.out.println("1. Agregar herramienta.");
            System.out.println("2. Consultar herramientas (todas).");
            System.out.println("3. Consultar herramienta de un tipo.");
            System.out.println("4. Picar.");
            System.out.println("5. Atacar.");
            System.out.println("0. Salir.");
            System.out.println("Su opcion: ");
        }
}
