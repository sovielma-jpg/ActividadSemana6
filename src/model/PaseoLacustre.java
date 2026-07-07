package model;

public class PaseoLacustre extends ServicioTuristico {
    private String lago;

    public PaseoLacustre(String nombre, double precio, String lago) {
        super(nombre, precio);
        this.lago = lago;
    }

    public String getLago() {
        return lago;
    }

    public void setLago(String lago) {
        this.lago = lago;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("🚤 Paseo Lacustre: " + getNombre() +
                " | Precio: $" + getPrecio() +
                " | Lago: " + lago);
    }
}

