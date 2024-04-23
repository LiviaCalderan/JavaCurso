package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricarConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		//COLOCAR ? AO INVÉS DE CONCATENAR STRING EVITA QUE ALGUEM ESCREVA COMANDOS QUE INTERFIRAM NO BANCO DE DADOS
		
		PreparedStatement stmt = conexao.prepareStatement(sql);//PASSAR PARAMETROS - EVITA SQL INJECTION
		stmt.setString(1, nome);
		//stmt.setInt(2, 100); - CASO QUEIRA INCLUIR COM ID ESPECIFICO - VALUES (?, ?)
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		
		entrada.close();
	}
}
