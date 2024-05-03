package com.emerson.cursojava.exercicios25a27;

public class Conta {

	/*
	 * 2. Cria uma classe para representar uma conta corrente que possui um número,
	 * um saldo, um status que informa se ela é especial ou não, um limite.
	 * Desenvolva métodos para realizar saque (verificando se o cliente pode
	 * realizar saques), despositar dinheiro, consultar saldo e verificar se o
	 * cliente está usando cheque especial ou não. Desenvolva um programa para
	 * testar essa classe.
	 */

	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	int limite;

	boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else { //não tem saldo na conta
			if(especial) {
				//verifica se o limite especial tem saldo
				double limite = limiteEspecial - saldo;
				if(limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false; //não é especial e não tem saldo suficiente
			}
		}
		
	}

	void depositar(double dinheiro) {
		saldo += dinheiro;
	}

	void consultarSaldo() {
		System.out.println("Saldo disponivel: " + this.saldo);
	}

	void chequeEspecial() {
		if (especial == true) {
			System.out.println("Esta usando cheque especial!");
		} else {

			System.out.println("Não esta usando cheque especial!");

		}
	}

}
