package Logic;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		
		Hilos hilo1=new Hilos("hilo1");
		Thread hilo_1 = new Thread(hilo1);
		//.join();
			
		Hilos hilo2=new Hilos("hilo2");
		Thread hilo_2 = new Thread(hilo2);
		//hilo_2.join();
		
		Hilos hilo3 = new Hilos("hilo3");
		Thread hilo_3 = new Thread(hilo3);
		//hilo_3.join();
		
		
		hilo_1.start();
		hilo_2.start();
		hilo_3.start();
	
	}
}
