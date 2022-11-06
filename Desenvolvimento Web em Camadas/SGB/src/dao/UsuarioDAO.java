package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioDAO implements InUsuarioDAO {
	
	private Connection conexao;
	
	public UsuarioDAO(Connection _conexao) {
		this.conexao = _conexao;
		
	}

	@Override
	public void inserir(Usuario _objeto) throws SQLException {
		
		String SQL = "INSERT INTO usuario (cpf, nome_usu, dataNasc, celular, email) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, _objeto.getCpf());
		ps.setString(2, _objeto.getNome_usu());
		ps.setDate(3, Date.valueOf( _objeto.getDataNasc()));
		ps.setString(4, _objeto.getCelular());
		ps.setString(5, _objeto.getEmail());
		
		ps.execute();
	
	}

	@Override
	public Usuario recuperarPeloID(String _cpf) throws SQLException {
		
		String SQL = "SELECT " + "cpf, nome_usu, dataNasc, celular, email" + " FROM usuario WHERE cpf = " + _cpf;
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Usuario u = null;
		
		if(rs.next()) {
			
			String cpf = rs.getString(1);
			String nome_usu = rs.getString(2);
			LocalDate dataNasc = rs.getDate(3).toLocalDate();
			String celular = rs.getString("celular");
			String email = rs.getString("email");
			
			u = new Usuario(cpf, nome_usu, dataNasc, celular, email);
		
		}
		return u;
	}

	@Override
	public List<Usuario> recuperarTodos() throws SQLException {
		// Preenchimento da lista para retorno da camada requisitante
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		String SQL = "SELECT " + "cpf, nome_usu, dataNasc, celular, email" + " FROM usuario";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			String cpf = rs.getString(1);
			String nome_usu = rs.getString(2);
			LocalDate dataNasc = rs.getDate(3).toLocalDate();
			String celular = rs.getString("celular");
			String email = rs.getString("email");
			
			Usuario u = new Usuario(cpf, nome_usu, dataNasc, celular, email);
			
			listaUsuarios.add(u);
		}
		
		return listaUsuarios;
	}

	@Override
	public Boolean atualizar(Usuario _objeto) throws SQLException {
		
		String SQL = "UPDATE usuario SET nome_usu = ?, dataNasc = ?, celular = ?, email = ? WHERE cpf = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, _objeto.getNome_usu());
		ps.setDate(2, Date.valueOf( _objeto.getDataNasc()));
		ps.setString(3, _objeto.getCelular());
		ps.setString(4, _objeto.getEmail());
		ps.setString(5, _objeto.getCpf());
		
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
	public Boolean deletar(String _cpf) throws SQLException {
	
		String SQL = "DELETE FROM usuario WHERE cpf = ?";
				
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setString(1, _cpf);
		
		return ps.execute();
	}

}
