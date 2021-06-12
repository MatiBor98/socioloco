/*package facultad.tse.services;

import facultad.tse.logica.data.DatosCiudadanoRepository;
import facultad.tse.logica.entidades.Ciudadano;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Optional;

@WebService()
public class ciudadanos {

    DatosCiudadanoRepository datosCiudadanosRepository;

    @WebMethod()
    public Ciudadano obtPersonaPorDoc(Integer ci) {
        datosCiudadanosRepository= DatosCiudadanoRepository.getinstance();
        Optional<Ciudadano> ciudadano = Optional.ofNullable(datosCiudadanosRepository.find(ci));
        return ciudadano.get();
    }


}*/

