package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		/*13. Tendo como dados de entrada a altura e o sexo de uma pessoa, 
		construa um algoritmo que calcule seu peso ideal, utilizando as 
		seguintes fórmulas: 
. 
		Para homens: (72.7*h) - 58 
			a. Para mulheres: (62.1*h) - 44.7 (h = altura) 
			b. Peça o peso da pessoa e informe se ela está dentro, acima ou 
			abaixo do peso.*/
		
		Scanner scan = new Scanner(System.in);
		
		double altura, pesoIdealH, pesoIdealM, peso;
		String sexo;
		System.out.println("Digite sua altura: ");
		altura = scan.nextDouble();
		System.out.println("Digite seu sexo: ");
		sexo = scan.next();
		
		System.out.println("Digite seu peso: ");
		peso = scan.nextDouble();
		
		
		if(sexo.equals("masculino")) {
			pesoIdealH = (72.7 * altura) - 58;
			if(peso == pesoIdealH) {
				System.out.println("Você esta com o peso ideal para homens, peso ideal: "+ pesoIdealH);
			} else if(peso < pesoIdealH) {
				System.out.println("Você esta abaixo do peso para homens, peso ideal: "+ pesoIdealH);
			} else if(peso > pesoIdealH) {
				System.out.println("Você esta acima do peso para homens, peso ideal: "+ pesoIdealH);
			}
			//System.out.println("Peso ideial para Homens: " + pesoIdealH);
		}
		
		if(sexo.equals("feminino")){
			pesoIdealM = 62.1 * altura - 44.7;
			if(peso == pesoIdealM) {
				System.out.println("Você esta com o peso ideal para mulheres");
			} else if(peso < pesoIdealM) {
				System.out.println("Você esta abaixo do peso para mulheres");
			} else if(peso > pesoIdealM) {
				System.out.println("Você esta acima do peso para mulheres");
			}
		}
		
		
		
		

	}

}
