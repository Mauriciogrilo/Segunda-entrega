package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import model.Destinos;

public class DestinosDAO {

	public void save(Destinos destino) {

		String sql = "INSERT INTO destino" + "(ID_DESTINO, ID_PACOTE, ID_PROMOCAO, CIDADE)" + "VALUES (?, ?, ?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, destino.getId_destino());
			pstm.setInt(2, destino.getPacotes().getId_pacote());
			pstm.setInt(3, destino.getPromocoes().getId_promocao());
			pstm.setString(4, destino.getCidade());

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
		String sql = "DELETE FROM destinos WHERE id = ?";

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

	public void update(Destinos destino) {
		String sql = "UPDATE destinos SET cidade =?" + "WHERE id =?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, destino.getPacotes().getId_pacote());
			pstm.setInt(2, destino.getPromocoes().getId_promocao());
			pstm.setString(3, destino.getCidade());

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

	public List<Destinos> getdestino() {

		String sql = "SELECT * FROM Destinos";
		List<Destinos> destino = new ArrayList<Destinos>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			while (rset.next()) {
				Destinos destino1 = new Destinos(0, null, null, sql);

				destino1.setId_destino(rset.getInt("id_destino"));
				destino1.setCidade(rset.getString("cidade"));

				Destinos.add(destino1);
			}

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
		return destino;
	}
}
