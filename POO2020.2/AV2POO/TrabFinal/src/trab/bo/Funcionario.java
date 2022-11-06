package trab.bo;

public class Funcionario {
    
    private String nome;
    private String id;
    private String senha;
    private Departamento dept;
	
    public String getNome() {
       	return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public String getId() {
            return id;
    }
    public void setId(String id) {
            this.id = id;
    }
    public String getSenha() {
            return senha;
    }
    public void setSenha(String senha) {
            this.senha = senha;
    }
    public Departamento getDept() {
        return dept;
    }
    
    public void setDept(Departamento dept) {
        this.dept = dept;
    }
}