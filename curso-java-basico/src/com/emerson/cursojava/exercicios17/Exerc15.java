package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		// 15. A serie de Fibonacci é formada pela seqüência
		// 0,1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o
		// n−ésimo termo.

		Scanner scan = new Scanner(System.in);

		int n, fib = 0;

		int fib1 = 0, fib2 = 1;

		System.out.println("Digite o termo N: ");
		n = scan.nextInt();

		// 8

		for (int i = n; i != 0; i--) {
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
			System.out.println(fib);
		}

		// 1 = 0 + 1 fib1 = 1, fib2 = 1, fib = 1
		// 3 = 1 + 2 fib1 = 1, fib2 = 2, fib = 3
		// Fechar o scanner
		scan.close();
	}

}
