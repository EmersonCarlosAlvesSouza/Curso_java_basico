package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		// 6. Faça um Programa que leia três números e mostre o maior deles.
		int valor1, valor2, valor3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		valor1 = scan.nextInt();
		valor2 = scan.nextInt();
		valor3 = scan.nextInt();
		
		if(valor1 > valor2 && valor1 > valor3) {
			System.out.println("Maior: " + valor1);
			
		}else if(valor2 > valor1 && valor2 > valor3) {
			System.out.println("Maior: " + valor2);
			
		}else if(valor3 > valor1 && valor3 > valor2) {
			System.out.println("Maior: " + valor3);
		}
	}

}
