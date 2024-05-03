package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		// 18. Faça um programa que, dado um conjunto de N números, determine o menor
		// valor, o maior valor e a soma dos valores.

		int maior = 0, menor = 1000000, soma = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho do conjunto: ");
		int tam = scan.nextInt();

		int vetor[] = new int[tam];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o numero: ");
			vetor[i] = scan.nextInt();
		}

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
			soma = soma + vetor[i];
		}

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);
		// Fechar o scanner
		scan.close();
	}

}
