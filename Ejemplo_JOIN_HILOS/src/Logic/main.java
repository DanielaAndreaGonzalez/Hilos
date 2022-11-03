package Logic;

public class main {

	public static void main(String[] args) {
	
		HiloEjemplo miHilo = new HiloEjemplo("Mi hilo uno");
		Thread hilo = new Thread(miHilo);
		
		HiloEjemplo miHilo2 = new HiloEjemplo("Mi hilo dos");
		Thread hilo2 = new Thread(miHilo2);
		
		hilo.start();
		
		try {
			hilo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hilo2.start();
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finaliza el proceso");
		
		
		
	

	}

}
