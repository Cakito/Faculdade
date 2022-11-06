package util;

import java.util.ArrayList;
import java.util.List;

import model.Autor;
import model.Editora;
import model.Livro;


public class LivroService {
	
		private List<Livro> listaDeLivros;
		
		public LivroService() {
			
			this.listaDeLivros = new ArrayList<Livro>();
			
			for (int i = 1; i <= 10; i++) {
				
				Livro l = new Livro();
				
				l.setIsbn(i);
				l.setTitulo("Teste" + i);
				l.setAno(i+i+i+i);
				l.setVolume(i);
				l.setEdicao(i);
				
				Autor a = new Autor(1, "Autor" + i, l);
				Editora e = new Editora(2, "Editora" + i);
				
				l.setAutor(a);
				l.setEditora(e);
				
				listaDeLivros.add(l);
			}
		}

		public List<Livro> getListaDeLivros() {
			return listaDeLivros;
		}
}
