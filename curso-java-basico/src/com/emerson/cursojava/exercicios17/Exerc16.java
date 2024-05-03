package com.emerson.cursojava.exercicios17;

public class Exerc16 {

	public static void main(String[] args) {
		// 16. A série de Fibonacci é formada pela seqüência
		// 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até que o
		// valor seja maior que 500.

		//Scanner scan = new Scanner(System.in);

		int fib = 0;

		int fib1 = 0, fib2 = 1;

		
		//System.out.println("1");
		while(fib <= 500) {
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
			System.out.println(fib);
			
		}

	}

}
