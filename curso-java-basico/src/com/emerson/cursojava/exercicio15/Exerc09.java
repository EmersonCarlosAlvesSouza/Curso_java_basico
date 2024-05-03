package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		// 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner scan = new Scanner(System.in);
		int num,num2,num3;
		System.out.println("Digite 3 numeros: ");
		num = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		
		if(num > num2 && num > num3) {
			if(num2 > num3) {
				System.out.println("Ordem decrecente: "+ num +" "+ num2 +" "+ num3);
			} else if (num3 > num2) {
				System.out.println("Ordem decrecente: "+ num +" "+num3 + " "+num2);
			}
		} 
		
		else if(num2 > num && num2 > num3) {
			if(num > num3) {
				System.out.println("Ordem decrecente: "+ num2 +" "+ num +" "+ num3);
			}	else if (num3 > num) {
				System.out.println("Ordem decrecente: "+ num2 +" "+ num3 +" "+ num);
			}
		}
		
		else if(num3 > num && num3 > num2) {
			if(num > num2) {
				System.out.println("Ordem decrecente: "+ num3 +" "+ num +" "+ num2);
			}	else if (num2 > num) {
				System.out.println("Ordem decrecente"+ num3 +" "+ num2 +" "+ num);
			}
		}

	}
}


