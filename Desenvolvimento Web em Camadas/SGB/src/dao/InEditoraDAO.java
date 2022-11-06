package dao;

import java.sql.SQLException;
import java.util.List;

import model.Editora;

public interface InEditoraDAO {
	
	void inserir(Editora _objeto) throws SQLException;
	
	Editora recuperarPeloID(int _id_edit) throws SQLException;
	
	List<Editora> recuperarTodos() throws SQLException;
	
	Boolean atualizar(Editora _objeto) throws SQLException;
	
	Boolean deletar(int _id_edit) throws SQLException;

}
