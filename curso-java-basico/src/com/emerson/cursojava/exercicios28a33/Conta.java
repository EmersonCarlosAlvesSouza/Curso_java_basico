package com.emerson.cursojava.exercicios28a33;

public class Conta {
	private String numero;
	private String agencia;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;
	private int limite;

	

	public Conta(String numero, String agencia, double saldo, boolean especial, double limiteEspecial, int limite) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.limite = limite;
	}

	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	
	//metodos
	public boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else { // não tem saldo na conta
			if (especial) {
				// verifica se o limite especial tem saldo
				double limite = limiteEspecial - saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; // não é especial e não tem saldo suficiente
			}
		}

	}

	public void depositar(double dinheiro) {
		saldo += dinheiro;
	}

	public void consultarSaldo() {
		System.out.println("Saldo disponivel: " + this.saldo);
	}

	public void chequeEspecial() {
		if (especial == true) {
			System.out.println("Esta usando cheque especial!");
		} else {

			System.out.println("Não esta usando cheque especial!");

		}
	}

}
