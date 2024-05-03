package com.emerson.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		double notasAlunos[][] = new double[30][4];
		
		notasAlunos[0][0] = 6.5;
		notasAlunos[0][1] = 5.9;
		notasAlunos[0][2] = 8.9;
		notasAlunos[0][3] = 9.4;
		
		notasAlunos[1][0] = 2.6;
		notasAlunos[1][1] = 6.9;
		notasAlunos[1][2] = 7.2;
		notasAlunos[1][3] = 5;
		
		notasAlunos[2][0] = 6.6;
		notasAlunos[2][1] = 8.6;
		notasAlunos[2][2] = 9.8;
		notasAlunos[2][3] = 10;
		
		for(int i=0; i<notasAlunos.length; i++) {
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " - ");
			}
		}
		
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		for(int i=0; i<notasAlunos.length; i++) {
			soma = 0;
			for(int j=0; j<notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do aluno " + i + " é = " + (soma/4));
		}

	}

}
