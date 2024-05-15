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
        // Implementa la lógica para crear una nueva población
    }

    private void cargarPoblacionExistente() {
        // Implementa la lógica para cargar una población existente
    }

    private void realizarSimulacion() {
        // Implementa la lógica para realizar la simulación
    }
}