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

    // Método adicional para agregar una nueva población
    public void agregarNuevaPoblacion(Poblacion nuevaPoblacion) {
        // Aquí puedes implementar la lógica para agregar una nueva población al experimento
    }
}