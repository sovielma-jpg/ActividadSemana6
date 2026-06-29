package model;

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        this.lugarHistorico = lugarHistorico;
    }

    // GETTER
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    // SETTER
    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return "--------------------------------------\n" +
                " Categoría: Excursión Cultural\n" +
                "--------------------------------------\n" +
                "Nombre del servicio : " + getNombre() + "\n" +
                "Duración estimada   : " + getDuracionHoras() + " horas\n" +
                "Lugar histórico 	: " + lugarHistorico + "\n" +
                "Descripción     	: Actividad orientada al conocimiento patrimonial e histórico.\n" +
                "--------------------------------------";
    }
}

