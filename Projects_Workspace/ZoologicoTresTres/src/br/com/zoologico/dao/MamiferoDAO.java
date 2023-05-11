package br.com.zoologico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.zoologico.beans.Mamifero;

public class MamiferoDAO {
	
	//Método inserir
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
		String sql = "insert into mamifero(nome, idade, mesesgestacao) values (?,?,?)";
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
}