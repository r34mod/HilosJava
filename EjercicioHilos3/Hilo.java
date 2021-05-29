package Hilos.src.Ejercicio4;

public class Hilo implements Runnable{

	private Thread miHilo = null;
	
	public Hilo(String str) {
		miHilo = new Thread(this, str);
		miHilo.start();
		try {
			miHilo.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		for (int i = 1; i < 20000; i++) {
			if(i%2 == 0) {
				System.out.println(i + " " + miHilo.getName());
			}
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("FIN! " + miHilo.getName());
		
	}

}
