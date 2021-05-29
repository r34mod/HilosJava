package Hilos.src.Ejercicio3;

public class MainOrdenado {

	public static void main(String[] args) {
		Hilo hilo1, hilo2;
		hilo1 = new Hilo();
		hilo2 = new Hilo();

		hilo1.run();
		hilo2.run();
		
	}

}
