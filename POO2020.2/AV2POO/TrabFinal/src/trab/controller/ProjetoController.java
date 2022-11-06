package trab.controller;

import java.util.ArrayList;
import java.util.List;

import trab.model.ProjetoDAO;
import trab.bo.Projeto;

public class ProjetoController {

		public void create(Projeto projeto) {
			try {
				ProjetoDAO dao = new ProjetoDAO();
				
				dao.create(projeto);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public List<Projeto> read() {
			List<Projeto> listaproj = new ArrayList<Projeto>();
			
			try {
				ProjetoDAO dao = new ProjetoDAO();
				
				listaproj = dao.read();
			}catch(Exception e) {
				System.out.println("<Controller> Erro ao tentar ler projetos");
			}
			return listaproj;
		}
		
		public void update(Projeto proj) {
			try {
				ProjetoDAO dao = new ProjetoDAO();
				
				dao.update(proj);
			}catch(Exception e) {
				System.out.println("<Controller> Erro ao tentar atualizar projeto");
			}
		}
		
		public void delete(Projeto projeto) {
			try {
				ProjetoDAO dao = new ProjetoDAO();
				
				dao.delete(projeto);
			}catch(Exception e) {
				System.out.println("<Controller> Erro ao deletar projeto");
			}
		}
	}
