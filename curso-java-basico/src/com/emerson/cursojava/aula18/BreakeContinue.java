package com.emerson.cursojava.aula18;

import java.util.Scanner;

public class BreakeContinue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre como um limite");
		int max = scan.nextInt();
		
		for(int i=num; i<max; i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				System.out.println("O valor de i é: "+i);
				break; //ele quebra o loop e sai dele
			}
		}
		
	}

}
