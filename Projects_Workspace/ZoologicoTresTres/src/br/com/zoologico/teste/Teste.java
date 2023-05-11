package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		
		Mamifero mamifero = new Mamifero();
		
		MamiferoDAO mamiferodao = new MamiferoDAO(con);
		
		
		mamifero.setNome("TigreSextou");
		mamifero.setIdade(13);
		mamifero.setMesesGestacao(4);
		
		System.out.println(mamiferodao.inserir(mamifero));

	}

}
