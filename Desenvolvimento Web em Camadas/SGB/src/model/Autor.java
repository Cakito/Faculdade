package model;

import java.io.Serializable;

public class Autor implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id_au;
	private String nome_au;
	
	public Autor() {
		
	}
	
	public Autor(int id_au, String nome_au) {
		super();
		this.id_au = id_au;
		this.nome_au = nome_au;
	}
	
	public int getId_au() {
		return id_au;
	}
	public void setId_au(int id_au) {
		this.id_au = id_au;
	}
	public String getNome_au() {
		return nome_au;
	}
	public void setNome_au(String nome_au) {
		this.nome_au = nome_au;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_au;
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
		Autor other = (Autor) obj;
		if (id_au != other.id_au)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.nome_au;
	}
}
