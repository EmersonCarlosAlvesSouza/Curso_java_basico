package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		///11. Altere o programa anterior para mostrar no final a soma dos números. 
		
		
		
		Scanner scan = new Scanner(System.in);
		int menor, maior, soma = 0;
		
		
		System.out.println("Digite dois numeros: ");
		int num1, num2;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		//achar o menor
		if(num1 < num2) {
			 menor = num1;
		}else {
			 menor = num2;
		}
		
		//achar o maior
		if(num1 > num2) {
			 maior = num1;
		}else {
			 maior = num2;
		}
		
		for(; menor <= maior; ++menor) {
			soma += menor;
			System.out.println(menor);
		}
		System.out.println("Soma: "+ soma);
		
		
		// Fechar o scanner
		scan.close();
		
		
		
	}

}
