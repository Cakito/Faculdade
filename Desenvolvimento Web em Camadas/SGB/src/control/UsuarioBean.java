package control;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import dao.FabricaConexao;
import dao.UsuarioDAO;
import model.Usuario;


@ManagedBean(name = "ConsultaU")
@ViewScoped
public class UsuarioBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private List<Usuario> listaUsuarios;
	private ListDataModel<Usuario> usuarios;
	private Usuario usuario;
	
	public UsuarioBean() {
		this.usuario = new Usuario();
	}

	public List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(List<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	
	public ListDataModel<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ListDataModel<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void Clear() {
		this.usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	public void UsuarioCadastrar() {
		this.usuario = new Usuario();
	}

	public void Cadastrar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			UsuarioDAO dao = new UsuarioDAO(conn);
			
			dao.inserir(this.usuario);
			
			this.listaUsuarios.add(this.usuario);
			this.usuarios = new ListDataModel<Usuario>(this.listaUsuarios);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void UsuarioEditar() {
		this.usuario = this.usuarios.getRowData();
	}
	
	public void Update() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			UsuarioDAO dao = new UsuarioDAO(conn);
			
			dao.atualizar(this.usuario);
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void UsuarioDeletar() {
		this.usuario = this.usuarios.getRowData();
	}
	
	public void Deletar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			UsuarioDAO dao = new UsuarioDAO(conn);
			
			dao.deletar(this.usuario.getCpf());
				
			this.listaUsuarios.remove(this.usuario);
				
			this.usuarios = new ListDataModel<Usuario>(this.listaUsuarios);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
     
	@PostConstruct
	public void iniciar() {
		try {
			//Popular Lista de Pessoas
			//UsuarioService serv = new UsuarioService();
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			UsuarioDAO dao = new UsuarioDAO(conn);
			
			this.listaUsuarios = dao.recuperarTodos();
			
			this.usuarios = new ListDataModel<Usuario>(this.listaUsuarios);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}