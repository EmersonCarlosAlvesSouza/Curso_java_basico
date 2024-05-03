package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		// 8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o preço da maça: ");
		double maca = scan.nextDouble();
		System.out.println("Digite o preço da pera: ");
		double pera = scan.nextDouble();
		System.out.println("Digite o preço da uva: ");
		double uva = scan.nextDouble();
		
		if(maca < pera && maca < uva) {
			System.out.println("Produto mais barato: " + maca);
		}else if(pera < maca && pera < uva) {
			System.out.println("Produto mais barato: " + pera);
		}else if(uva < pera && uva < maca) {
			System.out.println("Produto mais barato: " + uva);
		}
		

	}

}
