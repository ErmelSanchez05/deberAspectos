package Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VentanaColores extends JFrame {
    
    public VentanaColores() {
        setTitle("Cambiador de Colores");
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
            getContentPane().setBackground(color);
        });
        return boton;
    }
}