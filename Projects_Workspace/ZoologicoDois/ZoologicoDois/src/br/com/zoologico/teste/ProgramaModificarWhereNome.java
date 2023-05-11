package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaModificarWhereNome {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Mamifero mamifero = new Mamifero();
		MamiferoDAO mamiferodao = new MamiferoDAO(con);

		mamifero.setNome("Teste TDSPS 2");
		mamifero.setMesesGestacao(10);
		
		
		System.out.println(mamiferodao.modificarWhereNome(mamifero));

		Conexao.fecharConexao(con);

	}

}
