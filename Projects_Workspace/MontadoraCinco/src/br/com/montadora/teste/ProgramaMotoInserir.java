package br.com.montadora.teste;

import java.sql.Connection;


import br.com.montadora.beans.Moto;
import br.com.montadora.dao.MotoDAO;
import br.com.montadoracinco.conexao.Conexao;

public class ProgramaMotoInserir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = Conexao.abrirConexao();
		
		Moto moto = new Moto();
		
		MotoDAO motodao = new MotoDAO(con);
		
		moto.setModelo("Kawasaki");
		moto.setQuantidadeAdesivo(12);
		moto.setCapacidadeCombustivel(20);
	
		
		System.out.println(motodao.inserir(moto));

	}

}
