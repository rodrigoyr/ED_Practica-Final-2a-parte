package PoblacionDeBacterias;

import Experimento.Bacteria;

import java.util.Date;
import java.util.List;

public class Poblacion {
    private String nombre;
    private Date fechaInicio;
    private List<Bacteria> bacterias;

    // Tus otros métodos aquí...

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Bacteria> getBacterias() {
        return bacterias;
    }
}