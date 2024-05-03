package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc26 {

	public static void main(String[] args) {
		/*26. Numa eleição existem três candidatos. Faça um programa que peça o 
		número total de eleitores. Peça para cada eleitor votar e ao final 
		mostrar o número de votos de cada candidato. */
		
		Scanner scan = new Scanner(System.in);
		
		int cand1 = 1202, aux1=0;
		int cand2 = 1409, aux2=0;
		int cand3 = 4231, aux3=0;
		
		
		System.out.println("Informe o numero total de eleitores: ");
		int total = scan.nextInt();
		
		int vetor[] = new int[total];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.println("Informe o seu candidato: ");
			vetor[i] = scan.nextInt();
		}
		
		//contagem de votos
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] == cand1) {
				aux1++;
			}
			else if(vetor[i] == cand2) {
				aux2++;
			}
			else if(vetor[i] == cand3) {
				aux3++;
			}
			
		}
		
		System.out.println("Numero de votos de cada candidado: ");
		System.out.println("Candidato 1: "+aux1);
		System.out.println("Candidato 2: "+aux2);
		System.out.println("Candidato 3: "+aux3);
		
		// Fechar o scanner
		scan.close();

	}

}
