package br.com.doceriabd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.doceriabd.beans.Beijinho;

public class BeijinhoDAO  {
	
	
	// Método inserir
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public BeijinhoDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Beijinho beijinho) {
		String sql = "insert into beijinho(nome, valor, " + "pesoCoco) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, beijinho.getNome());
			ps.setDouble(2, beijinho.getValor());
			ps.setDouble(3, beijinho.getPesoCoco());
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
	public String deletarWhere(Beijinho beijinho) {
		String sql = "delete from beijinho where valor = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, beijinho.getValor());
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
	
	public String modificarWhereNome(Beijinho beijinho) {
		String sql = "update beijinho set valor = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setDouble(1, beijinho.getValor());
			ps.setString(2, beijinho.getNome());
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
	
	public ArrayList<Beijinho> retornarDados(){
		String sql = "select * from brigadeiro";
		ArrayList<Beijinho> retornarBrigadeiro = new ArrayList<Beijinho>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Beijinho beijinho = new Beijinho();
					beijinho.setNome(rs.getString(1));
					beijinho.setValor(rs.getDouble(2));
					beijinho.setPesoCoco(rs.getDouble(3));
					retornarBrigadeiro.add(beijinho);
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
