package Personagens;

import Armas.ArmaIf;

public abstract class Personagem {
	ArmaIf arma;

	public abstract void desenhar();

	public void falar() {
		System.out.println("oi");
	}

	public void arma() {
		arma.UsarArma();
	}

	public void setArma(ArmaIf arma) {
		this.arma = arma;
	}
}
