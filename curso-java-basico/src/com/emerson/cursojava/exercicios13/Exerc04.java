package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {

		//4 - Faça um programa que peça as 4 notas bimetrais e mostre a média.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Difite as 4 notas bimestrais: ");
		int nota1,nota2,nota3,nota4, media;
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		nota3 = scan.nextInt();
		nota4 = scan.nextInt();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Media = " + media);

	}

}
