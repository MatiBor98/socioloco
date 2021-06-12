package facultad.tse.logica.data;

import facultad.tse.logica.entidades.Ciudadano;
import facultad.tse.logica.entidades.Sexo;
import facultad.tse.logica.entidades.Trabajo;

import java.util.HashMap;
import java.util.Map;

public class DatosCiudadanoRepository {
    private Map<Integer, Ciudadano> ciudadanos;
    private static DatosCiudadanoRepository instancia = null;

    private DatosCiudadanoRepository() {
        ciudadanos = initCiudadanos();
    }

    public static DatosCiudadanoRepository getinstance() {
        if (instancia == null)
            instancia = new DatosCiudadanoRepository();
        return instancia;
    }

    private Map<Integer, Ciudadano> initCiudadanos() {
        HashMap<Integer, Ciudadano> map = new HashMap<Integer, Ciudadano>();
        map.put(50550419, new Ciudadano(50550419, "Nicolás San Martín", Sexo.Hombre, "1999-07-06", Trabajo.Desempleado));
        map.put(52050756, new Ciudadano(52050756, "Bruno Pardiñas", Sexo.Hombre, "1950-08-03", Trabajo.Salud));
        return map;
    }
    public void addCiudadano(Integer ci, String nombre, Sexo sexo, String fechaNacimiento, Trabajo trabajo) {
        ciudadanos.put(ci, new Ciudadano(ci, nombre, sexo, fechaNacimiento, trabajo));
    }

    public Ciudadano find(Integer ci) {
        return ciudadanos.get(ci);
    }

}
