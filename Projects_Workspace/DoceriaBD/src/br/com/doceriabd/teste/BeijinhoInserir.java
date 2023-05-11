package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Beijinho;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BeijinhoDAO;

public class BeijinhoInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Beijinho beijinho = new Beijinho();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);
		
		//Testando o método inserir
		beijinho.setNome("Beijinho do Pipo");
		beijinho.setValor(18.50);
		beijinho.setPesoCoco(3.2);
		
		System.out.println(beijinhodao.inserir(beijinho));
		
		Conexao.fecharConexao(con);
	}
}
