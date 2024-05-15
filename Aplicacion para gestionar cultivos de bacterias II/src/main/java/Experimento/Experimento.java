package Experimento;

import PoblacionDeBacterias.Poblacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Experimento {
    private String nombre;
    private List<Poblacion> poblaciones;

    public Experimento(String nombre) {
        this.nombre = nombre;
        this.poblaciones = new ArrayList<>();
    }

    public void agregarPoblacion(Poblacion poblacion) {
        this.poblaciones.add(poblacion);
    }

    public void eliminarPoblacion(Poblacion poblacion) {
        this.poblaciones.remove(poblacion);
    }

    public void ordenarPoblacionesPorFecha() {
        this.poblaciones.sort(Comparator.comparing(Poblacion::getFechaInicio));
    }

    public void ordenarPoblacionesPorNombre() {
        this.poblaciones.sort(Comparator.comparing(Poblacion::getNombre));
    }

    public void ordenarPoblacionesPorNumeroDeBacterias() {
        this.poblaciones.sort(Comparator.comparing(Poblacion::getNumeroBacteriasIniciales));
    }

    // Métodos adicionales para guardar y cargar experimentos desde archivos
}