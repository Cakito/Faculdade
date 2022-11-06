package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Emprestimo;


public class EmprestimoDAO implements InEmprestimoDAO {
	
	private Connection conexao;
	
	public EmprestimoDAO(Connection _conexao) {
		this.conexao = _conexao;
		
	}

	@Override
	public void inserir(Emprestimo _objeto) throws SQLException {
		
		String SQL = "INSERT INTO emprestimo (id_emp, dataEmprest, dataDevol, usuario_cpf, livro_isbn) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _objeto.getId_emp());
		ps.setDate(2,Date.valueOf( _objeto.getDataEmprest()));
		ps.setDate(3, Date.valueOf( _objeto.getDataDevol()));
		ps.setString(4, _objeto.getUsuario().getCpf());
		ps.setInt(5, _objeto.getLivro().getIsbn());
		ps.execute();
	}

	@Override
	public Emprestimo recuperarPeloID(int _id_emp) throws SQLException {
		
		String SQL = "SELECT " + "id_emp, dataEmprest, dataDevol, usuario_cpf, livro_isbn" + " FROM emprestimo WHERE id_emp = " + _id_emp;
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		Emprestimo emp = null;
		
		if(rs.next()) {
			
			int id_emp = rs.getInt(1);
			LocalDate dataEmprest = rs.getDate(2).toLocalDate();
			LocalDate dataDevol = rs.getDate(3).toLocalDate();
			String usuario_cpf = rs.getString("usuario_cpf");
			int livro_isbn = rs.getInt("livro_isbn");
			
			UsuarioDAO ud = new UsuarioDAO(this.conexao);
			LivroDAO ld = new LivroDAO(this.conexao);
			
			emp = new Emprestimo(id_emp, dataEmprest, dataDevol, ud.recuperarPeloID(usuario_cpf), ld.recuperarPeloID(livro_isbn));
			
		}
		
		return emp;
	}
	
	@Override
	public List<Emprestimo> recuperarTodos() throws SQLException {
		
		List<Emprestimo> listaEmprestimos = new ArrayList<Emprestimo>();
		
		String SQL = "SELECT " + "id_emp, dataEmprest, dataDevol, usuario_cpf, livro_isbn" + " FROM emprestimo";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			
			int id_emp = rs.getInt(1);
			LocalDate dataEmprest = rs.getDate(2).toLocalDate();
			LocalDate dataDevol = rs.getDate(3).toLocalDate();
			String usuario_cpf = rs.getString("usuario_cpf");
			int livro_isbn = rs.getInt("livro_isbn");
			
			UsuarioDAO ud = new UsuarioDAO(this.conexao);
			LivroDAO ld = new LivroDAO(this.conexao);
			
			Emprestimo emp = new Emprestimo(id_emp, dataEmprest, dataDevol, ud.recuperarPeloID(usuario_cpf), ld.recuperarPeloID(livro_isbn));
			
			listaEmprestimos.add(emp);
		}
		
		return listaEmprestimos;
	}

	@Override
	public Boolean atualizar(Emprestimo _objeto) throws SQLException {
		
		String SQL = "UPDATE emprestimo SET dataEmprest = ?, dataDevol = ?, usuario_cpf = ?, livro_isbn = ? WHERE id_emp = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		
		ps.setDate(1,Date.valueOf( _objeto.getDataEmprest()));
		ps.setDate(2, Date.valueOf( _objeto.getDataDevol()));
		ps.setString(3, _objeto.getUsuario().getCpf());
		ps.setInt(4, _objeto.getLivro().getIsbn());
		ps.setInt(5, _objeto.getId_emp());
		
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
	public Boolean deletar(int _id_emp) throws SQLException {
		
		String SQL = "DELETE FROM emprestimo WHERE id_emp = ?";
		
		PreparedStatement ps = this.conexao.prepareStatement(SQL);
		
		ps.setInt(1, _id_emp);
		
		return ps.execute();
	}
}
