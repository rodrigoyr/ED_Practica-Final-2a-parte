package Experimento;

import PoblacionDeBacterias.Poblacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Experimento {
    private String nombre;
    private Poblacion poblacion;

    public Experimento(Poblacion poblacion) {
        this.poblacion = poblacion;
    }

    public Poblacion getPoblacion() {
        return this.poblacion;
    }

    public void agregarPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }

    // Métodos adicionales para guardar y cargar experimentos desde archivos
}