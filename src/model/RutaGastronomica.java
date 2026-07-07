package model;

public class RutaGastronomica extends ServicioTuristico {
    private String especialidad;

    public RutaGastronomica(String nombre, double precio, String especialidad) {
        super(nombre, precio);
        this.especialidad = especialidad;
    }

    // Getter y Setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("🍽 Ruta Gastronómica: " + getNombre() +
                " | Precio: $" + getPrecio() +
                " | Especialidad: " + especialidad);
    }
}
