import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;

    public Main() {
        setTitle("Simulación de Bacterias");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        menuBar = new JMenuBar();

        // Build the first menu.
        menu = new JMenu("Archivo");
        menuBar.add(menu);

        // a group of JMenuItems
        menuItem = new JMenuItem("Abrir experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItem = new JMenuItem("Abrir experimento");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Implementar la funcionalidad para abrir un experimento
                        JFileChooser fileChooser = new JFileChooser();
                        int returnValue = fileChooser.showOpenDialog(null);
                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                            File selectedFile = fileChooser.getSelectedFile();
                            Experimento experimento = GestorDeArchivos.cargarExperimento(selectedFile.getPath());
                        }
                    }
                });
                menu.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("Crear nuevo experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItem = new JMenuItem("Crear nuevo experimento");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        InterfazDeUsuario.crearNuevaPoblacion();
                    }
                });
                menu.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItem = new JMenuItem("Guardar experimento");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Implementar la funcionalidad para guardar un experimento
                        JFileChooser fileChooser = new JFileChooser();
                        int returnValue = fileChooser.showSaveDialog(null);
                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                            File selectedFile = fileChooser.getSelectedFile();
                            GestorDeArchivos.guardarExperimento(experimento, selectedFile.getPath());
                        }
                    }
                });
                menu.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar como nuevo archivo");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItem = new JMenuItem("Guardar como nuevo archivo");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Implementar la funcionalidad para guardar como un nuevo archivo
                        JFileChooser fileChooser = new JFileChooser();
                        int returnValue = fileChooser.showSaveDialog(null);
                        if (returnValue == JFileChooser.APPROVE_OPTION) {
                            File selectedFile = fileChooser.getSelectedFile();
                            GestorDeArchivos.guardarExperimentoComoNuevoArchivo(experimento, selectedFile.getPath());
                        }
                    }
                });
                menu.add(menuItem);
        menu.add(menuItem);

        // Build second menu in the menu bar.
        menu = new JMenu("Población");
        menuBar.add(menu);

        menuItem = new JMenuItem("Añadir nueva población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItem = new JMenuItem("Añadir nueva población");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        InterfazDeUsuario.crearNuevaPoblacion();
                    }
                });
                menu.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("Listar poblaciones");
                menuItem = new JMenuItem("Listar poblaciones");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Implementar la funcionalidad para listar las poblaciones
                        // Aquí puedes llamar a un método que maneje la lógica de listar las poblaciones
                        // Por ejemplo: InterfazDeUsuario.listarPoblaciones();
                    }
                });
                menu.add(menuItem);
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuItem = new JMenuItem("Añadir nueva población");
                menuItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        InterfazDeUsuario.crearNuevaPoblacion();
                    }
                });
                menu.add(menuItem);
        menu.add(menuItem);

        menuItem = new JMenuItem("Eliminar población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para eliminar una población
                System.out.println("Eliminar población seleccionado");
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Ver detalles de población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para ver los detalles de una población
                System.out.println("Ver detalles de población seleccionado");
            }
        });
        menu.add(menuItem);

        // Build third menu in the menu bar.
        menu = new JMenu("Simulación");
        menuBar.add(menu);

        menuItem = new JMenuItem("Realizar simulación");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para realizar una simulación
                System.out.println("Realizar simulación seleccionado");
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Visualizar simulación");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para visualizar una simulación
                System.out.println("Visualizar simulación seleccionado");
            }
        });
        menu.add(menuItem);

        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}