package model;

public abstract class ServicioTuristico {
    private String nombre;
    private double precio;

    public ServicioTuristico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método polimórfico
    public abstract void mostrarInformacion();
}
