package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		/*2. Faça um programa que leia um nome de usuário e a sua senha e não 
		aceite a senha igual ao nome do usuário, mostrando uma mensagem 
		de erro e voltando a pedir as informações.*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o nome do usuario: ");
		String nome = scan.next();
		System.out.println("Digite a senha do usuario: ");
		String senha = scan.next();
		
		while(senha.equals(nome)) {
			System.out.println("Erro, senha e nome iguais!");
			System.out.println("Digite o nome do usuario: ");
			nome = scan.next();
			System.out.println("Digite a senha do usuario: ");
			senha = scan.next();
		}
		
		// Fechar o scanner
		scan.close();


	}

}
