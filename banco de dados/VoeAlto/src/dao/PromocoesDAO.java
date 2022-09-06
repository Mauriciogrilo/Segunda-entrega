package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.ConnectionMySQL;
import model.Promocoes;

public class PromocoesDAO {
	
	public void save(Promocoes promocao) {
	String sql = "INSERT INTO promocao" + "(ID_PROMOCAO, ID_DESTINO, ID_ORIGEM, DESCONTO, VALIDADE)" + "VALUES (?, ?, ?, ?, ?)"; 
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = ConnectionMySQL.createConnectionToMySQL();
		pstm = conn.prepareStatement(sql);
		
		pstm.setInt(1, promocao.getId_promocao());
		pstm.setInt(2, promocao.getDestino() .getId_destino());
		pstm.setInt(3, promocao.getOrigem() .getId_origem());
		pstm.setDouble(4, promocao.getDesconto());
		pstm.setDouble(5, promocao.getValidade());
		
		pstm.execute();
		
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
	String sql = "DELETE FROM promocao WHERE id = ?";

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
		public void update(Promocoes promocao) {
			
			String sql = "UPDATE promocoes SET desconto =?, validade =?" + "WHERE id =?";

			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = ConnectionMySQL.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, promocao.getId_promocao());
				pstm.setInt(2, promocao.getDestino() .getId_destino());
				pstm.setInt(3, promocao.getOrigem() .getId_origem());
				pstm.setDouble(4, promocao.getDesconto());
				pstm.setDouble(5, promocao.getValidade());
				
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
	}

