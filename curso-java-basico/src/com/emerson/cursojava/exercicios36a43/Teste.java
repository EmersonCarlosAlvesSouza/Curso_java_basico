package com.emerson.cursojava.exercicios36a43;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		System.out.println("Digite o nome do Cliente: ");
		conta.setNomeCliente(scan.nextLine());
		
		System.out.println("Digite o numero da Conta: ");
		conta.setNumConta(scan.nextLine());
		
		System.out.println("Digite o saldo do Cliente: ");
		conta.setSaldo(scan.nextDouble());
		
		
		System.out.println("Digite o valor do saque: ");
		
		conta.sacar(scan.nextDouble());
		
		
		System.out.println("Digite o valor do deposito: ");
		
		conta.depositar(scan.nextDouble());
		
		System.out.println("Informações da Conta: ");

		
		/*System.out.println("\nNome: " + conta.getNomeCliente());
		System.out.println("\nNumero: " + conta.getNumConta());
		System.out.println("\nSaldo: " + conta.getSaldo());
*/		
		System.out.println(conta);
		
		
	}

}
