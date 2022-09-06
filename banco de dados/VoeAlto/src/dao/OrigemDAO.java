package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConnectionMySQL;
import model.Origens;

public class OrigemDAO {
	
	private PreparedStatement pstm;

	public void save(Origens origem) throws SQLException {
		
		String sql = "INSERT INTO origem" + "(ID_ORIGEM, ID_PACOTE, ID_PROMOCAO, CIDADE)" + "VALUES (?, ?, ?, ?)";
		
		Connection conn = null;
		pstm = null;
		
		pstm.setInt(1, origem.getId_origem());
		pstm.setInt(2, origem.getPacotes() .getId_pacote());
		pstm.setInt(3, origem.getPromocoes() .getId_promocao());
		pstm.setString(4, origem.getCidade());
		
		pstm.execute();
		
		try {
			
		}catch (Exception e) {
			e.printStackTrace();
	}finally {
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
			String sql = "DELETE FROM origem WHERE id = ?";

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

		public void update(Origens origem) {
			String sql = "UPDATE origens SET cidade =?" + "WHERE id =?";

			Connection conn = null;
			PreparedStatement pstm = null;

			try {
				conn = ConnectionMySQL.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);

				pstm.setInt(1, origem.getId_origem());
				pstm.setInt(2, origem.getPacotes() .getId_pacote());
				pstm.setInt(3, origem.getPromocoes() .getId_promocao());
				pstm.setString(4, origem.getCidade());

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



