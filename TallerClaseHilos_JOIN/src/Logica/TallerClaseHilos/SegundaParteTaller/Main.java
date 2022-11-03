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
	public static void main(String[] args)throws InterruptedException {
		
		
		Hilo1 S1 = new Hilo1("Hilo1");
		Hilo2 S2 = new Hilo2("Hilo2");
		int n= S1.getNum(10);
		String palabra=S1.getPalabra("otorrinolaringologia");
		int sumaRecursiva = S2.sumaRecursiva(n);
		
		
		S1.start();
		System.out.println("Inicializar Numero = "+n);
		System.out.println("Inicializar String = "+palabra);
		S1.join();
		
		
		
		S2.start();
		S2.join();
		
		
		System.out.println("Ejecución hilo3 S3");
		int S3= S1.contarVocales(palabra, 0, 0);
		System.out.println("S3: Cantidad Vocales "+S3);
		
		System.out.println("Ejecución hilo4 S4: ");
		int S4 = sumaRecursiva * S3;
		System.out.println("Resultado S2 * S3 = "+S4);
		
		
		
		
		
		
		

	}

}
