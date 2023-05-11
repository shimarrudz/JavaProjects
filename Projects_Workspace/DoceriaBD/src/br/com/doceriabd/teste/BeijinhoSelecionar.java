package br.com.doceriabd.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.doceriabd.beans.Beijinho;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BeijinhoDAO;

public class BeijinhoSelecionar {
	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		BeijinhoDAO beijinhodao = new BeijinhoDAO(con);

		// Deve ser instanciado um array list
		ArrayList<Beijinho> lista = beijinhodao.retornarDados();

		// Testando o m�todo selecionar
		if (lista != null) {
			for (Beijinho beijinho : lista) {
				System.out.println("Nome: " + beijinho.getNome());
				System.out.println("Valor: " + beijinho.getValor());
				System.out.println("Peso Chocolate: " + beijinho.getPesoCoco());
			}
		}

		System.out.println(beijinhodao.retornarDados());
		Conexao.fecharConexao(con);
	}

}
