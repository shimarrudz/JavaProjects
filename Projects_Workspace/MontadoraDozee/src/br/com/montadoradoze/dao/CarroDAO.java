package br.com.montadoradoze.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.montadoradoze.beans.Carro;


public class CarroDAO {
	
	// Método inserir
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public CarroDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Carro carro) {
		String sql = "insert into carro(modelo, capacidadeCombustivel, " + "quantidadeJanela) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			ps.setDouble(2, carro.getCapacidadeCombustivel());
			ps.setInt(3, carro.getQuantidadeJanela());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	// Deletar com where
	public String deletarWhere(Carro carro) {
		String sql = "delete from carro where valor = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Modificar valor e where pelo nome
	
	public String modificarWhereNome(Carro carro) {
		String sql = "update carro set valor = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			ps.setDouble(2, carro.getCapacidadeCombustivel());
			if (ps.executeUpdate() > 0) {
				return "Modificado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	
	//Modificar select utilizando ArrayList
	
	public ArrayList<Carro> retornarDados(){
		String sql = "select * from carro";
		ArrayList<Carro> retornarCarro = new ArrayList<Carro>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Carro carro = new Carro();
					carro.setModelo(rs.getString(1));
					carro.setCapacidadeCombustivel(rs.getDouble(2));
					carro.setQuantidadeJanela(rs.getInt(3));
					retornarCarro.add(carro);
				} return retornarCarro;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
		
	}
	
}

