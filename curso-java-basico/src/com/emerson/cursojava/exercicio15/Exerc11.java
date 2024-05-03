package com.emerson.cursojava.exercicio15;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		
		/*11. As Organizações Tabajara resolveram dar um aumento de salário aos 
		seus colaboradores e lhe contraram para desenvolver o programa que 
		calculará os reajustes. 
		o Faça um programa que recebe o salário de um colaborador e o 
		reajuste segundo o seguinte critério, baseado no salário atual: 
		o salários até R$ 280,00 (incluindo) : aumento de 20% 
		o salários entre R$ 280,00 e R$ 700,00 : aumento de 15% 
		o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10% 
		o salários de R$ 1500,00 em diante : aumento de 5% Após o 
		aumento ser realizado, informe na tela: 
		o o salário antes do reajuste; 
		o o percentual de aumento aplicado; 
		o o valor do aumento; 
		o o novo salário, após o aumento.*/
		
		
		Scanner scan = new Scanner(System.in);
		
		
		double salario, reajuste, aumento;
		
		System.out.println("Digite seu salario: ");
		salario = scan.nextDouble();
		
		if(salario <= 280 ) {
			System.out.println("\nSalario antes do reajuste: " + salario);
			reajuste = salario;
			aumento = salario * 0.2;
			reajuste += aumento;
			System.out.println("\nPercentual:  20% \nValor do aumento: "+aumento + "\nNovo salario: "+ reajuste);
		}else if(salario > 280 && salario <= 700) {
			System.out.println("\nSalario antes do reajuste: " + salario);
			reajuste = salario;
			aumento = salario * 0.15;
			reajuste += aumento;
			System.out.println("\nPercentual:  15% \nValor do aumento: "+aumento + "\nNovo salario: "+ reajuste);
		}else if(salario > 700 && salario <= 1500) {
			System.out.println("\nSalario antes do reajuste: " + salario);
			reajuste = salario;
			aumento = salario * 0.1;
			reajuste += aumento;
			System.out.println("\nPercentual:  10% \nValor do aumento: "+aumento + "\nNovo salario: "+ reajuste);
		}else if(salario > 1500) {
			System.out.println("\nSalario antes do reajuste: " + salario);
			reajuste = salario;
			aumento = salario * 0.05;
			reajuste += aumento;
			System.out.println("\nPercentual:  5% \nValor do aumento: "+aumento + "\nNovo salario: "+ reajuste);
		}
		

		
		
		

	}

}
