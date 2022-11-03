/**
 * 
 */
package Logic;

/**
 * @author GonzalezHDanielaA
 *
 */
public class HiloEjemplo implements Runnable{
	
	private String nombre;
	
	public HiloEjemplo(String nombre)
	{
		this.nombre = nombre;
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			if(nombre.equalsIgnoreCase("Mi hilo uno"))
				{
					System.out.println(i+" "+nombre+" --->");
				}else {
					System.out.println(i+" "+nombre+" <---");
				}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Finaliza el hilo"+nombre);
	}
	

}
