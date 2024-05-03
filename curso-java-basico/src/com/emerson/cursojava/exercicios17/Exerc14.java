package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		/*14. Faça um programa que peça 10 números inteiros, calcule e mostre a 
		quantidade de números pares e a quantidade de números impares.*/
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int num, par=0, impar=0;
		for(int i=0; i<10;i++) {
			System.out.println("Digite um numero: ");
			num = scan.nextInt();
			if(num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.println("Numeros pares: " + par+"\nNumeros impares: "+impar);
		
		// Fechar o scanner
		scan.close();
	}

}
