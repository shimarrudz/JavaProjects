package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaDeleterComWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();

		Mamifero mamifero = new Mamifero();
		MamiferoDAO mamiferodao = new MamiferoDAO(con);

		mamifero.setIdade(37);
		
		System.out.println(mamiferodao.deletarWhere(mamifero));

		Conexao.fecharConexao(con);
	}

}
