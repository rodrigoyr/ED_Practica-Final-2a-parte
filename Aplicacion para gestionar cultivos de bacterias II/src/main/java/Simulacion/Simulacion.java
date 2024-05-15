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
        inicializarPlato();
    }

    public void realizarSimulacion() {
        // Aquí se realizará la simulación de Montecarlo
        for (int i = 0; i < 100; i++) { // Ejecuta la simulación 100 veces
            actualizarPlato();
        }
        finalizarSimulacion();
    }

    // Métodos adicionales para la simulación
    public void inicializarPlato() {
        // Inicializa el plato de cultivo con el número inicial de bacterias
        for (int i = 0; i < poblacion.getNumeroBacteriasIniciales(); i++) {
            int x = random.nextInt(20);
            int y = random.nextInt(20);
            plato[x][y] = 1; // Representa una bacteria
        }
    }

    public void actualizarPlato() {
        // Actualiza el estado del plato de cultivo después de cada iteración de la simulación
        // Este es un ejemplo muy básico y probablemente necesitarás una lógica más compleja
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (plato[i][j] == 1 && random.nextBoolean()) { // Si hay una bacteria y se cumple una condición aleatoria
                    plato[i][j] = 0; // La bacteria muere
                } else if (plato[i][j] == 0 && random.nextBoolean()) { // Si no hay una bacteria y se cumple una condición aleatoria
                    plato[i][j] = 1; // Nace una nueva bacteria
                }
            }
        }
    }

    public void finalizarSimulacion() {
        // Finaliza la simulación y realiza cualquier limpieza necesaria
        // En este caso, no hay nada que limpiar, pero podrías necesitar este método para otras lógicas de simulación
    }
}