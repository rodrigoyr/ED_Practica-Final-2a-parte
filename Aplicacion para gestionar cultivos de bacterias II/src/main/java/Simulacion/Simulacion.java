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
    }

    // Métodos adicionales para la simulación
    public void inicializarPlato() {
        // Inicializa el plato de cultivo
    }

    public void actualizarPlato() {
        // Actualiza el estado del plato de cultivo después de cada iteración de la simulación
    }

    public void finalizarSimulacion() {
        // Finaliza la simulación y realiza cualquier limpieza necesaria
    }
}