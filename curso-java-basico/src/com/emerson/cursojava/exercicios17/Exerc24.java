package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		//24. Faça um programa que calcule o mostre a média aritmética de N notas. 

		Scanner scan = new Scanner(System.in);
		
		double nota, total = 0;
		
		System.out.println("Informe o valor de N: ");
		
		int n = scan.nextInt();
		
		int aux = n;
		
		while(n != 0) {
			
			System.out.println("Informe as notas: ");
			nota = scan.nextDouble();
			total += nota;			
			n--;
		}
		total = total / aux;
		System.out.println("\n\n\tMedia das notas: "+total);
		
		
		// Fechar o scanner
		scan.close();
		
		
	}

}
