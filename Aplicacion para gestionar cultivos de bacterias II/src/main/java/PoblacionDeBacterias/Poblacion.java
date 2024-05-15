package PoblacionDeBacterias;

public class Poblacion {
    private int numeroBacteriasIniciales;

    public Poblacion(int numeroBacteriasIniciales) {
        this.numeroBacteriasIniciales = numeroBacteriasIniciales;
    }

    public int getNumeroBacteriasIniciales() {
        return this.numeroBacteriasIniciales;
    }

    public void setNumeroBacteriasIniciales(int numeroBacteriasIniciales) {
        this.numeroBacteriasIniciales = numeroBacteriasIniciales;
    }

    // Método adicional para agregar bacterias
    public void agregarBacterias(int numeroBacterias) {
        this.numeroBacteriasIniciales += numeroBacterias;
    }
}