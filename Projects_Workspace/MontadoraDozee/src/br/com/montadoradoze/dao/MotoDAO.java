package br.com.montadoradoze.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.montadoradoze.beans.Moto;


public class MotoDAO {
	
	
	// Método inserir
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public MotoDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Moto moto) {
		String sql = "insert into moto(modelo, capacidadeCombustivel, " + "quantidadeAdesivo) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, moto.getModelo());
			ps.setDouble(2, moto.getCapacidadeCombustivel());
			ps.setInt(3, moto.getQuantidadeAdesivo());
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
	public String deletarWhere(Moto moto) {
		String sql = "delete from moto where capacidadeCombustivel = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, moto.getCapacidadeCombustivel());
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
	
	public String modificarWhereNome(Moto moto) {
		String sql = "update moto set valor = ? where modelo = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, moto.getCapacidadeCombustivel());
			ps.setString(2, moto.getModelo());
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
	
	public ArrayList<Moto> retornarDados(){
		String sql = "select * from moto";
		ArrayList<Moto> retornarMoto = new ArrayList<Moto>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Moto moto = new Moto();
					moto.setModelo(rs.getString(1));
					moto.setCapacidadeCombustivel(rs.getDouble(2));
					moto.setQuantidadeAdesivo(rs.getInt(3));
					retornarMoto.add(moto);
				} return retornarMoto;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
		
	}
	
}

