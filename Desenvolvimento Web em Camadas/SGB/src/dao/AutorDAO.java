package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Autor;

public class AutorDAO implements InAutorDAO {
	
	private Connection conexao;
	
	public  AutorDAO(Connection _conexao) {
		this.conexao = _conexao;
		
	}

	@Override
	public void inserir(Autor _objeto) throws SQLException {
		
		String SQL = "INSERT INTO autor (id_au, nome_au) VALUES (?, ?)";

		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _objeto.getId_au());
		ps.setString(2, _objeto.getNome_au());
		
		ps.execute();
	}

	@Override
	public Autor recuperarPeloID(int _id_au) throws SQLException {
		
		String SQL = "SELECT " + "id_au, nome_au" + " FROM autor WHERE id_au = " + _id_au;
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Autor a = null;
		
		if(rs.next()) {
			
			int id_au = rs.getInt(1);
			String nome_au = rs.getString(2);
			
			a = new Autor(id_au, nome_au);
		
		}
		return a;
	}

	@Override
	public List<Autor> recuperarTodos() throws SQLException {
		
		List<Autor> listaAutores = new ArrayList<Autor>();
		
		String SQL = "SELECT id_au, nome_au FROM autor";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id_au = rs.getInt(1);
			String nome_au = rs.getString(2);
			
			Autor a = new Autor(id_au, nome_au);
			
			listaAutores.add(a);
		}
		
		return listaAutores;
	}

	@Override
	public Boolean atualizar(Autor _objeto) throws SQLException {
		
		String SQL = "UPDATE autor SET nome_au = ? WHERE id_au = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, _objeto.getNome_au());
		ps.setInt(2, _objeto.getId_au());
		
		if(ps.executeUpdate() == 1) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	@Override
	public Boolean deletar(int _id_au) throws SQLException {
		
		String SQL = "DELETE FROM autor WHERE id_au = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _id_au);
		
		return ps.execute();
	}

}
