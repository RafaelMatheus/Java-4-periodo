import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Cadastrar.Livro;
import Cadastrar.LivroDao;
import Conexao.Conexao;

public class Principal {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setIsbn(11313);
		livro.setAno(13);
		
		LivroDao.insereLivro(livro);	

	}

}
