package br.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.montadora.beans.Moto;


public class MotoDAO {
	
	//M�todo inserir
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

	public String inserir(Moto motoum) {
		String sql = "insert into moto(modelo, quantidadeadesivo, capacidadecombustivel) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, motoum.getModelo());
			ps.setInt(2, motoum.getQuantidadeAdesivo());
			ps.setInt(3, motoum.getCapacidadeCombustivel());
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