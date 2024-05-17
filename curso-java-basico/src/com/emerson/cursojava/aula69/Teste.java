package com.emerson.cursojava.aula69;



public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 200);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 400);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.start();
		t2.start();
		t3.start();
		
		while(t1.isAlive() || t2.isAlive() || t3.isAlive()) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Programa finalizado");

	}

}
