package br.unipe.cc.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Conta> contas = new ArrayList<Conta>();
	
	public void debitar(int numeroConta, float valor ) throws Exception{
		for(Conta conta: contas){
			if(conta.getNumeroConta() == numeroConta){
				 conta.debitar(valor);
				 return;
			}
			
			
		}
		
		throw new Exception("conta não encontrada!" ); 
		
		
	}
	
	public void creditar(int numeroConta, float valor){
		
	}
	
	
}
