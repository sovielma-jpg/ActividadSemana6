package data;

import model.RutaGastronomica;
import model.PaseoLacustre;
import model.ExcursionCultural;

public class GestorServicios {

    public void mostrarServiciosDePrueba() {

        RutaGastronomica ruta1 = new RutaGastronomica(
                "Paladar Lago Llanquihue",
                5.3,
                5
        );

        RutaGastronomica ruta2 = new RutaGastronomica(
                "Paseo del Queso y la Cerveza nacional",
                5.0,
                3
        );

        PaseoLacustre paseo1 = new PaseoLacustre(
                "Viaje por Lago Llanquihue",
                2.0,
                "Buque"
        );

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Paseo por el Volcán Osorno",
                4.4,
                "Lancha"
        );

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Historia Alemana en Frutillar",
                2.5,
                "Museo Colonial Alemán"
        );

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Patrimonio cultural por Puerto Varas",
                1.0,
                "Iglesia del Sagrado Corazón de Jesús"
        );

        System.out.println(ruta1 + "\n");
        System.out.println(ruta2 + "\n");
        System.out.println(paseo1 + "\n");
        System.out.println(paseo2 + "\n");
        System.out.println(excursion1 + "\n");
        System.out.println(excursion2 + "\n");
    }
}

