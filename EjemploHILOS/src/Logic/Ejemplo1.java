/**
 * 
 */
package Logic;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Ejemplo1 {
	
	public static void main(String [] args)
	{
		
		MiHilo1 hilo1 = new MiHilo1();
		hilo1.setName("Mi hilo 1");
		hilo1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OJO --continuación del flujo principal");
		
	}
	
	
	

}
