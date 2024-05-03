package com.emerson.cursojava.exercicios13;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//8 - Faça um programa que pergunte  quanto você ganha por hora e o númeor de horas trabalhadas no mês.
		//Calcule e mostre o total do seu salário no referido mês.
				
		int ganho_hora, hora_trabalhada, salario;
		System.out.println("Digite quanto você ganha por hora: ");
		ganho_hora = scan.nextInt();
				
		System.out.println("Digite o número de horas trabalhadas no mês: ");
		hora_trabalhada = scan.nextInt();
				
				
		salario = ganho_hora * hora_trabalhada;
				
		System.out.println("Salario: "+ salario);
				

	}

}
