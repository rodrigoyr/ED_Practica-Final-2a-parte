package Simulacion;

import Experimento.Bacteria;
import Experimento.Plato;
import java.util.ArrayList;
import java.util.List;

public class Simulacion {
    private Plato plato;
    private List<Bacteria> bacterias;

    public Simulacion() {
        this.plato = new Plato(20);
        this.bacterias = new ArrayList<>();
        inicializarBacterias();
    }

    private void inicializarBacterias() {
        // Bacterias colocadas en el centro del plato de cultivo (4x4 celdas) al inicio
        int centro = 20 / 2;
        for (int i = centro - 2; i <= centro + 2; i++) {
            for (int j = centro - 2; j <= centro + 2; j++) {
                bacterias.add(new Bacteria(i, j));
            }
        }
    }

    public void realizarSimulacionDiaria() {
        // Implementar la lógica para realizar una simulación diaria
        for (Bacteria bacteria : bacterias) {
            // Aquí es donde se implementaría la lógica de la simulación de Montecarlo para cada bacteria
            // Por ejemplo, podrías generar un número aleatorio y usarlo para determinar si la bacteria se muere, se queda en la celda en la que está o se mueve a una celda contigua
            // También necesitarías implementar la lógica para que la bacteria coma comida de la celda y tenga hijos si come suficiente comida
        }
    }
}