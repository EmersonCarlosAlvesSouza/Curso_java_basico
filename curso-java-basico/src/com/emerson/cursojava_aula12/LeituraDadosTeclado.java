package com.emerson.cursojava_aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		String nomeCompleto;
		String primeiroNome;
		int idade;
		double altura;
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		nomeCompleto = scan.nextLine();
		System.out.println("\nNome digitado: " + nomeCompleto);
		
		System.out.println("\nDigite seu primeiro nome: ");
		primeiroNome = scan.next();
		System.out.println("\nSeu primeiro nome é:" + primeiroNome);
		
		System.out.println("\nDigite sua idade: ");
		idade = scan.nextInt();
		System.out.println("\nSua idade é: "+ idade);*/
		
		System.out.println("\nDigite a sua altura: ");
		altura = scan.nextDouble();
		System.out.println("\nSua altura é: "+altura);
		
		
		
	}

}
