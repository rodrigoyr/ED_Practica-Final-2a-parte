package Simulacion;

import PoblacionDeBacterias.Poblacion;
import java.util.Random;

public class Simulacion {
    private Poblacion poblacion;
    private int[][][] plato; // Matriz tridimensional para almacenar el número de bacterias y la comida en cada celda cada día
    private Random random;

    public Simulacion(Poblacion poblacion, int dias) {
        this.poblacion = poblacion;
        this.plato = new int[dias][20][20]; // Inicializa la matriz tridimensional con el número de días y el tamaño del plato
        this.random = new Random();
        inicializarPlato();
    }

    public void realizarSimulacion() {
        for (int dia = 0; dia < plato.length; dia++) { // Ejecuta la simulación para cada día
            for (int i = 0; i < 10; i++) { // Realiza 10 pasos de simulación para cada bacteria cada día
                actualizarPlato();
            }
            finalizarDia();
        }
    }

    public void inicializarPlato() {
        // Inicializa el plato de cultivo con el número inicial de bacterias en un subcuadrado de 4x4 en el centro
        int centro = 20 / 2;
        for (int i = centro - 2; i <= centro + 2; i++) {
            for (int j = centro - 2; j <= centro + 2; j++) {
                plato[0][i][j] = poblacion.getNumeroBacteriasIniciales() / 16; // Reparte las bacterias iniciales entre las celdas del subcuadrado
            }
        }
    }

    public void actualizarPlato() {
        // Actualiza el estado del plato de cultivo después de cada iteración de la simulación
        // Aquí es donde se implementa la lógica de la simulación de Montecarlo
        // Este es un ejemplo muy básico y probablemente necesitarás una lógica más compleja
        for (int dia = 0; dia < plato.length; dia++) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    // Aquí es donde se implementaría la lógica de la simulación de Montecarlo para cada bacteria
                    // Por ejemplo, podrías generar un número aleatorio y usarlo para determinar si la bacteria se muere, se queda en la celda en la que está o se mueve a una celda contigua
                    // También necesitarías implementar la lógica para que la bacteria coma comida de la celda y tenga hijos si come suficiente comida
                }
            }
        }
    }

    public void finalizarDia() {
        // Finaliza el día y realiza cualquier limpieza necesaria
        // Por ejemplo, podrías repartir la comida del día siguiente entre todas las celdas del plato
    }
}