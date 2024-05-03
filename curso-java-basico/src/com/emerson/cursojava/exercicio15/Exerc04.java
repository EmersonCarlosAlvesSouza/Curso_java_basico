package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
        
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite uma letra: ");
        char letra = scan.next().charAt(0);
        
        if(letra == 'a' || letra == 'e' ||letra == 'i' ||letra == 'o' ||letra == 'u'||letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
        	System.out.println("É vogal");
        } else if((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
        	System.out.println("É consoante");
        }

	}

}
