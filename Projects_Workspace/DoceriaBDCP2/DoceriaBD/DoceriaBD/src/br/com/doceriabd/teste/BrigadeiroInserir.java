package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Brigadeiro;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BrigadeiroDAO;



public class BrigadeiroInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeiroDAO = new BrigadeiroDAO(con);
		
		//Testando o m�todo inserir
		brigadeiro.setNome("Brigadeiro 17/04/2023");
		brigadeiro.setValor(1704);
		brigadeiro.setPesoChocolate(17);
		
		System.out.println(brigadeiroDAO.inserir(brigadeiro));
		
		Conexao.fecharConexao(con);
	}
}