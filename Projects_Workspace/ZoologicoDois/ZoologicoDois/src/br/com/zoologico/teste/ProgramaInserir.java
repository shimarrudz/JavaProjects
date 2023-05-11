package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;


public class ProgramaInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Mamifero mamifero = new Mamifero();
		MamiferoDAO mamiferodao = new MamiferoDAO(con);
		
		//Testando o método inserir
		mamifero.setNome("Teste TDSPS 2.1");
		mamifero.setIdade(35);
		mamifero.setMesesGestacao(3);
		
		System.out.println(mamiferodao.inserir(mamifero));
		
		Conexao.fecharConexao(con);
	}
}