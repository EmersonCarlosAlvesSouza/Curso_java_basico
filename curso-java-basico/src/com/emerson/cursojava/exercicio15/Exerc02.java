package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		// 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner scan = new Scanner(System.in);
		
		int valor;
		System.out.println("Digite um valor: ");
		valor = scan.nextInt();
		if(valor < 0) {
			System.out.println("Numero negativo!");
		}else if(valor >= 0) {
			System.out.println("Numero positivo!");
		}
		

	}

}
