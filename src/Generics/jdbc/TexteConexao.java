package generics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TexteConexao {

    public static void main(String[] args) throws SQLException {
        
        final String url = "jdbc:mysql://127.0.0.1:3306";
        final String usuario = "root";
        final String senha = "coca1324cola.";

        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}