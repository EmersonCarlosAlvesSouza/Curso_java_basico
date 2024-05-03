package com.emerson.cursojava.exercicios25a27;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.numero = "123456";
		conta.agencia = "123";
		conta.especial = true;
		conta.limite = 500;
		conta.saldo = -10;
		
 		System.out.println("Saldo da conta "+ conta.numero + " = " + conta.saldo);
 		boolean saqueEfetuado = conta.realizarSaque(10);
 		
 		if(saqueEfetuado) {
 			System.out.println("Saque efetuado com sucesso");
 			System.out.println("Saldo atual da conta = "+ conta.saldo);
 		}else {
 			System.out.println("Não foi possivel realizar saque. Saldo insufifiente");
 		}
 		
 		
 		
saqueEfetuado = conta.realizarSaque(500);

	System.out.println("Tentativa de saque de 500 reais");
 		if(saqueEfetuado) {
 			System.out.println("Saque efetuado com sucesso");
 			System.out.println("Saldo atual da conta = "+ conta.saldo);
 		}else {
 			System.out.println("Não foi possivel realizar saque. Saldo insufifiente");
 		}

	}

}
