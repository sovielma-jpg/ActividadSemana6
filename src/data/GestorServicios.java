package data;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
    private List<ServicioTuristico> servicios;

    public GestorServicios() {
        servicios = new ArrayList<>();
        cargarServicios();
    }

    private void cargarServicios() {
        servicios.add(new RutaGastronomica("Paladar del sur", 22320, "Pastel de Choclo"));
        servicios.add(new PaseoLacustre("Viajando por Llanquihue", 50000, "Lago Llanquihue"));
        servicios.add(new ExcursionCultural("Los Mapuches y su origen", 24500, "museo"));
        servicios.add(new RutaGastronomica("Delicias de LLanquihue", 28340, "Cordero asado con navegado"));
        servicios.add(new PaseoLacustre("Aventura en Jeep", 35000, "Lago Chile"));
    }

    public List<ServicioTuristico> getServicios() {
        return servicios;
    }
}
