package br.com.zoologico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.zoologico.beans.Mamifero;

public class MamiferoDAO {

	// M�todo inserir
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public MamiferoDAO(Connection con) {
		setCon(con);
	}

	public String inserir(Mamifero mamifero) {
		String sql = "insert into mamifero(nome, idade, " + "mesesgestacao) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, mamifero.getNome());
			ps.setInt(2, mamifero.getIdade());
			ps.setInt(3, mamifero.getMesesGestacao());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletar() {
		String sql = "delete from mamifero";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	// Deletar com where
	public String deletarWhere(Mamifero mamifero) {
		String sql = "delete from mamifero where idade = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, mamifero.getIdade());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	// M�todo modificar
	// "update carrodois set capacidadecombustivel = ? " + "where modelo = ?"

	public String modificar(Mamifero mamifero) {
		String sql = "update mamifero set mesesgestacao = ? where mesesgestacao = 3";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, mamifero.getMesesGestacao());
			if (ps.executeUpdate() > 0) {
				return "Modificado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	//Modificar mesesgestacao e where pelo nome
	
	public String modificarWhereNome(Mamifero mamifero) {
		String sql = "update mamifero set mesesgestacao = ? where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, mamifero.getMesesGestacao());
			ps.setString(2, mamifero.getNome());
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
	
	public ArrayList<Mamifero> retornarDados(){
		String sql = "select * from mamifero";
		ArrayList<Mamifero> retornarMamifero = new ArrayList<Mamifero>();
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs != null) {
				while(rs.next()) {
					Mamifero mamifero = new Mamifero();
					mamifero.setNome(rs.getString(1));
					mamifero.setIdade(rs.getInt(2));
					mamifero.setMesesGestacao(rs.getInt(3));
					retornarMamifero.add(mamifero);
				} return retornarMamifero;
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		}
		
	}
	
}
