package br.unipe.cc.banco;

public abstract class ContaAbs {
	private float saldo;
	private int numeroConta;
	
	abstract public void debitar(float valor);
	abstract public void creditar(float valor);
		
	
	
	
	
	
}
