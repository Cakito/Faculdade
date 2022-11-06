package util;
import java.util.ArrayList;
import java.util.List;

import model.Autor;

public class AutorService {
			
			private List<Autor> listaDeAutores;
			
			public AutorService() {
				
				this.listaDeAutores = new ArrayList<Autor>();
				
				for (int i = 1; i <= 10; i++) {
					
					Autor a = new Autor();
					
					a.setId_au(i);
					a.setNome_au("Autor" + i);
					
					listaDeAutores.add(a);
				}
			}

			public List<Autor> getListaDeAutores() {
				return listaDeAutores;
			}
		}

