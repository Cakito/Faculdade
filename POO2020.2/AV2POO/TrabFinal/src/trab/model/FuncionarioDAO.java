package trab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trab.jdbc.ConnectionFactory;
import trab.bo.Funcionario;

public class FuncionarioDAO {
	
	public void create(Funcionario funcionario) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into Funcionario(nome, id, senha) values (?, ?, ?)";
		
		try {
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getId());
			stmt.setString(3, funcionario.getSenha());
		
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public List<Funcionario> read() throws SQLException{
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from Funcionario";
	
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Funcionario funcionario = new Funcionario();
				
				funcionario.setNome(rs.getString("nome"));
				funcionario.setId(rs.getString("id"));
				//funcionario.setSenha(rs.getString("senha"));
				
				funcionarios.add(funcionario);
			}
			
		}catch(SQLException e) {
			
			System.out.println("<DAO> Erro lendo banco");
	}
		return funcionarios;
	}
	
	public void update(Funcionario funcionario) {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update Funcionario set nome = ? where id = ?";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getId());
          // stmt.setString(3, funcionario.getSenha());
                        
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public void delete(Funcionario funcionario) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from Funcionario where id = ?";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, funcionario.getId());
			
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
}
