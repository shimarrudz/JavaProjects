package br.com.doceriabd.teste;

import java.sql.Connection;

import br.com.doceriabd.beans.Brigadeiro;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BrigadeiroDAO;

public class BrigadeiroModificar {
		public static void main(String[] args) {
			
			Connection con = Conexao.abrirConexao();

			Brigadeiro brigadeiro = new Brigadeiro();
			BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);

			brigadeiro.setNome("Brigadeiro da vovó");
			brigadeiro.setValor(1.20);
			
			
			System.out.println(brigadeirodao.modificarWhereNome(brigadeiro));

			Conexao.fecharConexao(con);

		}

	}


