package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		// 21. Faça um programa que peça um número inteiro e determine se ele é
		// ou não um número primo. Um número primo é aquele que é divisível
		// somente por ele mesmo e por 1.

		Scanner scanner = new Scanner(System.in);

		// Solicitar ao usuário para inserir um número inteiro
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();

		boolean ehPrimo = true;

		// Verificar se o número é divisível por algum número diferente de 1 e ele mesmo
		if (numero <= 1) {
			ehPrimo = false;
		} else {
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}

		// Exibir o resultado
		if (ehPrimo) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}
		// Fechar o scanner
		scanner.close();
	}

}
