package dao;

import java.sql.SQLException;
import java.util.List;

import model.Livro;

public interface InLivroDAO {
	
	void inserir(Livro _objeto) throws SQLException;
	
	Livro recuperarPeloID(int _isbn) throws SQLException;
	
	List<Livro> recuperarTodos() throws SQLException;
	
	Boolean atualizar(Livro _objeto) throws SQLException;
	
	Boolean deletar(int _isbn) throws SQLException;

}
