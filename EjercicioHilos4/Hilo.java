package Hilos.src.Ejercicio5;

public class Hilo extends Thread{
	
	
	public Hilo() {
	}
	
	public void run() {
		for(int i = 1; i < 6; i++) {
			System.out.println("Empieza el hilo " + i);
			Hilo hijo = new Hilo();
			System.out.println("Soy el hijo del hilo: " + i);
			try {
				Thread.sleep((100 +(long) Math.random() * 600));
				hijo.join();
				System.out.println("Acaba el hijo del hilo: " + i);
				System.out.println("Acaba el hilo " + i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
