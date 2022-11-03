/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MiHilo2 extends Thread{
	
	//Construye un nuevo hilo.
	MiHilo2(String nombre)
	{
		//super se usa para llamar a la versión del constructor de Thread
		super(nombre);
	}
	
	
	public void run()
	{
		System.out.println(getName()+" iniciando.");
		//como ExtendThread extiende de Thread, puede llamar directamente
		//a todos los métodos de thread, incluido el método getName().	
		try {
			
			for(int cont=0; cont<10; cont++)
			{
				Thread.sleep(400);
				System.out.println("En "+getName()+ " , el recuento es "+cont);	
			}
		} catch (InterruptedException e) {
			System.out.println(getName()+" interrumpido. ");
		}
		System.out.println(getName() + " finalizado.");
		
	}
	
	

}
