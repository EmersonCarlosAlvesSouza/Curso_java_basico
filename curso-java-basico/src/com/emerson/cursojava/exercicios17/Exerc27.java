package com.emerson.cursojava.exercicios17;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o número de turmas: ");
        int numTurmas = scanner.nextInt();

        
        int totalAlunos = 0;

       
        for (int i = 1; i <= numTurmas; i++) {
            
            System.out.print("Digite o número de alunos para a turma " + i + ": ");
            int numAlunos = scanner.nextInt();

            
            if (numAlunos > 40) {
                System.out.println("O tamanho da turma não pode ser superior a 40. Por favor, insira um valor válido.");
                i--; // Repetir a iteração para a mesma turma
                continue;
            }

            
            totalAlunos += numAlunos;
        }

        
        double mediaAlunos = (double) totalAlunos / numTurmas;

        
        System.out.println("A média de alunos por turma é: " + mediaAlunos);

        // Fechar o scanner
        scanner.close();

	}

}
