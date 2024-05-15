package PoblacionDeBacterias;

import Experimento.Bacteria;

import java.util.Date;
import java.util.List;

public class Poblacion {
    private String nombre;
    private Date fechaInicio;
    private List<Bacteria> bacterias;

    public Poblacion(String nombre, Date fechaInicio, List<Bacteria> bacterias) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.bacterias = bacterias;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Bacteria> getBacterias() {
        return bacterias;
    }

    public void setBacterias(List<Bacteria> bacterias) {
        this.bacterias = bacterias;
    }

    // Tus otros métodos aquí...
}