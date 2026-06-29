package model;

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // GETTER
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    // SETTER
    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "--------------------------------------\n" +
                " Categoría: Paseo Lacustre\n" +
                "--------------------------------------\n" +
                "Nombre del servicio : " + getNombre() + "\n" +
                "Duración estimada   : " + getDuracionHoras() + " horas\n" +
                "Tipo de embarcación : " + tipoEmbarcacion + "\n" +
                "Descripción     	: Paseo turístico por el lago con vista panorámica.\n" +
                "--------------------------------------";

    }
}

