package com.emerson.cursojava.aula17;

public class LoopFor {

	public static void main(String[] args) {
		for(int i=0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		
		System.out.println("For 2\n");
		for(int i=0; i < 5; i++) {
			System.out.println("i tem valor: " + i);
		}
		
		
		for (int i=0, j=10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		int count = 0;
		for( ; count < 10; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}

	}

}
