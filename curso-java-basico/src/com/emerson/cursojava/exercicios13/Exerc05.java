package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		//5 - Faça um programa que converta metros para centrimetros.
		
		Scanner scan = new Scanner(System.in);
		
		
		double metros, centimetros;
		System.out.println("Digite o valor em metros: ");
		metros = scan.nextDouble();
		centimetros = metros * 100;
		System.out.println("Convertido para centimetros: " + centimetros);

	}

}
