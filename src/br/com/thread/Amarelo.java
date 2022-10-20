package br.com.thread;

public class Amarelo implements Runnable{
	public void run() {
		
			System.out.println("Amarelo");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	
}
