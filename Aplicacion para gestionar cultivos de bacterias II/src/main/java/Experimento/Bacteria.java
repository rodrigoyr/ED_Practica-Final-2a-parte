package Experimento;

import java.util.Random;

public class Bacteria {
    private int x;
    private int y;
    private int comidaConsumida;
    private Random random;

    public Bacteria(int x, int y) {
        this.x = x;
        this.y = y;
        this.comidaConsumida = 0;
        this.random = new Random();
    }

    public void mover() {
        // Implementar la lógica para mover la bacteria
    }

    public void comer(int comida) {
        // Implementar la lógica para que la bacteria coma
        this.comidaConsumida += comida;
    }

    public int reproducir() {
        // Implementar la lógica para la reproducción de la bacteria
        if (comidaConsumida >= 150) {
            return 3;
        } else if (comidaConsumida >= 100) {
            return 2;
        } else if (comidaConsumida >= 50) {
            return 1;
        } else {
            return 0;
        }
    }
}