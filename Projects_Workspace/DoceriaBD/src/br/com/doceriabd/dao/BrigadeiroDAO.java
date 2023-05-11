package br.com.doceriabd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.doceriabd.beans.Brigadeiro;

public class BrigadeiroDAO {
	
	
	// Método inserir
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public BrigadeiroDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Brigadeiro brigadeiro) {
		String sql = "insert into brigadeiro(nome, valor, " + "pesoChocolate) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, brigadeiro.getNome());
			ps.setDouble(2, brigadeiro.getValor());
			ps.setDouble(3, brigadeiro.getPesoChocolate());
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
	public String deletarWhere(Brigadeiro brigadeiro) {
		String sql = "delete from brigadeiro where valor = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, brigadeiro.getValor());
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
	
	public String modificarWhereNome(Brigadeiro brigadeiro) {
		String sql = "update brigadeiro set valor = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, brigadeiro.getValor());
			ps.setString(2, brigadeiro.getNome());
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
	
	public ArrayList<Brigadeiro> retornarDados(){
		String sql = "select * from brigadeiro";
		ArrayList<Brigadeiro> retornarBrigadeiro = new ArrayList<Brigadeiro>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Brigadeiro brigadeiro = new Brigadeiro();
					brigadeiro.setNome(rs.getString(1));
					brigadeiro.setValor(rs.getDouble(2));
					brigadeiro.setPesoChocolate(rs.getDouble(3));
					retornarBrigadeiro.add(brigadeiro);
				} return retornarBrigadeiro;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
		
	}
	
}


