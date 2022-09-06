package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.ConnectionMySQL;
import model.Enderecos;

public class EnderecosDAO {

	public void save(Enderecos endereco) {

		String sql = "INSERT INTO endereco" + "(ID_ENDERECO, ID_CLIENTE, LOGADOURO, ESTADO, CIDADE)"
				+ "VALUES (?, ?, ?, ?, ?)";
		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, endereco.getId_endereco());
			pstm.setInt(2, endereco.getClientes().getId_cliente());
			pstm.setString(3, endereco.getLogadouro());
			pstm.setString(4, endereco.getEstado());
			pstm.setString(5, endereco.getCidade());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// DELETE
	public void removeById(int id) {
		String sql = "DELETE FROM endereco WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	// UPDATE

	public void update(Enderecos endereco) {
		String sql = "UPDATE endereco SET logadouro =?, estado =?, cidade=? " + "WHERE id =?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, endereco.getId_endereco());
			pstm.setInt(2, endereco.getClientes().getId_cliente());
			pstm.setString(3, endereco.getLogadouro());
			pstm.setString(4, endereco.getEstado());
			pstm.setString(5, endereco.getCidade());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}