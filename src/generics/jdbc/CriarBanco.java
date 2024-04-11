package generics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
		public static void main(String[] args) throws SQLException {
			
			final String url = "jdbc:mysql://127.0.0.1:3306?verifyServerCertificate=false&useSSL=true";
	        final String usuario = "root";
	        final String senha = "coca1324cola.";

	        Connection conexao = DriverManager.getConnection(url, usuario, senha);

	        Statement stmt = conexao.createStatement();
	        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
	        
	        System.out.println("Banco criado com sucesso!");
	        
	        //se tentar rodar novamente vai dar erro pois já esta criado
	        
	        
	        conexao.close();
		}
}
