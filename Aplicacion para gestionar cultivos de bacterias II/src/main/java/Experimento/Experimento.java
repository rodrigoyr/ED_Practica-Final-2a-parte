package Experimento;

import PoblacionDeBacterias.Poblacion;

public class Experimento {
    private Poblacion poblacion;

    public Experimento(Poblacion poblacion) {
        this.poblacion = poblacion;
    }

    public Poblacion getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }
}