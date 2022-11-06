package semana10.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import semana10.bo.Aluno;
import semana10.model.AlunoDAO;

//Precisa dos atributos que serao passados ao banco de dados, possui as regras de negocio


public class AlunoController {
	
	private JTable tblAluno;
	
	
	public void create(Aluno aluno) throws SQLException
	{
		AlunoDAO model = new AlunoDAO();
		model.create(aluno);
	}

	public List<Aluno> read() {
		
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		
		try
		{
			AlunoDAO model = new AlunoDAO();
			
			listaDeAlunos = model.read();
			
		}catch(Exception e){
			System.out.println("<Controller> Erro ao tentar ler alunos");
		}
		
		return listaDeAlunos;
	}

	public void update(Aluno aluno) {
		
		try
		{
			AlunoDAO model = new AlunoDAO();
			
			model.update(aluno);
			
		}catch(Exception e) {
			
			System.out.println("<Controller> Erro ao atualizar");
		}
	}

	public void delete(Aluno aluno) {
		
		try
		{
			AlunoDAO model = new AlunoDAO();
			
			model.delete(aluno);
			
		} catch(Exception e) {
			
			System.out.println("<Controller> Erro ao deletar");
		}
		
	}
	
	public AlunoController(JTable tblAluno) {
		this.tblAluno = tblAluno;
	}
	

	public void tblAluno()
	{
		if(tblAluno != null)
		{
			DefaultTableModel modelo = (DefaultTableModel) tblAluno.getModel();
			if(modelo.getRowCount() > 0) {
				modelo.setRowCount(0);
			}
			try {
				AlunoDAO model = new AlunoDAO();
				List<Aluno> listaDeAlunos = model.read();
				for(Aluno aluno: listaDeAlunos) {
					Object[] linha = new Object[2];
						linha[0] = aluno.getUsername();
						linha[1] = aluno.getEmail();
						modelo.addRow(linha);
				}
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE); 
			}
		}
	}
}
