package trab.controller;

import java.util.ArrayList;
import java.util.List;

import trab.model.DepartamentoDAO;
import trab.bo.Departamento;

public class DepartamentoController {
	public void create(Departamento dept) {
		try {
			DepartamentoDAO dao = new DepartamentoDAO();
			
			dao.create(dept);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Departamento> read() {
		List<Departamento> listadept = new ArrayList<Departamento>();
		
		try {
			DepartamentoDAO dao = new DepartamentoDAO();
			
			listadept = dao.read();
		}catch(Exception e) {
			System.out.println("<Controller> Erro ao tentar ler departamentos");
		}
		return listadept;
	}
	
	public void update(Departamento dept) {
		try {
			DepartamentoDAO dao = new DepartamentoDAO();
			
			dao.update(dept);
		}catch(Exception e) {
			System.out.println("<Controller> Erro ao tentar atualizar departamento");
		}
	}
	
	public void delete(Departamento dept) {
		try {
			DepartamentoDAO dao = new DepartamentoDAO();
			
			dao.delete(dept);
		}catch(Exception e) {
			System.out.println("<Controller> Erro ao deletar departamento");
		}
	}
}