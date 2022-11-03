package Logic;

public class MainEjemplo {

	public static void main(String[] args) {
		
		
		Hilos hilo1 = new Hilos();
		hilo1.setName("Mi hilo 1");
		hilo1.start();
		
		try {
			Thread.sleep(2000); // Se duerme durante dos segundos
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("Continuación del flujo principal");
		
		
		
	}

}
