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
                // TODO: Implementar la funcionalidad para abrir un experimento
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Crear nuevo experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para crear un nuevo experimento
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar experimento");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para guardar un experimento
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Guardar como nuevo archivo");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para guardar como un nuevo archivo
            }
        });
        menu.add(menuItem);

        // Build second menu in the menu bar.
        menu = new JMenu("Población");
        menuBar.add(menu);

        menuItem = new JMenuItem("Añadir nueva población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para añadir una nueva población
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Listar poblaciones");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para listar las poblaciones
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Eliminar población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para eliminar una población
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Ver detalles de población");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para ver los detalles de una población
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
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Visualizar simulación");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO: Implementar la funcionalidad para visualizar una simulación
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