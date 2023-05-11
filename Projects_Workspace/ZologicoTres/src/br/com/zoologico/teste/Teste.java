package br.com.zoologico.teste;

import java.sql.Connection;

import br.com.zoologico.beans.Mamifero;
import br.com.zoologico.conexao.Conexao;
import br.com.zoologico.dao.MamiferoDAO;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = Conexao.abrirConexao();
		
		
		Mamifero mamifero = new Mamifero();
		//Instanciando a classe mamiferoDAO
		MamiferoDAO mamiferoDAO = new MamiferoDAO(con);
		
		mamifero.setNome("Tigre");
		mamifero.setIdade(7);
		mamifero.setMesesGestacao(4);
		
		
		System.out.println(mamiferoDAO.inserir(mamifero));
		
	
	}

}

