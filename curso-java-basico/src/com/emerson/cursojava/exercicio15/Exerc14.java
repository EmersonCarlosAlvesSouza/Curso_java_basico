package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		/*14. Faça um programa que lê as duas notas parciais obtidas por um aluno 
		numa disciplina ao longo de um semestre, e calcule a sua média. A 
		atribuição de conceitos obedece à tabela abaixo: 
		o Média de Aproveitamento  Conceito    
		o Entre 9.0 e 10.0        A    
		o Entre 7.5 e 9.0         B    
		o Entre 6.0 e 7.5         C    
		o Entre 4.0 e 6.0         D    
		o Entre 4.0 e zero        E */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite duas notas: ");
		double nota1, nota2, media;
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >=9 && media <= 10) {
			System.out.println("Conceito: A\nAprovado");
		} else if(media >=7.5 && media < 9) {
			System.out.println("Conceito: B\nAprovado");
		}else if(media >=6.0 && media < 7.5) {
			System.out.println("Conceito: C\nAprovado");
		}else if(media >=4.0 && media < 6.0) {
			System.out.println("Conceito: D\nReprovado");
		}else if(media < 4 && media > 0) {
			System.out.println("Conceito: E\nReprovado");
		}

	}

}
