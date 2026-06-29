package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;
    }

    // GETTER
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    // SETTER
    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "--------------------------------------\n" +
                " Categoría: Ruta Gastronómica\n" +
                "--------------------------------------\n" +
                "Nombre del servicio : " + getNombre() + "\n" +
                "Duración estimada   : " + getDuracionHoras() + " horas\n" +
                "Número de paradas   : " + numeroDeParadas + "\n" +
                "Descripción     	: Ruta enfocada en experiencias culinarias locales.\n" +
                "--------------------------------------";

    }
}
