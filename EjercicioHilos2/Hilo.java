package Hilos.src.Ejercicio3;

public class Hilo extends Thread{
	
	public Hilo() {
		
	}
	
	public void run() {
		
		for(int i = 1; i <20000; i++) {
			if(i%2 == 0) {
				System.out.println(i );
			}
			try {
				sleep((long) Math.random() * 1000);
			}catch(InterruptedException e ) {
				e.printStackTrace();
			}
		}
		System.out.println("FIN! ");
	}
	
}
