package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		/*12. Tendo como dados de entrada a altura de uma pessoa, construa um 
		algoritmo que calcule seu peso ideal, usando a seguinte fórmula: 
		(72.7*altura) - 58*/
		
		Scanner scan = new Scanner(System.in);
		
		double altura, pesoIdeal;
		System.out.println("Digite a sua altura: ");
		altura = scan.nextDouble();
		
		pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal: " + pesoIdeal);

	}

}
