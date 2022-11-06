package dao;

import java.sql.SQLException;
import java.util.List;

import model.Usuario;

public interface InUsuarioDAO {
	
	void inserir(Usuario _objeto) throws SQLException;
	
	Usuario recuperarPeloID(String _cpf) throws SQLException;
	
	List<Usuario> recuperarTodos() throws SQLException;
	
	Boolean atualizar(Usuario _objeto) throws SQLException;
	
	Boolean deletar(String _cpf) throws SQLException;

}
