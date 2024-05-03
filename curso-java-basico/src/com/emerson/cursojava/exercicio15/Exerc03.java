package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		// 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner scan = new Scanner(System.in);
		
		String sexo;
		System.out.println("Digite F ou M: ");
		sexo = scan.next();
		
		if(sexo.equals("F")) {
			System.out.println("Feminino");
		}else if(sexo.equals("M")){
			System.out.println("Masculino");
		}else {
			System.out.println("Sexo Inválido");
		}
		

	}

}
