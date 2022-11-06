package control;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import dao.FabricaConexao;
import dao.LivroDAO;
import model.Autor;
import model.Editora;
import model.Livro;

@ManagedBean(name = "ConsultaL")
@ViewScoped
public class LivroBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Autor autor;
	private Editora editora;
	private List<Livro> listaLivros;
	private ListDataModel<Livro> livros;
	private Livro livro;
	
	public LivroBean() {
		this.livro = new Livro();
	}
	
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}
	public void setListaLivros(List<Livro> listaLivros) {
		this.listaLivros = listaLivros;
	}
	
	public ListDataModel<Livro> getLivros() {
		return livros;
	}

	public void setLivros(ListDataModel<Livro> livros) {
		this.livros = livros;
	}

	public void LivroEditar() {
		this.livro = livros.getRowData();
	}
	
	public void LivroDeletar() {
		this.livro = livros.getRowData();
	}
	
	public void Clear() {
		this.livro = new Livro();
	}
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public void LivroCadastrar() {
		this.autor = new Autor();
		this.editora = new Editora();	
		this.livro = new Livro(this.autor, this.editora); // <---
	}

	public void Cadastrar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			LivroDAO dao = new LivroDAO(conn);
			
			dao.inserir(this.livro);
			
			this.listaLivros.add(this.livro);
			this.livros = new ListDataModel<Livro>(this.listaLivros);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			LivroDAO dao = new LivroDAO(conn);
			
			dao.atualizar(this.livro);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			LivroDAO dao = new LivroDAO(conn);
			
			dao.deletar(this.livro.getIsbn());

			this.listaLivros.remove(this.livro);
			this.livros = new ListDataModel<Livro>(this.listaLivros);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
     
	@PostConstruct
	public void iniciar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			LivroDAO dao = new LivroDAO(conn);
			
			this.listaLivros = dao.recuperarTodos();
			this.livros = new ListDataModel<Livro>(this.listaLivros);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}