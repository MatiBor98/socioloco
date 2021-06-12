package facultad.tse.beans;


import facultad.tse.logica.data.DatosCiudadanoRepository;
import facultad.tse.logica.entidades.Sexo;
import facultad.tse.logica.entidades.Trabajo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("agregarBean")
@RequestScoped
public class agregarBean {

    DatosCiudadanoRepository datosCiudadanosRepository;

    private String ci,nombre, fecha;

    private Sexo sexo;
    private Trabajo trabajo;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Trabajo getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    public agregarBean() {
    }

    public Sexo[] getSexos(){
        return Sexo.values();
    }

    public Trabajo[] getTrabajos(){
        return Trabajo.values();
    }


    public void agregarCiudadano(){
        Integer mCi = Integer.parseInt(ci);
        datosCiudadanosRepository= DatosCiudadanoRepository.getinstance();
        datosCiudadanosRepository.addCiudadano(mCi,nombre,sexo,fecha,trabajo);
    }
}
