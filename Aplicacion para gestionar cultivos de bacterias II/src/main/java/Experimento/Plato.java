package Experimento;

public class Plato {
    private int[][] celdas;

    public Plato(int size) {
        this.celdas = new int[size][size];
    }

    public int getCelda(int x, int y) {
        return celdas[x][y];
    }

    public void reducirComida(int x, int y, int cantidad) {
        celdas[x][y] -= cantidad;
    }

    public void inicializar() {
        // Implementar la lógica para inicializar el plato
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = 20000; // Reparto inicial de comida entre todas las celdas del plato (cambiado a microgramos)
            }
        }
    }

    public void distribuirComidaConstante(int cantidad) {
        // Implementar la lógica para distribuir la comida de manera constante
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] += cantidad;
            }
        }
    }

    public void distribuirComidaIncrementoLineal(int cantidadInicial, int cantidadFinal, int dia, int duracion) {
        // Implementar la lógica para distribuir la comida con un incremento lineal
        int cantidad = cantidadInicial + (cantidadFinal - cantidadInicial) * dia / duracion;
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] += cantidad;
            }
        }
    }

    public void distribuirComidaAlternado(int cantidad, int dia) {
        // Implementar la lógica para distribuir la comida de manera alternada
        if (dia % 2 == 0) {
            for (int i = 0; i < celdas.length; i++) {
                for (int j = 0; j < celdas[i].length; j++) {
                    celdas[i][j] += cantidad;
                }
            }
        }
    }
}