package br.unipe.cc.banco;

/**
 * 
 * @author aluno
 *
 */
public class Conta {
	private float saldo;
	private int numeroConta;

	public void debitar(float valor) throws Exception {
		if((this.saldo - valor) < 0){
			throw new Exception("saldo nao pode ser negativo");
		}
		this.saldo -= valor;
		
	}

	public void creditar(float valor) {
		this.saldo += valor;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

}
