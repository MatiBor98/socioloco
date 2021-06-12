package facultad.tse.logica.entidades;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ciudadano implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer ci;
    private String nombre;
    private Sexo sexo;
    private String fechaNacimiento;
    private Trabajo trabajo;

    public long getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }



    public Ciudadano(Integer ci, String nombre, Sexo sexo, String fechaNacimiento, Trabajo trabajo) {
        super();
        this.ci = ci;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.trabajo = trabajo;
    }

    public Ciudadano() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Trabajo getTrabajadorEscencial() {
        return trabajo;
    }

    public void setTrabajadorEscencial(Trabajo trabajo) {
        this.trabajo = trabajo;
    }



}

