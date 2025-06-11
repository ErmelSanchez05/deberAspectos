package Observer;
import java.awt.Color;
public aspect CambioColorAspecto {
    pointcut cambioColor(Color c): 
        call(void javax.swing.JComponent.setBackground(Color)) && args(c);
    
    after(Color c): cambioColor(c) {
        System.out.println("Color cambiado a: " + getColorName(c));
    }
    
    private String getColorName(Color c) {
        if (c.equals(Color.RED)) return "Rojo";
        if (c.equals(Color.GREEN)) return "Verde";
        if (c.equals(Color.BLUE)) return "Azul";
        return "Desconocido";
    }
}
