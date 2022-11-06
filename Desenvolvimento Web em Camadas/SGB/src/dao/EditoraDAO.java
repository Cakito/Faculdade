package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Editora;

public class EditoraDAO implements InEditoraDAO {
	
	private Connection conexao;
	
	public EditoraDAO(Connection _conexao) {
		this.conexao = _conexao;
		
	}

	@Override
	public void inserir(Editora _objeto) throws SQLException {
		
		String SQL = "INSERT INTO editora (id_edit, nome_edit) VALUES (?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _objeto.getId_edit());
		ps.setString(2, _objeto.getNome_edit());
		
		ps.execute();
	}

	@Override
	public Editora recuperarPeloID(int _id_edit) throws SQLException {
		
		String SQL = "SELECT " + "id_edit, nome_edit" + " FROM editora WHERE id_edit = " + _id_edit;
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Editora e = null;
		
		if(rs.next()) {
			
			int id_edit = rs.getInt(1);
			String nome_edit = rs.getString(2);
			
			e = new Editora(id_edit, nome_edit);
		
		}
		return e;
	}

	@Override
	public List<Editora> recuperarTodos() throws SQLException {
		
		List<Editora> listaEditoras = new ArrayList<Editora>();
		
		String SQL = "SELECT id_edit, nome_edit FROM editora";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id_edit = rs.getInt(1);
			String nome_edit = rs.getString(2);
			
			Editora e = new Editora(id_edit, nome_edit);
			
			listaEditoras.add(e);
		}
		
		return listaEditoras;
	}

	@Override
	public Boolean atualizar(Editora _objeto) throws SQLException {
		
		String SQL = "UPDATE editora SET nome_edit = ? WHERE id_edit = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, _objeto.getNome_edit());
		ps.setInt(2, _objeto.getId_edit());
		
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
	public Boolean deletar(int _id_edit) throws SQLException {
		
		String SQL = "DELETE FROM editora WHERE id_edit = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _id_edit);
		
		return ps.execute();
	}

}
