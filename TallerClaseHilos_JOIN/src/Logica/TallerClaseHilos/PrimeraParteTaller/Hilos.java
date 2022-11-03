/**
 * 
 */
package Logic;

import java.util.Random;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Hilos extends Thread{

	
	
	boolean runHilo;
	private String nombre;
	
	public Hilos() {
		this.runHilo = true;
	}
	public Hilos(String nombre)
	{
		this.nombre=nombre;
	}
	
	
	@Override
	public void run()
	{
		int vec[] = {1,2,5,8,10};
		
		
		if(nombre.equalsIgnoreCase("hilo1")) {
			
				try {
					for(int i=0; i<vec.length;i++)
					{
					System.out.println("Hilo 1: "+vec[i]);
					Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}else if(nombre.equalsIgnoreCase("hilo2"))
		{
			
			int num = 4;
			int resultado=0;
		
				try {
					for(int i=0;i <=10;i++)
					{
						resultado += num * num;
						Thread.sleep(1500);
						System.out.println("Hilo2 ->" +resultado);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}else {	
				try {
					for(int i=0; i<=15;i++)
					{
					System.out.println("Hilo3 ->"+i);
					Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				}
		System.out.println("Finaliza el hilo"+nombre);
	}
	
	
	
	
	
	
	
	
}
