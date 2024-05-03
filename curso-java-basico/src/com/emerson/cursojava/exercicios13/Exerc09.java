package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//9 - Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
		
		double farenheit, celsius;
		System.out.println("Qual a temperatura em Farenheit: ");
		farenheit = scan.nextDouble();
		celsius = (5 * (farenheit - 32)/ 9);
		System.out.println("A temperatura em Celsius: " + celsius);

	}

}
