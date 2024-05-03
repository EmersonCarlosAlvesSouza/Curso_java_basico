package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		// 7 - Faça um programa que leia 5 números e informe o maior número.

		int maior = -10000;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= 5; i++) {
			System.out.println("Digite um numero: ");
			int num = scan.nextInt();

			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("Maior: " + maior);
		
		// Fechar o scanner
		scan.close();
		
	}

}
