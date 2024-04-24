package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistros {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o código do nome que deseja alterar:  ");
		int idCodigo = entrada.nextInt();
		
		String update = "UPDATE  pessoas SET nome = ? WHERE codigo = ? ";
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		
		Connection conexao = FabricarConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, idCodigo);
		ResultSet result = stmt.executeQuery();
		
		if (result.next()) {
			Pessoa p = new Pessoa(result.getInt(1), result.getString(2));
			
			System.out.println("O nome atual é " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Digite o novo nome: ");
			String novoNome = entrada.nextLine();
			
			
			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, idCodigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso :)");
		} else { 
			System.out.println("Pessoa não identificada :(");
		}
		
	}
	
}
