package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		
		//3 - Faça um programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite dois números: ");
		int num1, num2, soma;
		num1 = scan.nextInt();
		num2 =  scan.nextInt();
		soma = num1 + num2;
		System.out.println("A soma é: " + soma);

	}

}
