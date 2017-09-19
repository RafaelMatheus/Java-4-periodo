import java.util.Arrays;

public class Agenda {
	private Contato[] contatos;
	int tamanhoMaximo = 0;

	public Agenda(int tamanhoAgenda) {
		
		contatos = new Contato[tamanhoAgenda];

	}

	public boolean adicionarContato(Contato c) {
		Arrays.sort(contatos);

		if (contatos.length == tamanhoMaximo) {
			return false;
		}
		if (Arrays.binarySearch(contatos, c) > 0) {
			return false;
		} else {
			contatos[tamanhoMaximo++] = c;
			return true;
		}
	}

	public Contato buscar(String nome) {
		for (Contato c : contatos) {
			if (c.getNome().equals(nome)) {
				return c;
			}
		}

		return null;

	}
	
}
