/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MiHilo3 implements Runnable{
	
	Thread hilo;
	
	//Construye un nuevo hilo
	public MiHilo3(String nombre)
	{
		hilo = new Thread(this,nombre);
	}
	
	//Un método de fábrica que crea e inicia un hilo
	public static MiHilo3 crearYcomenzar(String nombre)
	{
		MiHilo3 miHilo = new MiHilo3(nombre);
		miHilo.hilo.start();
		return miHilo;
	}
	
	@Override
	public void run()
	{
		System.out.println(hilo.getName()+" iniciando.");
			try {
				for(int count =0; count<10; count++)
				{
					Thread.sleep(400);
					System.out.println("En "+hilo.getName()+", el recuento es"+count);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(hilo.getName()+" terminado. ");
	}
	
	
	
	
	

}
