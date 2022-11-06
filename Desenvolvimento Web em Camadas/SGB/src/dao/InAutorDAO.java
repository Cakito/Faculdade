package dao;

import java.sql.SQLException;
import java.util.List;

import model.Autor;

public interface InAutorDAO {
	
	void inserir(Autor _objeto) throws SQLException;
	
	Autor recuperarPeloID(int _id_au) throws SQLException;
	
	List<Autor> recuperarTodos() throws SQLException;
	
	Boolean atualizar(Autor _objeto) throws SQLException;
	
	Boolean deletar(int _id_au) throws SQLException;
	
}
