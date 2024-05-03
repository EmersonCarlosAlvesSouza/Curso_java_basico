package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		/*3. Faça um programa que leia e valide as seguintes informações: 
			a. Nome: maior que 3 caracteres;
			b. Idade: entre 0 e 150; 
			c. Salário: maior que zero; 
			
			
			d. Sexo: 'f' ou 'm'; 
			e. Estado Civil: 's', 'c', 'v', 'd'; */
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		double salario;
		int idade;
		char sexo, estadoCivil;
		
		do {
			System.out.println("Nome: ");
			nome = scan.next();
		}while(nome.length() <= 3);
		

		do {
			System.out.println("Idade: ");
			idade = scan.nextInt();
		} while(idade < 0 || idade > 150);
		
		
		
		do {
			System.out.println("Salário: ");
			salario = scan.nextDouble();
		} while(salario < 0);
		
		
		// Validação do sexo
        do {
            System.out.println("Digite o sexo ('f' ou 'm'):");
            sexo = scan.next().charAt(0);
            sexo = Character.toLowerCase(sexo); // Convertendo para minúsculo
        } while (sexo != 'f' && sexo != 'm');
        
        // Validação do estado civil
        do {
            System.out.println("Digite o estado civil ('s', 'c', 'v' ou 'd'):");
            estadoCivil = scan.next().charAt(0);
            estadoCivil = Character.toLowerCase(estadoCivil); // Convertendo para minúsculo
        } while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd');
        
        // Exibir as informações validadas
        System.out.println("\nInformações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
        
		// Fechar o scanner
		scan.close();

	}
}
