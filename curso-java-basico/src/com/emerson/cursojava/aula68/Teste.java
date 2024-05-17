package com.emerson.cursojava.aula68;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 200);
		//Thread t = new Thread(thread1);
		//t.start();
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 400);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);

	}

}
