package Simulacion;

import PoblacionDeBacterias.Poblacion;
import java.util.Random;

public class Simulacion {
    private Poblacion poblacion;
    private int[][] plato;
    private Random random;

    public Simulacion(Poblacion poblacion) {
        this.poblacion = poblacion;
        this.plato = new int[20][20];
        this.random = new Random();
    }

    public void realizarSimulacion() {
        // Aquí se realizará la simulación de Montecarlo
        // Este método deberá ser implementado con la lógica de la simulación
    }

    // Métodos adicionales para la simulación
    // ...
}