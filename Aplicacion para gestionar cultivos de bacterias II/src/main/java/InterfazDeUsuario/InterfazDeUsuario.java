package InterfazDeUsuario;

import Experimento.Experimento;
import PoblacionDeBacterias.Poblacion;
import GestionDeArchivos.GestorDeArchivos;
import Simulacion.Simulacion;

import java.util.Scanner;

public class InterfazDeUsuario {
    private Scanner scanner;

    public InterfazDeUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bienvenido a la simulación de bacterias. Por favor, selecciona una opción:");
        System.out.println("1. Crear nueva población");
        System.out.println("2. Cargar población existente");
        System.out.println("3. Realizar simulación");
        System.out.println("4. Salir");

        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        switch (opcion) {
            case 1:
                crearNuevaPoblacion();
                break;
            case 2:
                cargarPoblacionExistente();
                break;
            case 3:
                realizarSimulacion();
                break;
            case 4:
                System.out.println("Saliendo...");
                System.exit(0);
            default:
                System.out.println("Opción no válida. Por favor, intenta de nuevo.");
                iniciar();
        }
    }

    private void crearNuevaPoblacion() {
        // Solicita al usuario los detalles de la nueva población
        System.out.println("Introduce el número de bacterias iniciales:");
        int numeroBacteriasIniciales = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        // Crea una nueva población y la guarda en un archivo
        Poblacion nuevaPoblacion = new Poblacion(numeroBacteriasIniciales);
        GestorDeArchivos.guardarExperimento(new Experimento(nuevaPoblacion), "nuevaPoblacion.ser");

        System.out.println("Nueva población creada y guardada con éxito.");
    }

    private void cargarPoblacionExistente() {
        // Solicita al usuario la ruta del archivo de la población existente
        System.out.println("Introduce la ruta del archivo de la población existente:");
        String rutaArchivo = scanner.nextLine();

        // Carga la población existente del archivo
        Experimento experimento = GestorDeArchivos.cargarExperimento(rutaArchivo);

        if (experimento != null) {
            System.out.println("Población cargada con éxito.");
        } else {
            System.out.println("No se pudo cargar la población. Por favor, verifica la ruta del archivo e intenta de nuevo.");
        }
    }

    private void realizarSimulacion() {
        // Solicita al usuario la ruta del archivo de la población para la simulación
        System.out.println("Introduce la ruta del archivo de la población para la simulación:");
        String rutaArchivo = scanner.nextLine();

        // Carga la población del archivo
        Experimento experimento = GestorDeArchivos.cargarExperimento(rutaArchivo);

        if (experimento != null) {
            // Solicita al usuario el número de días para la simulación
            System.out.println("Introduce el número de días para la simulación:");
            int dias = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            // Realiza la simulación
            Simulacion simulacion = new Simulacion(experimento.getPoblacion(), dias);
            simulacion.realizarSimulacion();

            System.out.println("Simulación realizada con éxito.");
        } else {
            System.out.println("No se pudo cargar la población. Por favor, verifica la ruta del archivo e intenta de nuevo.");
        }
    }
}