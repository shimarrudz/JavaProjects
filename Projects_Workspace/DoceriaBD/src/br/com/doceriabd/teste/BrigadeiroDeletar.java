package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Brigadeiro;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BrigadeiroDAO;

public class BrigadeiroDeletar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();

		Brigadeiro brigadeiro = new Brigadeiro();
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);

		brigadeiro.setValor(20.50);
		
		System.out.println(brigadeirodao.deletarWhere(brigadeiro));

		Conexao.fecharConexao(con);
	}

}



