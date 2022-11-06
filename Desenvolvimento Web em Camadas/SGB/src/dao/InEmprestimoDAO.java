package dao;

import java.sql.SQLException;
import java.util.List;

import model.Emprestimo;

public interface InEmprestimoDAO {
	
	void inserir(Emprestimo _objeto) throws SQLException;
	
	Emprestimo recuperarPeloID(int _id_emp) throws SQLException;
	
	List<Emprestimo> recuperarTodos() throws SQLException;
	
	Boolean atualizar(Emprestimo _objeto) throws SQLException;
	
	Boolean deletar(int _id_emp) throws SQLException;

}
