package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Beijinho;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BeijinhoDAO;

public class BeijinhoDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();

		Beijinho beijinho = new Beijinho();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);

		beijinho.setValor(15.50);
		
		System.out.println(beijinhodao.deletarWhere(beijinho));

		Conexao.fecharConexao(con);
	}

}
