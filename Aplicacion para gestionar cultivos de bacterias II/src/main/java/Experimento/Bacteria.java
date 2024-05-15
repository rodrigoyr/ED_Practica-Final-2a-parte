package Experimento;

import java.util.List;

public class Bacteria {
    private int x;
    private int y;
    private int comidaConsumida;

    public Bacteria(int x, int y) {
        this.x = x;
        this.y = y;
        this.comidaConsumida = 0;
    }

    public void mover() {
        // Implementar la lógica para mover la bacteria
    }

    public void comer(int comida) {
        // Implementar la lógica para que la bacteria coma
    }

    public int reproducir() {
        // Implementar la lógica para la reproducción de la bacteria
        return 0;
    }
}