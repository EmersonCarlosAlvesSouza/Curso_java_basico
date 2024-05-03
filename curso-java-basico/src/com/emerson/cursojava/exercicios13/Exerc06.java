package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		//6 - Faça um programa que peça o raio de um circulo, calcule e mostre sua área.
		
		Scanner scan = new Scanner(System.in);
		
		double raio, area;
				
		System.out.println("Digite o raio do circulo: ");
		raio = scan.nextDouble();
				
		area = Math.PI * Math.pow(raio, 2);
		System.out.println("A area é: " + area);

	}

}
