package Cadastrar;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import Conexao.Conexao;

public class LivroDao {
	static Connection con = null;
	static java.sql.PreparedStatement stmt = null;

	public static void insereLivro(Livro livro) {
		int isbn = livro.getIsbn();
		String titulo = livro.getTitulo();
		String editora = livro.getEditora();
		int ano = livro.getAno();

		try {
			con = Conexao.getConex();
			stmt = con.prepareStatement("insert into livro (isbn, titulo, editora, ano) values (?,?,?,?)");

			stmt.setInt(1, isbn);
			stmt.setString(2, titulo);
			stmt.setString(3, editora);
			stmt.setInt(4, ano);
			stmt.executeUpdate();

			con.setAutoCommit(false);
			con.commit();

		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} finally {
			Conexao.closeConx(con, stmt);
		}

	}

	public static void deletaLivro(Livro livro) {
		int isbn = livro.getIsbn();

	}

	public static void atualizaTitulo(Livro livro) {
		int isbn = livro.getIsbn();

	}
}
