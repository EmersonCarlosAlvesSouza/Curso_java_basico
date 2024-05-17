package com.emerson.cursojava.aula70;
import com.emerson.cursojava.aula69.*;

public class Teste {

	public static void main(String[] args) {
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 200);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 400);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 800);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);
		
		t1.setPriority(5);
		t2.setPriority(4);
		t3.setPriority(2);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
