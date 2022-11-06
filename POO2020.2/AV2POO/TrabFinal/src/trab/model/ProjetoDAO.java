package trab.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import trab.bo.Projeto;
import trab.jdbc.ConnectionFactory;

public class ProjetoDAO {
	
	public void create(Projeto projeto) throws SQLException
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into Projeto(nome, numero) values (?, ?)";
		
		try
		{
			stmt = con.prepareStatement(sql);  

			stmt.setString(1, projeto.getNome());
			stmt.setString(2, projeto.getNumero()); 
			
			stmt.executeUpdate();
			
			
		} catch (SQLException e){
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}

	public List<Projeto> read() throws SQLException {
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from Projeto";
		
		List<Projeto> listaproj = new ArrayList<Projeto>();
		
		try
		{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Projeto projeto = new Projeto();
				projeto.setNome(rs.getString("nome"));
				projeto.setNumero(rs.getString("numero"));

				listaproj.add(projeto);
			}
			
		}catch(SQLException e){
			System.out.println("<DAO> Erro lendo banco");
		}
		
		return listaproj;
	}
	
	public void update(Projeto projeto) throws SQLException
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update Projeto set nome = ? where numero = ?";
		
		try
		{
			stmt = con.prepareStatement(sql);  
			stmt.setString(1, projeto.getNome());
			stmt.setString(2, projeto.getNumero()); 

			stmt.executeUpdate();
			
		} 
		catch (SQLException e){
			System.out.println("Erro na tentativa de atualizacao da tabela: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
	}
	
	public void delete(Projeto projeto) throws SQLException {
		
		Connection con =  ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from Projeto where numero = ?";
		
		try
		{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, projeto.getNumero());
			
			stmt.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println("Erro na tentativa de deletar informacoes da tabela: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
	}

}
