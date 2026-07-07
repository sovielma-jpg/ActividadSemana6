package model;

public class ExcursionCultural extends ServicioTuristico {
    private String museo;

    public ExcursionCultural(String nombre, double precio, String museo) {
        super(nombre, precio);
        this.museo = museo;
    }

    // Getter y Setter
    public String getMuseo() {
        return museo;
    }

    public void setMuseo(String museo) {
        this.museo = museo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("🏛 Excursión Cultural: " + getNombre() +
                " | Precio: $" + getPrecio() +
                " | Museo: " + museo);
    }
}
