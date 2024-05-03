package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		//11 - Faça um programa que peça 2 numeros interios e um numero real.
		//	Calcule e mostre:
		//	a: o produto do dobro do primeiro com metade do segundo.
		//	b: a soma do triplo do primeiro com o terceiro.
		//	c: o terceiro elevado ao cubo.
				
		int num1, num2, aux1, aux2;
		double num3, resultado;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
				
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
		System.out.println("Digite um numero flutuante: ");
		num3 = scan.nextFloat();
				
		aux1 = num1 * 2;
		aux2 = num2 / 2;
		resultado = aux1 * aux2;
				
		System.out.println("A: resultado: " + resultado);
		
		aux1 = 0;
		
		aux1 = num1 * 3;
		resultado = aux1 + num3;
		
		System.out.println("B: resultado: " + resultado);
		
		resultado = Math.pow(num3, 3);
		
		System.out.println("C: resultado: " + resultado);
		
				

	}

}
