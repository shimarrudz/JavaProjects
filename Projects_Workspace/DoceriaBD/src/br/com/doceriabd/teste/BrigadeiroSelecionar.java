package br.com.doceriabd.teste;

import java.sql.Connection;
import java.util.ArrayList;

import br.com.doceriabd.beans.Brigadeiro;
import br.com.doceriabd.conexao.Conexao;
import br.com.doceriabd.dao.BrigadeiroDAO;

public class BrigadeiroSelecionar{	
	public static void main(String[] args) {
	
	Connection con = Conexao.abrirConexao();
	BrigadeiroDAO brigadeirodao = new BrigadeiroDAO(con);
	
	
	// Deve ser instanciado um array list
	ArrayList<Brigadeiro> lista = brigadeirodao.retornarDados();
	
	//Testando o m�todo selecionar
	if(lista != null) {
		for(Brigadeiro brigadeiro : lista) {
			System.out.println("Nome: " + brigadeiro.getNome());
			System.out.println("Valor: " + brigadeiro.getValor());
			System.out.println("Peso Chocolate: " + brigadeiro.getPesoChocolate());
		}
	}
	
	
	
	System.out.println(brigadeirodao.retornarDados());
	Conexao.fecharConexao(con);
}

}
