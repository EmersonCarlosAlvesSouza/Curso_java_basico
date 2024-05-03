package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		// 8. Faça um programa que leia 5 números e informe a soma e a média dos números. 
		
		Scanner scan = new Scanner(System.in);
		
		int numero, soma = 0, media;
		
		for(int i=1; i <= 5; i++) {
			System.out.println("Digite o numero " + i + ": ");
			numero = scan.nextInt();
			soma += numero;
			
		}
		media = soma / 5;
		System.out.println("Soma: "+ soma +"\nMedia: "+ media);
		// Fechar o scanner
		scan.close();

	}

}
