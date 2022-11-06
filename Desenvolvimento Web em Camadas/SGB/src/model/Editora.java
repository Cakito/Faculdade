package model;

import java.io.Serializable;

public class Editora implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private int id_edit;
	private String nome_edit;
	
	public Editora() {
		
	}
	
	public Editora(int id_edit, String nome_edit) {
		super();
		this.id_edit = id_edit;
		this.nome_edit = nome_edit;
	}
	
	public int getId_edit() {
		return id_edit;
	}
	public void setId_edit(int id_edit) {
		this.id_edit = id_edit;
	}
	public String getNome_edit() {
		return nome_edit;
	}
	public void setNome_edit(String nome_edit) {
		this.nome_edit = nome_edit;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_edit;
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
		Editora other = (Editora) obj;
		if (id_edit != other.id_edit)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.nome_edit;
	}
}
