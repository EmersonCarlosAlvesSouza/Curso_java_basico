package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		/*
		 * 25. Faça um programa que peça para n pessoas a sua idade, ao final o programa
		 * devera verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e
		 * maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a
		 * média calculada.
		 */

		Scanner scan = new Scanner(System.in);

		int n, aux, idade = 0, media;
		System.out.println("Informe o valor de n: ");
		n = scan.nextInt();
		aux = n;

		while (n != 0) {
			System.out.println("Digite uma idade: ");
			idade += scan.nextInt();

			System.out.println(idade);
			n--;
		}

		media = idade / aux;
		System.out.println(media);

		if (media > 0 && media <= 25) {
			
			System.out.println("\nA turma é jovem!");
		} else if (media > 26 && media <= 60) {
			
			System.out.println("\nA turma é adulto!");

		} else if (media > 60) {
			
			System.out.println("\nA turma é idosa!");

		}

		// Fechar o scanner
		scan.close();
	}
}
