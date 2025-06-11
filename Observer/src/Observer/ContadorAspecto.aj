package Observer;

public aspect ContadorAspecto {
	private int contador = 0;
	pointcut cambioColor(): execution(void VentanaColores.cambiarColor(..));

    after(): cambioColor() {
        contador++;
        System.out.println("[AspectJ] Total de cambios realizados: " + contador);
    }
}

