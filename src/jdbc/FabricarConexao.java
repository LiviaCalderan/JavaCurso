package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricarConexao {
	
	public static Connection getConexao() {
		try {
			final String url = "jdbc:mysql://127.0.0.1:3306/curso_java?verifyServerCertificate=false&useSSL=true";
			final String usuario = "root";
			final String senha = "coca1324cola.";

			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
