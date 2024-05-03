package com.emerson.cursojava.exercicios28a33;



public class TesteConta {

	public static void main(String[] args) {
		Conta conta = new Conta("123456", "123", 100, true, 500, -10);
		/*conta.numero = "123456";
		conta.agencia = "123";
		conta.especial = true;
		conta.limite = 500;
		conta.saldo = -10;*/
		
 		System.out.println("Saldo da conta "+ conta.getNumero() + " = " + conta.getSaldo());
 		boolean saqueEfetuado = conta.realizarSaque(10);
 		
 		if(saqueEfetuado) {
 			System.out.println("Saque efetuado com sucesso");
 			System.out.println("Saldo atual da conta = "+ conta.getSaldo());
 			System.out.println("Saldo atual da conta = "+ conta.getSaldo());
 		}else {
 			System.out.println("Não foi possivel realizar saque. Saldo insufifiente");
 		}
 		
 		
 		
saqueEfetuado = conta.realizarSaque(500);

	System.out.println("Tentativa de saque de 500 reais");
 		if(saqueEfetuado) {
 			System.out.println("Saque efetuado com sucesso");
 			System.out.println("Saldo atual da conta = "+ conta.getSaldo());
 		}else {
 			System.out.println("Não foi possivel realizar saque. Saldo insufifiente");
 		}

	}

	

}
