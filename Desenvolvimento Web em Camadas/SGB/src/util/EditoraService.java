package util;
import java.util.ArrayList;
import java.util.List;

import model.Editora;

public class EditoraService {
			
			private List<Editora> listaDeEditoras;
			
			public EditoraService() {
				
				this.listaDeEditoras = new ArrayList<Editora>();
				
				for (int i = 1; i <= 10; i++) {
					
					Editora e = new Editora();
					
					e.setId_edit(i);
					e.setNome_edit("Editora" + i);
					
					listaDeEditoras.add(e);
				}
			}

			public List<Editora> getListaDeEditoras() {
				return listaDeEditoras;
			}
		}

