package control;

import java.io.Serializable;
import java.sql.Connection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.ListDataModel;

import dao.EditoraDAO;
import dao.FabricaConexao;
import model.Editora;


@ManagedBean(name = "ConsultaE")
@ViewScoped
public class EditoraBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private List<Editora> listaEditoras;
	private ListDataModel<Editora> editoras;
	private Editora editora;
	
	public EditoraBean() {
		this.editora = new Editora();
	}

	public List<Editora> getListaEditoras() {
		return listaEditoras;
	}
	public void setListaEditoras(List<Editora> listaEditoras) {
		this.listaEditoras = listaEditoras;
	}
	
	public ListDataModel<Editora> getEditoras() {
		return editoras;
	}

	public void setEditoras(ListDataModel<Editora> editoras) {
		this.editoras = editoras;
	}

	public void EditoraEditar() {
		this.editora = editoras.getRowData();
	}
	
	public void EditoraDeletar() {
		this.editora = editoras.getRowData();
	}
	
	public void Clear() {
		this.editora = new Editora();
	}
	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	public void EditoraCadastrar() {
		this.editora = new Editora();
	}
	
	public void Cadastrar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EditoraDAO dao = new EditoraDAO(conn);
			
			dao.inserir(this.editora);
			
			this.listaEditoras.add(this.editora);
			this.editoras = new ListDataModel<Editora>(this.listaEditoras);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EditoraDAO dao = new EditoraDAO(conn);
			
			dao.atualizar(this.editora);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Deletar() {
		try {
			
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EditoraDAO dao = new EditoraDAO(conn);
			
			dao.deletar(this.editora.getId_edit());

			this.listaEditoras.remove(this.editora);
			this.editoras = new ListDataModel<Editora>(this.listaEditoras);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
     
	@PostConstruct
	public void iniciar() {
		try {
			//Popular Lista de Pessoas
			//EditoraService serv = new EditoraService();
			FabricaConexao fab = new FabricaConexao();
			Connection conn = fab.fazerConexao();
			
			EditoraDAO dao = new EditoraDAO(conn);
			
			this.listaEditoras = dao.recuperarTodos();
			this.editoras = new ListDataModel<Editora>(this.listaEditoras);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}