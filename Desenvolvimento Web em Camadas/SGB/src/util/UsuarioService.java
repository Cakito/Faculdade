package util;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioService {
		
		private List<Usuario> listaDeUsuarios;
		
		public UsuarioService() {
			
			this.listaDeUsuarios = new ArrayList<Usuario>();
			
			for (int i = 1; i <= 10; i++) {
				
				Usuario u = new Usuario();
				
				u.setCpf("cpf: "+i);
				u.setNome_usu("Teste" + i);
				u.setIdade(i*i);
				u.setCelular("(21)" + i +"1111-1111");
				u.setEmail("Teste" + i + "@gmail.com");
				
				listaDeUsuarios.add(u);
			}
		}

		public List<Usuario> getListaDeUsuarios() {
			return listaDeUsuarios;
		}
	}

