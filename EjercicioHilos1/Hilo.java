package Hilos.src.Ejercicio2;

public class Hilo implements Runnable{

	private Thread miHilo = null;
	
	public Hilo(String str) {
		miHilo = new Thread(this, str);
		miHilo.start();
		try {
			miHilo.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 6; i = i+2) {
			System.out.println(i + " " + miHilo.getName());
			try {
				Thread.sleep((long) Math.random() * 10000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("FIN! " + miHilo.getName());
		
	}

}
