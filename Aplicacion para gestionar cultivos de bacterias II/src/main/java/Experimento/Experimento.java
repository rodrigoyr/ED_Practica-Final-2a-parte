package Experimento;

import PoblacionDeBacterias.Poblacion;
import java.util.ArrayList;
import java.util.Date;

public class Experimento {
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private int duracion;
    private int dosisComidaInicial;
    private int dosisComidaFinal;
    private ArrayList<Poblacion> poblaciones;

    public Experimento(String nombre, Date fechaInicio, Date fechaFin, int dosisComidaInicial, int dosisComidaFinal) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.dosisComidaInicial = dosisComidaInicial;
        this.dosisComidaFinal = dosisComidaFinal;
        this.poblaciones = new ArrayList<>();
        this.duracion = calcularDuracion();
    }

    private int calcularDuracion() {
        // Calcular la duración del experimento en días
        long diff = fechaFin.getTime() - fechaInicio.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }

    public void agregarPoblacion(Poblacion poblacion) {
        this.poblaciones.add(poblacion);
    }

    // Getters y setters para los atributos de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getDosisComidaInicial() {
        return dosisComidaInicial;
    }

    public void setDosisComidaInicial(int dosisComidaInicial) {
        this.dosisComidaInicial = dosisComidaInicial;
    }

    public int getDosisComidaFinal() {
        return dosisComidaFinal;
    }

    public void setDosisComidaFinal(int dosisComidaFinal) {
        this.dosisComidaFinal = dosisComidaFinal;
    }

    public ArrayList<Poblacion> getPoblaciones() {
        return poblaciones;
    }
}