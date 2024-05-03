package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		/* 5. Faça um programa para a leitura de duas notas parciais de um aluno.
		O programa deve calcular a média alcançada por aluno e apresentar:
			o A mensagem "Aprovado", se a média alcançada for maior ou
			igual a sete;
			o A mensagem "Reprovado", se a média for menor do que sete;
			o A mensagem "Aprovado com Distinção", se a média for igual a
			dez.*/
		
		Scanner scan  = new Scanner(System.in);
		
		int nota1, nota2, media;
		System.out.println("Digite duas notas");
		nota1 = scan.nextInt();
		nota2 = scan.nextInt();
		media = (nota1 + nota2)/2;
		if(media == 10) {
			System.out.println("Aprovado com Distinção");
		}else if(media >= 7) {
			System.out.println("Aprovado");
		}else  if(media < 7){
			System.out.println("Reprovado");
		}
		

	}

}
