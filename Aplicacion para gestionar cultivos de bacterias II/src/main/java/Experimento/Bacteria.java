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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void mover() {
        x += random.nextInt(3) - 1; // Mover la bacteria a una celda contigua en el eje x
        y += random.nextInt(3) - 1; // Mover la bacteria a una celda contigua en el eje y
    }

    public void comer(int comida) {
        if (comida >= 100) {
            this.comidaConsumida += 20;
        } else if (comida > 10) {
            this.comidaConsumida += 10;
        }
    }

    public int reproducir() {
        if (comidaConsumida >= 150000) {
            return 3;
        } else if (comidaConsumida >= 100000) {
            return 2;
        } else if (comidaConsumida >= 50000) {
            return 1;
        } else {
            return 0;
        }
    }
}