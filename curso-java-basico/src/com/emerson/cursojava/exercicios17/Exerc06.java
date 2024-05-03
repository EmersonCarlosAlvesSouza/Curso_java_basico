package com.emerson.cursojava.exercicios17;

public class Exerc06 {

	public static void main(String[] args) {
		/*6. Faça um programa que imprima na tela os números de 1 a 20, um 
		abaixo do outro. Depois modifique o programa para que ele mostre os 
		números um ao lado do outro. */
		
		
        // Imprimir os números um abaixo do outro
        System.out.println("Números um abaixo do outro:");
		for(int i=1; i <= 20; i++) {
			System.out.println(i);
		}
		
		 // Imprimir os números um ao lado do outro
        System.out.println("\nNúmeros um ao lado do outro:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

	}

}
