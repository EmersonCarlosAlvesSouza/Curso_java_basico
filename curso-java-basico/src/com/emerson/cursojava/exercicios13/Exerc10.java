package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//10 - - Faça um programa que peça a temperatura em graus Celsius, transforme e mostre a temperatura em graus Farenheit.
		
		double farenheit, celsius;
		System.out.println("Qual a temperatura em Celsius: ");
		celsius = scan.nextDouble();
		farenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura em Farenheit: " + farenheit);
	}

}
