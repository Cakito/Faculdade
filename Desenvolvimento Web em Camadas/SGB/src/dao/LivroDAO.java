package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import model.Livro;


public class LivroDAO implements InLivroDAO {
	
	private Connection conexao;
	
	public LivroDAO(Connection _conexao) {
		this.conexao = _conexao;
		
	}

	@Override
	public void inserir(Livro _objeto) throws SQLException {
	
		String SQL = "INSERT INTO livro (isbn, titulo, ano, volume, edicao, autor_id_au, editora_id_edit ) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _objeto.getIsbn());
		ps.setString(2, _objeto.getTitulo());
		ps.setInt(3, _objeto.getAno());
		ps.setInt(4, _objeto.getVolume());
		ps.setInt(5, _objeto.getEdicao());
		ps.setInt(6, _objeto.getAutor().getId_au());
		ps.setInt(7, _objeto.getEditora().getId_edit());
		ps.execute();
	}

	@Override
	public Livro recuperarPeloID(int _isbn) throws SQLException {
		
		String SQL = "SELECT " + "isbn, titulo, ano, volume, edicao, autor_id_au, editora_id_edit" + " FROM livro WHERE isbn = " + _isbn;
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Livro l = null;
		
		if(rs.next()) {
			
			int isbn = rs.getInt(1);
			String titulo = rs.getString(2);
			int ano = rs.getInt("ano");		
			int volume = rs.getInt("volume");
			int edicao = rs.getInt("edicao");
			int autor_id_au = rs.getInt("autor_id_au");
			int editora_id_edit = rs.getInt("editora_id_edit");
			
			AutorDAO ad = new AutorDAO(this.conexao);
			EditoraDAO ed = new EditoraDAO(this.conexao);
			
			 l = new Livro(isbn, ano, titulo, volume, edicao, ad.recuperarPeloID(autor_id_au), ed.recuperarPeloID(editora_id_edit));
				
		}
		
		return l;
	}

	@Override
	public List<Livro> recuperarTodos() throws SQLException {
	
		List<Livro> listaLivros = new ArrayList<Livro>();
		
		String SQL = "SELECT " + "isbn, titulo, ano, volume, edicao, autor_id_au, editora_id_edit" + " FROM livro";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int isbn = rs.getInt(1);
			String titulo = rs.getString(2);
			int ano = rs.getInt("ano");
			int volume = rs.getInt("volume");
			int edicao = rs.getInt("edicao");
			int autor_id_au = rs.getInt("autor_id_au");
			int editora_id_edit = rs.getInt("editora_id_edit");
			
			AutorDAO ad = new AutorDAO(this.conexao);
			EditoraDAO ed = new EditoraDAO(this.conexao);
			
			Livro l  = new Livro(isbn, ano, titulo, volume, edicao, ad.recuperarPeloID(autor_id_au), ed.recuperarPeloID(editora_id_edit));
			
			listaLivros.add(l);
		}
		
		return listaLivros;
	}

	@Override
	public Boolean atualizar(Livro _objeto) throws SQLException {
	
		String SQL = "UPDATE livro SET titulo = ?, ano = ?, volume = ?, edicao = ?, autor_id_au = ?, editora_id_edit = ? WHERE isbn = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, _objeto.getTitulo());
		ps.setInt(2, _objeto.getAno());
		ps.setInt(3, _objeto.getVolume());
		ps.setInt(4, _objeto.getEdicao());
		ps.setInt(5, _objeto.getAutor().getId_au());
		ps.setInt(6, _objeto.getEditora().getId_edit());
		ps.setInt(7, _objeto.getIsbn());
		
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
	public Boolean deletar(int _isbn) throws SQLException {
	
		String SQL = "DELETE FROM livro WHERE isbn = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _isbn);
		
		return ps.execute();
	}
}
