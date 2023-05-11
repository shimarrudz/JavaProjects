package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaDeletarSemWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		
		MamiferoDAO mamiferodao = new MamiferoDAO(con);
		
		System.out.println(mamiferodao.deletar());
		
		Conexao.fecharConexao(con);
	}

}
