package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public static void main(String[] args) throws SQLException {
		

		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		Connection conexao = DriverManager.getConnection(url, "rm97187", "030403");
		System.out.println("Abriu a conexão");
		conexao.close();
		
	}
}
