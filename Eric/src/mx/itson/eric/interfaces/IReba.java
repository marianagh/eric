package mx.itson.eric.interfaces;

public interface IReba {
	
	public int calcularPiernas(int puntuacion, int correccion);
	public int calcularCuello(int puntuacion, int correccion);
	public int calcularTronco(int puntuacion, int correccion);
	public int tablaC( int a, int b);
	public int grupoA(int cuello, int piernas, int tronco );
	public int gruboB (int antebrazo, int brazo, int muneca);
	

}
