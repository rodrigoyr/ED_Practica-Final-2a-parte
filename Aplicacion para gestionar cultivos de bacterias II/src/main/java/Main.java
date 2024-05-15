import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import Experimento.Experimento;
import GestionDeArchivos.GestorDeArchivos;
import PoblacionDeBacterias.Poblacion;

public class Main extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    private Experimento experimento;

    public Main() {
        setTitle("Simulación de Bacterias");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();

        // Build the first menu.
        menu = new JMenu("Archivo");
        menuBar.add(menu);

        // a group of JMenuItems
        menuItem = new JMenuItem("Abrir experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirExperimento();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Crear nuevo experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearNuevoExperimento();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarExperimento();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar como nuevo archivo");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarComoNuevoArchivo();
            }
        });
        menu.add(menuItem);

        // Build second menu in the menu bar.
        menu = new JMenu("Población");
        menuBar.add(menu);

        menuItem = new JMenuItem("Añadir nueva población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                añadirNuevaPoblacion();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Listar poblaciones");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarPoblaciones();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Eliminar población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarPoblacion();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Ver detalles de población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verDetallesPoblacion();
            }
        });
        menu.add(menuItem);

        // Build third menu in the menu bar.
        menu = new JMenu("Simulación");
        menuBar.add(menu);

        menuItem = new JMenuItem("Realizar simulación");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarSimulacion();
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Visualizar simulación");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizarSimulacion();
            }
        });
        menu.add(menuItem);

        this.setJMenuBar(menuBar);
    }

    // Define the methods here
    public void abrirExperimento() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            experimento = GestorDeArchivos.cargarExperimento(selectedFile.getPath());
        }
    }

    public void crearNuevoExperimento() {
        experimento = new Experimento(new Poblacion(0));
    }

    public void guardarExperimento() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            GestorDeArchivos.guardarExperimento(experimento, selectedFile.getPath());
        }
    }

    public void guardarComoNuevoArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            GestorDeArchivos.guardarExperimentoComoNuevoArchivo(experimento, selectedFile.getPath());
        }
    }

    public void añadirNuevaPoblacion() {
        Poblacion nuevaPoblacion = new Poblacion(0);
        experimento.agregarNuevaPoblacion(nuevaPoblacion);
    }

    public void listarPoblaciones() {
        System.out.println(experimento.getPoblacion());
    }

    public void eliminarPoblacion() {
        experimento.setPoblacion(null);
    }

    public void verDetallesPoblacion() {
        System.out.println(experimento.getPoblacion());
    }

    public void realizarSimulacion() {
        // Definir el número de iteraciones para la simulación de Montecarlo
        int numIteraciones = 1000;

        // Definir el número inicial de bacterias
        int numBacteriasIniciales = experimento.getPoblacion().getNumeroBacteriasIniciales();

        // Definir el número final de bacterias, que inicialmente es el mismo que el número inicial de bacterias
        int numBacteriasFinales = numBacteriasIniciales;

        // Realizar la simulación de Montecarlo
        for (int i = 0; i < numIteraciones; i++) {
            // En cada iteración, simular el crecimiento de las bacterias
            // Aquí estamos asumiendo que cada bacteria tiene una probabilidad del 50% de dividirse en cada iteración
            // Esto es solo un ejemplo y probablemente querrás reemplazarlo con tu propio modelo de crecimiento de bacterias
            int numNuevasBacterias = 0;
            for (int j = 0; j < numBacteriasFinales; j++) {
                if (Math.random() < 0.5) {
                    numNuevasBacterias++;
                }
            }

            // Añadir las nuevas bacterias al número final de bacterias
            numBacteriasFinales += numNuevasBacterias;
        }

        // Imprimir el número final de bacterias
        System.out.println("Número final de bacterias: " + numBacteriasFinales);
    }

    public void visualizarSimulacion() {
        // Aquí puedes implementar la lógica para visualizar una simulación
        // Esto podría implicar mostrar alguna representación gráfica de los resultados de la simulación
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}