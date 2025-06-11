package Observer;

public aspect SensorAspect {
	 private Display display = new Display();
	    pointcut cambioTemperatura(Sensor s, int nuevate): 
	        execution(void Sensor.setTemperatura(int)) && target(s) && args(nuevate);
	    
	    after(Sensor s, int nuevate): cambioTemperatura(s, nuevate) {
	        display.actualizar(nuevate);
	    }
}