package br.com.montadora.teste;

import java.sql.Connection;

import br.com.montadora.beans.Carro;
import br.com.montadora.dao.CarroDAO;
import br.com.montadoracinco.conexao.Conexao;


public class ProgramaCarroInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		
		CarroDAO carrodao = new CarroDAO(con);
		
		
		carro.setModelo("Gol g4");
		carro.setCapacidadeCombustivel(50);
		carro.setQuantidadeJanela(5);
		
		System.out.println(carrodao.inserir(carro));

	}

}
