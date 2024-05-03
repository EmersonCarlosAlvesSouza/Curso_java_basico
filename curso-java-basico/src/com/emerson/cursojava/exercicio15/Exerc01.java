package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		//1. Faça um Programa que peça dois números e imprima o maior deles.
		Scanner scan = new Scanner(System.in);
		int num,num2;
		
		System.out.println("Digite dois numeros: ");
		num = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num > num2) {
			System.out.println("O numero " + num + " é maior");
		} else if(num < num2) {
			System.out.println("O numero " + num2 + " é maior");
		}else {
			System.out.println("São iguais");
		}

	}

}
