package trab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trab.jdbc.ConnectionFactory;
import trab.bo.Departamento;

public class DepartamentoDAO {
	
	public void create(Departamento dept) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into Departamento(nome, codigo) values (?, ?)";
		
		try {
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, dept.getNome());
			stmt.setString(2, dept.getCodigo());
			
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	
	public List<Departamento> read(){
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from Departamento";
		
		List<Departamento> listadept = new ArrayList<Departamento>();
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				Departamento departamento = new Departamento();
				departamento.setNome(rs.getString("nome"));
				departamento.setCodigo(rs.getString("codigo"));
				
				listadept.add(departamento);
			}
			
		}catch(SQLException e) {
			System.out.println("<DAO> Erro lendo banco");
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return listadept;
	}
	
	public void update(Departamento dept) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update Departamento set nome = ? where codigo = ?";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, dept.getNome());
            stmt.setString(2, dept.getCodigo());
		
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Erro na tentativa de atualizacao da tabela: "+ e.getMessage());
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	public void delete(Departamento dept) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from Departamento where codigo = ?";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, dept.getCodigo());
			
			stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("Erro na tentativa de deletar informacoes da tabela: "+ e.getMessage());
		}finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
}
