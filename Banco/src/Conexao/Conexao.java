package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Conexao {
	private static Connection con = null;
	private static String Driver = "com.mysql.jdbc.Driver";
	private static String urlLocalHost = "jdbc:mysql://localhost/livros";
	private static String user = "root";
	private static String pass = "";
	
	public static Connection getConex() {

		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(urlLocalHost, user, pass);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			return con;
		}
	}

	public static void closeConx(Connection con) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public static void closeConx(Connection con, java.sql.PreparedStatement stmt) {
		closeConx(con);
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
