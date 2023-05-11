package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Beijinho;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BeijinhoDAO;

public class BeijinhoModificar {
	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();

		Beijinho beijinho = new Beijinho();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);


		beijinho.setNome("Beijinho do Pipo");
		beijinho.setValor(15.50);
		
		
		System.out.println(beijinhodao.modificarWhereNome(beijinho));

		Conexao.fecharConexao(con);

	}

}

