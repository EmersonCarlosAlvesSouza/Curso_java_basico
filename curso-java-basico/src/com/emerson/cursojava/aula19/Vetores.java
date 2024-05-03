package com.emerson.cursojava.aula19;

public class Vetores {

	public static void main(String[] args) {
		double temperaturas[] = new double[30];
		temperaturas[0] = 31.4;
		temperaturas[1] = 30.2;
		temperaturas[2] = 21.3;
		temperaturas[3] = 9.3;
		temperaturas[4] = 2.9;
		temperaturas[5] = 31.9;
		
		
		System.out.println("O valor da temperatura do dia 3 é:" + temperaturas[2]);
		System.out.println("O tamanho do array: "+temperaturas.length);
		System.out.println("Valores do array: ");
		
		//esse for mostra a iteração (i) e o valor do array
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia "+(i+1)+" é: "+temperaturas[i]);
		}
		
		//só acessa o valor
		for(double temp: temperaturas) {
			System.out.println(temp);
			
		}
		
	}

}
