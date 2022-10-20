package br.com.thread;

import java.lang.Thread;

public class Vermelho implements Runnable {
	public void run() {
		
		System.out.println("Vermelho");
		
		try {
			Thread.sleep(600000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}


}
