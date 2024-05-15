package Experimento;

public class Plato {
    private int[][] celdas;

    public Plato(int size) {
        this.celdas = new int[size][size];
    }

    public void inicializar() {
        // Implementar la lógica para inicializar el plato
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = 20; // Reparto inicial de comida entre todas las celdas del plato
            }
        }
    }

    public void distribuirComida() {
        // Implementar la lógica para distribuir la comida
    }
}