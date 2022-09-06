package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import connection.ConnectionMySQL;
import model.Clientes;

public class ClientesDAO {

	public void save(Clientes cliente) {

		String sql = "INSERT INTO cliente"
				+ "(ID_CLIENTE, ID_ENDERECO, ID_PACOTE, NOME, NASCIMENTO, EMAIL, SEXO, TELEFONE)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, cliente.getId_cliente());
			pstm.setInt(2, cliente.getEndereco().getId_endereco());
			pstm.setInt(3, cliente.getPacote().getId_pacote());
			pstm.setString(4, cliente.getNome());
			pstm.setString(5, cliente.getNascimento());
			pstm.setString(6, cliente.getEmail());
			pstm.setString(7, cliente.getSexo());
			pstm.setDouble(8, cliente.getTelefone());

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
		String sql = "DELETE FROM clientes WHERE id = ?";

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

	public void update(Clientes cliente) {
		String sql = "UPDATE clientes SET nome =?, nascimento =?, email =?, sexo =?, telefone =?" + "WHERE id =?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, cliente.getId_cliente());
			pstm.setInt(2, cliente.getEndereco().getId_endereco());
			pstm.setInt(3, cliente.getPacote().getId_pacote());
			pstm.setString(4, cliente.getNome());
			pstm.setString(5, cliente.getNascimento());
			pstm.setString(6, cliente.getEmail());
			pstm.setString(7, cliente.getSexo());
			pstm.setDouble(8, cliente.getTelefone());

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
	
	
}










