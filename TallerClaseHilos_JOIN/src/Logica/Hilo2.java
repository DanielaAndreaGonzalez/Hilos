/**
 * 
 */
package Logica;

/**
 * @author GonzalezHDanielaA
 *
 */
public class Hilo2 extends Thread{
	
	private int numero=10;
	private String palabra;
	
	public Hilo2(String nombre)
	{
		super(nombre);
	}
	
	public int sumaRecursiva(int numero)
	{
		if(numero==0)
		{
			return 0;
		}else {
			return numero+sumaRecursiva(numero-1);
		}
	}
	
	
	@Override
	public void run()
	{
		
		System.out.println("Inicia el hilo S2 "+getName());
		System.out.println("Suma recursiva "+sumaRecursiva(numero));
		//System.out.println("Finaliza S2");		
	}
	
	public int getNum(int numero)
	{
		System.out.println("numero = 10");
		return numero;
	}
	
	public void getPalabra(String palabra)
	{
		System.out.println("otorrinolaringologia");
	}

}
