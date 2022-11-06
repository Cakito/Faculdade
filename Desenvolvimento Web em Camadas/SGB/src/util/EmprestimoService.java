package util;

import java.util.ArrayList;
import java.util.List;

import model.Autor;
import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class EmprestimoService {
		
		private List<Emprestimo> listaDeEmprestimos;
		
		public EmprestimoService() {
			
			this.listaDeEmprestimos = new ArrayList<Emprestimo>();
			
			for (int i = 1; i <= 10; i++) {
				
				Emprestimo emp = new Emprestimo();
				
				emp.setId_emp(i);
				emp.getDataDevol();
				emp.getDataEmprest();
			
				Usuario u = new Usuario("Cpf: " + i, "usuario", i, "(21)" + i +"1111-1111",i +"gmail.com");
				Autor a = new Autor();
				Livro l = new Livro(i+1, i, "titulo" + i ,i ,i ,a , null);
				
				emp.setUsuario(u);
				emp.setLivro(l);
				
				listaDeEmprestimos.add(emp);
			}
		}
	
		public List<Emprestimo> getListaDeEmprestimos() {
			return listaDeEmprestimos;
		}
}
