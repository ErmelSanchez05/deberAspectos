package Observer;
import javax.swing.*;
public class Main {
	 public static void main(String[] args) {
	        Sensor sensor = new Sensor();
	        sensor.setTemperatura(20);
	        sensor.setTemperatura(35);
	        SwingUtilities.invokeLater(() -> {
	            new VentanaColores().setVisible(true);
	        });
	    }
}
