package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		//7 - Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuario.
		
		Scanner scan = new Scanner(System.in);
		
		double lado, area;
		System.out.println("Digite um lado do quadrado: ");
		lado = scan.nextInt();
		area = lado * lado;
		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro da area: " + (area * 2));

	}

}
