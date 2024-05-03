package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
		mensagem caso o valor seja inválido e continue pedindo até que o 
		usuário informe um valor válido.*/
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		int nota = scan.nextInt();
		
		
		while(nota < 0 || nota > 10) {
			System.out.println("Numero invalido\nDigite uma nota entre 0 e 10: ");
			nota = scan.nextInt();
		}
		
		// Fechar o scanner
		scan.close();


	}

}
