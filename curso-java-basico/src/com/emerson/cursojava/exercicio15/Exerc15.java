package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		/*15. Faça um Programa que peça os 3 lados de um triângulo. O programa 
		deverá informar se os valores podem ser um triângulo. Indique, caso 
		os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou 
		escaleno. 
		o Dicas: 
		o Três lados formam um triângulo quando a soma de quaisquer 
		dois lados for maior que o terceiro; 
		o Triângulo Equilátero: três lados iguais; 
		o Triângulo Isósceles: quaisquer dois lados iguais; 
		o Triângulo Escaleno: três lados diferentes; */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite o comprimento do lado 1:");
        double lado1 = scan.nextDouble();
        
        System.out.println("Digite o comprimento do lado 2:");
        double lado2 = scan.nextDouble();
        
        System.out.println("Digite o comprimento do lado 3:");
        double lado3 = scan.nextDouble();
        
        if (ETriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo Isósceles.");
            } else {
                System.out.println("É um triângulo Escaleno.");
            }
        } else {
            System.out.println("Os valores não podem formar um triângulo.");
        }
    }
    
    public static boolean ETriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
		

	}


