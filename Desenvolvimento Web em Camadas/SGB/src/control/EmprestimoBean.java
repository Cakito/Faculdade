package control;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import dao.EmprestimoDAO;
import dao.FabricaConexao;
import model.Emprestimo;
import model.Livro;
import model.Usuario;

@ManagedBean(name = "ConsultaEmpr")
@ViewScoped
public class EmprestimoBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;
	private Livro livro;
	private List<Emprestimo> listaEmprestimos;
	private ListDataModel<Emprestimo> emprestimos;
	private Emprestimo emprestimo;
	
	public EmprestimoBean() {
		this.emprestimo = new Emprestimo();
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public List<Emprestimo> getListaEmprestimos() {
		return listaEmprestimos;
	}
	public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
		this.listaEmprestimos = listaEmprestimos;
	}
	
	public ListDataModel<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(ListDataModel<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}

	public void EmprestimoEditar() {
		this.emprestimo = emprestimos.getRowData();
	}
	
	public void EmprestimoDeletar() {
		this.emprestimo = emprestimos.getRowData();
	}
	
	public void Clear() {
		this.emprestimo = new Emprestimo();
	}
	
	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public void EmprestimoCadastrar() {
		this.usuario = new Usuario();
		this.livro = new Livro();
		this.emprestimo = new Emprestimo(this.usuario, this.livro);
	}
	
	public void Cadastrar() {
		try {

			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EmprestimoDAO dao = new EmprestimoDAO(conn);
			
			dao.inserir(this.emprestimo);
			
			this.listaEmprestimos.add(this.emprestimo);
			this.emprestimos = new ListDataModel<Emprestimo>(this.listaEmprestimos);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EmprestimoDAO dao = new EmprestimoDAO(conn);
			
			dao.atualizar(this.emprestimo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EmprestimoDAO dao = new EmprestimoDAO(conn);
			
			dao.deletar(this.emprestimo.getId_emp());

			this.listaEmprestimos.remove(this.emprestimo);
			this.emprestimos = new ListDataModel<Emprestimo>(this.listaEmprestimos);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
     
	@PostConstruct
	public void iniciar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EmprestimoDAO dao = new EmprestimoDAO(conn);
			
			this.listaEmprestimos = dao.recuperarTodos();
			this.emprestimos = new ListDataModel<Emprestimo>(this.listaEmprestimos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}