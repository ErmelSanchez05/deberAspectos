package Observer;

import javax.swing.;
import java.awt.;
import java.awt.event.ActionEvent;

public class VentanaColores extends JFrame {

    public VentanaColores() {
        setTitle("Cambiador de Colores con AspectJ");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(crearBoton("Rojo", Color.RED));
        add(crearBoton("Verde", Color.GREEN));
        add(crearBoton("Azul", Color.BLUE));
    }

    private JButton crearBoton(String texto, Color color) {
        JButton boton = new JButton(texto);
        boton.addActionListener((ActionEvent e) -> {
            cambiarColor(color);
        });
        return boton;
    }

    public void cambiarColor(Color nuevoColor) {
        getContentPane().setBackground(nuevoColor);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaColores().setVisible(true);
        });
    }
}
