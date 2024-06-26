package com.emerson.cursojava.exercicios25a27;

public class Aluno {

	/*
	 * 3. Escreva uma class para representar um Aluno. Adicione atributos
	 * relacionados às caracteristicas de um Aluno, como nome, matricula, curso que
	 * está matriculado, nome de 3 disciplinas que está cursando e as notas dessas 3
	 * disciplinas. Desenvolva um método para verificar se o aluno está aprovado
	 * (nota maior ou igual a 7) em uma determinada disciplina. Escreva um programa
	 * para testar essa classe, que pede as informações do aluno ao usuário e ao
	 * final informa o nome das disciplinas, mostra as notas e mostra se o aluno foi
	 * aprovado ou não.
	 */

	String nome;
	String matricula;
	String curso;
	String nomeDisciplinas[];
	double notaDisciplinas[][];

	boolean verificaNota(int indice) {
		double soma = 0;

		for (int i = 0; i < 3; i++) {
			soma += notaDisciplinas[indice][i];
		}

		double media = soma / 4;

		if (media >= 7) {
			return true;

		}

		return false;

	}

}
