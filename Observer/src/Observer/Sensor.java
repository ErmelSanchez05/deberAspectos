package Observer;

public class Sensor {
	private int temperatura;
	public void setTemperatura(int nuevate) {
		this.temperatura = nuevate;
		System.out.println("La Temperatura fue actualizada:"+ nuevate + "C");
	}
	public int getTemperatura() {
		return temperatura;
	}
}
