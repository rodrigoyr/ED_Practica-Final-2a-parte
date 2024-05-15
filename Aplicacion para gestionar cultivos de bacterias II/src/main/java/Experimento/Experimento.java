package Experimento;

import PoblacionDeBacterias.Poblacion;

import java.util.Comparator;
import java.util.List;

public class Experimento {
    private List<Poblacion> poblaciones;
    private int duracion;

    public Experimento(List<Poblacion> poblaciones, int duracion) {
        this.poblaciones = poblaciones;
        this.duracion = duracion;
    }

    public List<Poblacion> getPoblaciones() {
        return this.poblaciones;
    }

    public void setPoblaciones(List<Poblacion> poblaciones) {
        this.poblaciones = poblaciones;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Método adicional para agregar una nueva población
    public void agregarNuevaPoblacion(Poblacion nuevaPoblacion) {
        this.poblaciones.add(nuevaPoblacion);
    }

    public void ordenarPoblacionesPorFecha() {
        poblaciones.sort(Comparator.comparing(Poblacion::getFechaInicio));
    }

    public void ordenarPoblacionesPorNombre() {
        poblaciones.sort(Comparator.comparing(Poblacion::getNombre));
    }

    public void ordenarPoblacionesPorNumeroBacterias() {
        poblaciones.sort(Comparator.comparing(p -> p.getBacterias().size()));
    }
}