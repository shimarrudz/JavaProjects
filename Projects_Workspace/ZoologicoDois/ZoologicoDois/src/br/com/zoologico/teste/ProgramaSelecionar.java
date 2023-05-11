package br.com.zoologico.teste;

import java.sql.Connection;
import java.util.ArrayList;
import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class ProgramaSelecionar {	
	public static void main(String[] args) {

	
	Connection con = Conexao.abrirConexao();
	MamiferoDAO mamiferodao = new MamiferoDAO(con);
	
	// Deve ser instanciado um array list
	ArrayList<Mamifero> lista = mamiferodao.retornarDados();
	
	//Testando o m�todo selecionar
	if(lista != null) {
		for(Mamifero mamifero : lista) {
			System.out.println("Nome: " + mamifero.getNome());
			System.out.println("Idade: " + mamifero.getIdade());
			System.out.println("Meses gestação: " + mamifero.getMesesGestacao());
		}
	}
	
	
	
	System.out.println(mamiferodao.retornarDados());
	Conexao.fecharConexao(con);
}

}
