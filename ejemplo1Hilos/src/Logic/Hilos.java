package Logic;

public class Hilos extends Thread{
	
	
	boolean runHilo;
	
	
	public Hilos() {
		this.runHilo = true;
	}
	
	@Override
	public void run()
	{
		int contador = 1;
		
		while ( runHilo)
		{
			System.out.println("Preparados para el parcial");
			String hola = "";
			System.out.println(hola);
			System.out.println("Contando..."+contador);
			if(contador ==10)
			{
				runHilo = false;
			}
			contador++;
		}
		
	}

}
