package control;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import dao.AutorDAO;
import dao.FabricaConexao;
import model.Autor;



@ManagedBean(name = "ConsultaA")
@ViewScoped
public class AutorBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private List<Autor> listaAutores;
	private ListDataModel<Autor> autores;
	private Autor autor;
	
	public AutorBean() {
		this.autor = new Autor();
	}

	public List<Autor> getListaAutores() {
		return listaAutores;
	}
	public void setListaAutores(List<Autor> listaAutores) {
		this.listaAutores = listaAutores;
	}
	
	public ListDataModel<Autor> getAutores() {
		return autores;
	}

	public void setAutores(ListDataModel<Autor> autores) {
		this.autores = autores;
	}

	public void AutorEditar() {
		this.autor = autores.getRowData();
	}
	
	public void AutorDeletar() {
		this.autor = autores.getRowData();
	}
	
	public void Clear() {
		this.autor = new Autor();
	}
	
	public void AutorCadastrar() {
		this.autor = new Autor();
	}
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void Cadastrar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			AutorDAO dao = new AutorDAO(conn);
			
			dao.inserir(this.autor);
			
			this.listaAutores.add(this.autor);
			this.autores = new ListDataModel<Autor>(this.listaAutores);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			AutorDAO dao = new AutorDAO(conn);
			
			dao.atualizar(this.autor);
			
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			AutorDAO dao = new AutorDAO(conn);
			
			dao.deletar(this.autor.getId_au());
			
			this.listaAutores.remove(this.autor);
			this.autores = new ListDataModel<Autor>(this.listaAutores);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
     
	@PostConstruct
	public void iniciar() {
		try {
			//Popular Lista de Pessoas
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			AutorDAO dao = new AutorDAO(conn);
			
			this.listaAutores = dao.recuperarTodos();
			this.autores = new ListDataModel<Autor>(this.listaAutores);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}