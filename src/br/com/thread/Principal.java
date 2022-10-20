package br.com.thread;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		 Thread threadverde = new Thread (new Verde());
		 Thread threadamarelo = new Thread (new Amarelo());
		 Thread threadvermelho = new Thread (new Vermelho());
		
		threadverde.start();
		threadamarelo.start();
		threadvermelho.start();
		
		threadverde.join();
		threadamarelo.join();
		threadvermelho.join();
	
	
	}
	}
	


