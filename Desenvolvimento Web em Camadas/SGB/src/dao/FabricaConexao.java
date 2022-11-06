package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao {
	
	private Connection conn;
	
	public Connection fazerConexao(){
		
		try {
			
				Class.forName("com.mysql.jdbc.Driver");
			
				String strConn = "jdbc:mysql://localhost:3306/sgb";
				String user ="root";
				String pass = "admin";
			
				conn = DriverManager.getConnection(strConn, user, pass);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return this.conn;
	}
	
	public void fecharConexao() {
		
		try {
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
