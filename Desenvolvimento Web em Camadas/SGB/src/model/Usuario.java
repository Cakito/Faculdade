package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String nome_usu;
	private LocalDate dataNasc;
	private String celular;
	private String email;

	public Usuario() {
		
	}

	public Usuario(String cpf, String nome_usu, LocalDate dataNasc, String celular, String email) {
		super();
		this.cpf = cpf;
		this.nome_usu = nome_usu;
		this.dataNasc = dataNasc;
		this.celular = celular;
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome_usu() {
		return nome_usu;
	}
	public void setNome_usu(String nome_usu) {
		this.nome_usu = nome_usu;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + ((nome_usu == null) ? 0 : nome_usu.hashCode());
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
		Usuario other = (Usuario) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (nome_usu == null) {
			if (other.nome_usu != null)
				return false;
		} else if (!nome_usu.equals(other.nome_usu))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", nome_usu=" + nome_usu + ", dataNasc=" + dataNasc + ", celular=" + celular
				+ ", email=" + email + "]";
	}
}