package trab.controller;

import java.util.ArrayList;
import java.util.List;

import trab.model.FuncionarioDAO;
import trab.bo.Funcionario;

public class FuncionarioController {
	
	
	public void create(Funcionario funcionario) {
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			
			dao.create(funcionario);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Funcionario> read() {
		List<Funcionario> listafunc = new ArrayList<Funcionario>();
		
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			
			listafunc = dao.read();
		}catch(Exception e) {
			System.out.println("<Controller> Erro ao tentar ler funcionarios");
		}
		return listafunc;
	}
	
	public void update(Funcionario funcionario) {
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			
			dao.update(funcionario);
		}catch(Exception e) {
			System.out.println("<Controller> Erro ao tentar atualizar funcionarios");
		}
	}
	
	public void delete(Funcionario funcionario) {
		try {
			FuncionarioDAO dao = new FuncionarioDAO();
			
			dao.delete(funcionario);
		}catch(Exception e) {
			System.out.println("<Controller> Erro ao deletar funcionario");
		}
	}
	
}