import java.util.Date;

public class Contato implements Comparable {
	private String nome;
	private String contato;
	private Date data;

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Contato) {
			Contato contato = (Contato) obj;
			return this.nome.compareTo(contato.nome);

		}
		else{
			return -10;
		}

	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 instanceof Contato){
			Contato c = (Contato) arg0;
			return this.nome.equals(c.nome) && this.contato.equals(c.contato);
			
			
		}
		return false;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
