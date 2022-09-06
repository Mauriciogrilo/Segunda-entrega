package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {

	//Nome do usuario do mysql
	private static final String USERNAME = "root";
	// Senha do mysql
	private static final String PASSWORD = "";
	// Dados de caminho, porta e nome da base de dados que ira ser feita a conexão
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/voealto";
	
	public static Connection createConnectionToMySQL() throws
	Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		
		return connection;
	}
	public static void main (String[]args) throws Exception{
		
		Connection con = createConnectionToMySQL();
		
		if(con != null) {
			System.out.println("Conexão obtida com sucesso!" +con);
			con.close();
		}
	}
	
}
	