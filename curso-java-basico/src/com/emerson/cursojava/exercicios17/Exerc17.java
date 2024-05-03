package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		//17. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120 
		
		Scanner scan = new Scanner(System.in);
		
		
		int fat=1;
		int total=1;
		System.out.println("Digite um numero fatorial: ");
		fat = scan.nextInt();
		
		
		
		for(int i=fat; i > 1; i--) {
			total = total * i;
		}
		
		System.out.println("Fatorial de "+fat +"! = "+ total);
		
		// Fechar o scanner
		scan.close();
	}

}
