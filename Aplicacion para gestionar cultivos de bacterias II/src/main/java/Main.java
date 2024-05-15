import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import Experimento.Experimento;
import GestionDeArchivos.GestorDeArchivos;
import PoblacionDeBacterias.Poblacion;
import Simulacion.Simulacion;
import Experimento.Bacteria;

import java.util.List;

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
        // Aquí puedes especificar los parámetros necesarios para crear un nuevo experimento
        experimento = new Experimento(new ArrayList<>(), 0);
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
        // Aquí puedes especificar los parámetros necesarios para crear una nueva población
        Poblacion nuevaPoblacion = new Poblacion("nombre", new Date(), new ArrayList<>());
        experimento.agregarNuevaPoblacion(nuevaPoblacion);
    }

    public void listarPoblaciones() {
        for (Poblacion poblacion : experimento.getPoblaciones()) {
            System.out.println(poblacion.getNombre());
        }
    }

    public void eliminarPoblacion() {
        // Aquí puedes especificar la lógica para eliminar una población
    }

    public void verDetallesPoblacion() {
        // Aquí puedes especificar la lógica para ver los detalles de una población
    }

    public void realizarSimulacion() {
        Simulacion simulacion = new Simulacion();
        simulacion.realizarSimulacionDiaria();

        // Mostrar los resultados en un cuadro de diálogo
        StringBuilder resultados = new StringBuilder();
        List<Bacteria> bacterias = simulacion.getBacterias();
        for (Bacteria bacteria : bacterias) {
            resultados.append("Bacteria en posición: ").append(bacteria.getX()).append(", ").append(bacteria.getY()).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultados.toString());
    }

    public void visualizarSimulacion() {
        // Aquí puedes especificar la lógica para visualizar la simulación
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}