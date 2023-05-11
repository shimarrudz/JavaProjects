package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Brigadeiro;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BrigadeiroDAO;



public class BrigadeiroInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);
		
		//Testando o método inserir
		brigadeiro.setNome("Brigadeiro da vovó");
		brigadeiro.setValor(20.50);
		brigadeiro.setPesoChocolate(2.56);
		
		System.out.println(brigadeirodao.inserir(brigadeiro));
		
		Conexao.fecharConexao(con);
	}
}
