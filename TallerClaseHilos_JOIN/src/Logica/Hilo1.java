/**
 * 
 */
package Logica;



/**
 * @author GonzalezHDanielaA
 *
 */
public class Hilo1 extends Thread{
	
	private int numero=10;
	
	public Hilo1(String nombre)
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
		System.out.println("Se inicia el S1 "+getName());
		
			
	}
	
	
	
	public int contarVocales(String palabra, int i,int contador)
	{
		
		if(i<palabra.length())
		{
			if(isVocal(palabra.charAt(i))) {
				contador=contador+1;
			}
			return contarVocales(palabra, i+1, contador);
		}
		else
		{
			return contador;
		}
		
	}  
	
	public boolean isVocal(char c)
	{
		
		if(c=='a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		{
			return true;
		}else {
			return false;
		}
	}
	
	
	public int getNum(int numero)
	{
		return numero;
	}
	
	public String getPalabra(String palabra)
	{
		return palabra;
	}
	


}
