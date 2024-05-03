package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		/*13. Faça um programa que peça dois números, base e expoente, calcule e 
		mostre o primeiro número elevado ao segundo número. Não utilize a 
		função de potência da linguagem. */
		
		Scanner scan = new Scanner(System.in);
		
		int resultado = 1, base, expoente;
		System.out.println("Digite a base: ");
		base = scan.nextInt();
		System.out.println("Digite o expoente: ");
		expoente = scan.nextInt();
		
		 // Calculando a potência
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        
		System.out.println("Resultado: " + resultado);
		
		// Fechar o scanner
		scan.close();
	}

}
