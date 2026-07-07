package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();

        System.out.println("=== Servicios Turísticos Llanquihue Tour ===");
        for (ServicioTuristico servicio : gestor.getServicios()) {
            servicio.mostrarInformacion(); // Polimorfismo
        }

        System.out.println("\n--- Modificando un servicio ---");
        ServicioTuristico primero = gestor.getServicios().get(0);
        primero.setNombre("Lo rico de los lagos");
        primero.setPrecio(23400);
        primero.mostrarInformacion();
    }
}

