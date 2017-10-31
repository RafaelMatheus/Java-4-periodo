package serializacao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedra implements Serializable {
	private String formato;
	private String cor;
	
	public Pedra() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n Formato: " + this.formato + "  Cor: " + this.cor + "   Tamanho: " + this.tamanho;
	}

	public Pedra(String formato, String cor, int tamanho) {
		super();
		this.formato = formato;
		this.cor = cor;
		this.tamanho = tamanho;
		
	}

	int tamanho;
	
}
