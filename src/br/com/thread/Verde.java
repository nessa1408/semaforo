package br.com.thread;

public class Verde implements Runnable {
	public void run() {
	
			System.out.println("Verde");
			
			try {
				Thread.sleep(120000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
