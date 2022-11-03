/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class MiHilo1 extends Thread{

	boolean runHilo;
	
	
	public MiHilo1() {
		this.runHilo = true;
	}
	
	@Override
	public void run()
	{
		int contador = 1;
		while(runHilo)
		{
			System.out.println("Hilo 1");
			String hola = "hola";
			System.out.println(hola);
			System.out.println("Contando..."+contador);
			
			if(contador == 10)
				runHilo = false;
			contador++;
		}
	}
	
	
	
	
	
}
