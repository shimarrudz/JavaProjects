package br.com.doceriabd.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.doceriabd.beans.Brigadeiro;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BrigadeiroDAO;


public class BrigadeiroSelecionar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);
		
		ArrayList<Brigadeiro> lista = brigadeirodao.retornarDados();
		
		if(lista != null) {
			for(Brigadeiro brigadeiro : lista ) {
				System.out.print(brigadeiro.getNome() + " ");
				System.out.print(brigadeiro.getValor() + " ");
				System.out.println(brigadeiro.getPesoChocolate()+ " " );
			}
		}
	}
}
