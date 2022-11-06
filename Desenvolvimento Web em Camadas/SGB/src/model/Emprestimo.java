package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Emprestimo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id_emp;
	private LocalDate dataEmprest;
	private LocalDate dataDevol;
	
	private Usuario usuario;
	private Livro livro;
	
	
	public Emprestimo() {
		
	}
	
	public Emprestimo(Usuario usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
		
	}
	
	public Emprestimo(int id_emp, LocalDate dataEmprest, LocalDate dataDevol, Usuario usuario, Livro livro) {
		super();
		this.id_emp = id_emp;
		this.dataEmprest = dataEmprest;
		this.dataDevol = dataDevol;
		this.usuario = usuario;
		this.livro = livro;
	}
	
	public int getId_emp() {
		return id_emp;
	}
	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}
	public LocalDate getDataEmprest() {
		return dataEmprest;
	}
	public void setDataEmprest(LocalDate dataEmprest) {
		this.dataEmprest = dataEmprest;
	}
	public LocalDate getDataDevol() {
		return dataDevol;
	}
	public void setDataDevol(LocalDate dataDevol) {
		this.dataDevol = dataDevol;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_emp;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emprestimo other = (Emprestimo) obj;
		if (id_emp != other.id_emp)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Emprestimo [id_emp=" + id_emp + ", dataEmprest=" + dataEmprest + ", dataDevol=" + dataDevol
				+ ", usuario=" + usuario + ", livro=" + livro + "]";
	}
}