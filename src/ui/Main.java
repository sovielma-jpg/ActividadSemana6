package ui;

import data.GestorServicios;

public class Main {

    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" Servicios Turísticos Llanquihue Tour ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        GestorServicios gestorServicios = new GestorServicios();
        gestorServicios.mostrarServiciosDePrueba();
    }
}

