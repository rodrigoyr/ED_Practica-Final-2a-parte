import javax.swing.*;
import java.awt.*;

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
        menu.add(menuItem);

        menuItem = new JMenuItem("Crear nuevo experimento");
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar experimento");
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar como nuevo archivo");
        menu.add(menuItem);

        // Build second menu in the menu bar.
        menu = new JMenu("Población");
        menuBar.add(menu);

        menuItem = new JMenuItem("Añadir nueva población");
        menu.add(menuItem);

        menuItem = new JMenuItem("Listar poblaciones");
        menu.add(menuItem);

        menuItem = new JMenuItem("Eliminar población");
        menu.add(menuItem);

        menuItem = new JMenuItem("Ver detalles de población");
        menu.add(menuItem);

        // Build third menu in the menu bar.
        menu = new JMenu("Simulación");
        menuBar.add(menu);

        menuItem = new JMenuItem("Realizar simulación");
        menu.add(menuItem);

        menuItem = new JMenuItem("Visualizar simulación");
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