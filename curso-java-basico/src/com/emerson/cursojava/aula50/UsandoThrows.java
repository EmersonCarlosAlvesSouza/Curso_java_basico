package com.emerson.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		System.out.println("Entre com um numero decimal");
		try {
			double num = leNumero();
			System.out.println("Você digitou "+ num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}
	
	public static double leNumero() throws Exception {
		//esse metodo pode gerar exceptions, mas eu não quero tratar aqui, 
		//por isso usamos o throws
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}

}
