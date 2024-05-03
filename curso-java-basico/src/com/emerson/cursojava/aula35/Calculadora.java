package com.emerson.cursojava.aula35;

public class Calculadora {
	
	public static int fatorialNaoRecurcivo(int num) {
		if(num == 0) {
			return 1;
		}
		int total = 1;
		for(int i=num; i > 1; i--) {
			total *= i;
			//1 * 5 = 5
			//5 * 4 = 20
			//20 * 3 = 60
			//60 * 2 = 120
			//120 * 1 = 120
			
		}
		return total;
	}
	
	
	public static int fatorialRecurcivo(int num) {
		
		if(num == 0) {
			return 1;
		}
		return num *= fatorialRecurcivo(num - 1);
		
	}

}
