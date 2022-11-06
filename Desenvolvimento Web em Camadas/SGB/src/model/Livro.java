package model;

import java.io.Serializable;

public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int isbn;
	private String titulo;
	private int ano;
	private int volume;
	private int edicao;
	
	private Autor autor;
	private Editora editora;
	
	public Livro(int isbn, int ano, String titulo, int volume, int edicao, Autor autor, Editora editora) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
		this.volume = volume;
		this.edicao = edicao;
		this.autor = autor;
		this.editora = editora;
	}
	
	public Livro() {}
	
	public Livro (Autor autor, Editora editora) {
		this.autor = autor;
		this.editora = editora;
	}

	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
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
		Livro other = (Livro) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", titulo=" + titulo + ", ano=" + ano + ", volume=" + volume + ", edicao=" + edicao
				+ ", autor=" + autor + ", editora=" + editora + "]";
	}
}
