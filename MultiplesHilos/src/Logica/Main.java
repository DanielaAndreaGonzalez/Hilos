/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hilo principal iniciando");
		
		MiHilo3 miHilo1 = MiHilo3.crearYcomenzar("Hilo #1");
		MiHilo3 miHilo2 = MiHilo3.crearYcomenzar("Hilo #2");
		MiHilo3 miHilo3 = MiHilo3.crearYcomenzar("Hilo #3");
		
		for(int i=0; i<50; i++)
		{
			System.out.println(".");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Hilo principal interrumpido");
			}
		}
		System.out.println("Hilo principal finalizado");
	}

}
