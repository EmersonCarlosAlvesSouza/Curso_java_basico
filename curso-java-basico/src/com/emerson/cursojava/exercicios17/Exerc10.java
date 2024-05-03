package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		//10. Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles. 
		
		
		Scanner scan = new Scanner(System.in);
		int menor, maior;
		
		
		System.out.println("Digite dois numeros: ");
		int num1, num2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		//achar o menor
		if(num1 < num2) {
			 menor = num1;
		}else {
			 menor = num2;
		}
		
		//achar o maior
		if(num1 > num2) {
			 maior = num1;
		}else {
			 maior = num2;
		}
		
		for(; menor <= maior; ++menor) {
			System.out.println(menor);
		}
		
		// Fechar o scan
		scan.close();
		
	}

}
