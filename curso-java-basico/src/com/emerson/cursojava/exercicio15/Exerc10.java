package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		/*10. Faça um Programa que pergunte em que turno você estuda. Peça 
		para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a 
		mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor 
		Inválido!", conforme o caso.*/
		
		Scanner scan = new Scanner(System.in);
		
		String turno;
		System.out.println("Digite M-matutino ou V-Vespertino ou N- Noturno: ");
		turno = scan.next();
		if(turno.equals("M")) {
			System.out.println("Bom Dia!");
		}else if(turno.equals("V")) {
			System.out.println("Boa Tarde!");
		}else if(turno.equals("N")) {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Valor Inválido!");
		}
		
		

	}

}
