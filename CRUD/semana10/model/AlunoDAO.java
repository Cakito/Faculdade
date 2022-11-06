package semana10.model;

import semana10.bo.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semana10.jdbc.ConnectionFactory;

//Acesso ao banco de dados

public class AlunoDAO {
	
	public void create(Aluno aluno) throws SQLException
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aluno(username, email, password, create_time ) values (?, ?, ?, CURRENT_TIMESTAMP )";
		
		try
		{
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, aluno.getUsername() ); //primeiro parametro da query
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getPassword());
			
			stmt.executeUpdate();
			System.out.println("[AlunoDAO] Aluno incluido com sucesso");
			
			
		} catch (SQLException e){
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}

	public List<Aluno> read() throws SQLException {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "select * from aluno";
		
		try
		{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Aluno aluno = new Aluno();
				aluno.setUsername(rs.getString("username"));
				aluno.setEmail(rs.getString("email"));
				listaAlunos.add(aluno);
			}
			
		}catch(SQLException e){
			System.out.println("<DAO> Erro lendo banco");
		}
		
		return listaAlunos;
	}
	
	public void update(Aluno aluno) throws SQLException
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update aluno set username = ? where email = ?";
		
		try
		{
			stmt = con.prepareStatement(sql);  
			stmt.setString(1, aluno.getUsername()); 
			stmt.setString(2, aluno.getEmail());
			
			stmt.executeUpdate();
			System.out.println("[AlunoDAO] A tabela foi atualizada com sucesso");
			
		} 
		catch (SQLException e){
			System.out.println("Erro na tentativa de atualizacao da tabela: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
	}
	
	public void delete(Aluno aluno) throws SQLException {
		
		Connection con =  ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from aluno where username = ?";
		
		try
		{
			stmt = con.prepareStatement(sql);
			stmt.setString(1, aluno.getUsername());
			
			stmt.executeUpdate();
			System.out.println("[AlunoDAO] Usuario excluido com Sucesso");
		}
		catch(SQLException e) {
			System.out.println("Erro na tentativa de deletar informacoes da tabela: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con,stmt);
		}
	}
}
