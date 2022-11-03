/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MainEjemploRunnable {
	
	
	
	public static void main(String [] args)
	{
		System.out.println("Hilo principal iniciando.");
		//Primero, construye un objeto MiHilo
		MiHiloRunnable mh = new MiHiloRunnable("#1");
		
		//Luego, construye un hilo de ese objeto.
		Thread nuevoh = new Thread(mh);
		//Finalmente, comienza la ejecución del hilo.
		nuevoh.start();
		
		for(int i=0; i<50; i++)
		{
			System.out.println(" .");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Hilo principal interrumpido");
		}
		System.out.println("Hilo principal finalizado");	
	}

}
