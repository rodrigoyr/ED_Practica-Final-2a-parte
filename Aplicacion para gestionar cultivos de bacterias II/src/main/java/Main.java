import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    private JPanel mainPanel;

    public Main() {
        setTitle("Simulación de Bacterias");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // TODO: Add components to the mainPanel

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}