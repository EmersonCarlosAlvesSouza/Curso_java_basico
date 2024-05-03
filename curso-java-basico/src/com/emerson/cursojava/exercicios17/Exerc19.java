package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		//19. Altere o programa anterior para que ele aceite apenas números entre 0 e 1000. 
		

		int maior = 0, menor = 1000000, soma = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho do conjunto: ");
		int tam = scan.nextInt();

		int vetor[] = new int[tam];
		
		
		
		for (int i = 0; i < vetor.length; i++) {
            int numero;
            do {
                System.out.println("Digite o numero entre 0 e 1000: ");
                numero = scan.nextInt();
            } while (numero < 0 || numero > 1000); // Verifica se o número está dentro do intervalo permitido
            
            vetor[i] = numero;
        }
		
		

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maior) {
				maior = vetor[i];
			}
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
			soma = soma + vetor[i];
		}

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		System.out.println("Soma: " + soma);

		
		// Fechar o scanner
		scan.close();

	}

}
