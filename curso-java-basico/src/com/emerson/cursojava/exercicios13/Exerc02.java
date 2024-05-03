package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		//2 - Faça um programa que peça um número e entãi mostre a mensagem O número informado foi [número].
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
				
		int numero = scan.nextInt();
		System.out.println("O numero informado é: " + numero);

	}

}
