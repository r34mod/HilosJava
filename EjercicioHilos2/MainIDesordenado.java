package Hilos.src.Ejercicio3;

public class MainIDesordenado {

	public static void main(String[] args) {
		Hilo hilo1, hilo2;
		hilo1 = new Hilo();
		hilo2 = new Hilo();

		hilo1.start();
		hilo2.start();

	}

}
