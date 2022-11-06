package semana10.jdbc;

import java.sql.Connection;

public class TestBD {

	public static void main(String[] args) {
		
		Connection con = ConnectionFactory.getConnection();
		
		System.out.println("Conexão Ok");

	}

}
