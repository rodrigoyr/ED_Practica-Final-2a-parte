package Simulacion;

import Experimento.Bacteria;
import Experimento.Plato;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulacion {
    private Plato plato;
    private List<Bacteria> bacterias;
    private Random random;

    public Simulacion() {
        this.plato = new Plato(20);
        this.bacterias = new ArrayList<>();
        this.random = new Random();
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
            for (int i = 0; i < 10; i++) { // Realizar 10 simulaciones por día para cada bacteria
                int comida = plato.getCelda(bacteria.getX(), bacteria.getY()); // Obtener la cantidad de comida en la celda actual de la bacteria

                if (comida >= 100) {
                    bacteria.comer(20);
                    plato.reducirComida(bacteria.getX(), bacteria.getY(), 20);
                } else if (comida > 10) {
                    bacteria.comer(10);
                    plato.reducirComida(bacteria.getX(), bacteria.getY(), 10);
                }

                int accion = random.nextInt(100); // Genera un número aleatorio (0-100) para determinar la acción (morir, quedarse, moverse)

                if (accion < 33) {
                    // La bacteria muere
                    bacterias.remove(bacteria);
                } else if (accion < 66) {
                    // La bacteria se queda
                } else {
                    // La bacteria se mueve
                    bacteria.mover();
                }

                int hijas = bacteria.reproducir(); // La reproducción está basada en la cantidad de comida consumida por cada bacteria en un día
                for (int j = 0; j < hijas; j++) {
                    bacterias.add(new Bacteria(bacteria.getX(), bacteria.getY())); // Las hijas nacen en la misma celda que la bacteria madre
                }
            }
        }
    }
}