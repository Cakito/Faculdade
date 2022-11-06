package semana10.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

import semana10.bo.Aluno;
import semana10.model.AlunoDAO;


public class Botao implements ActionListener{

	
	private JTextField tfUsername, tfEmail, tfpswd;
	private JRadioButton rdbtnCreate, rdbtnUpdate, rdbtnDelete;
	private JTable tblAluno;
	
	public Botao(JTextField tfUsername, JTextField tfEmail, JTextField tfpswd,
			JRadioButton rdbtnCreate, JRadioButton rdbtnUpdate, JRadioButton rdbtnDelete,
			JTable tblAluno)
	{
		this.tfUsername = tfUsername;
		this.tfEmail = tfEmail;
		this.tfpswd = tfpswd;
		this.rdbtnCreate = rdbtnCreate; 
		this.rdbtnUpdate = rdbtnUpdate;
		this.rdbtnDelete = rdbtnDelete;
		this.tblAluno = tblAluno;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Aluno a = new Aluno();
		
		if(rdbtnDelete.isSelected())
		{
			a.setUsername(tfUsername.getText());
			delete(a);
		} else {
			a.setUsername(tfUsername.getText());
			a.setEmail(tfEmail.getText());
			a.setPassword(tfpswd.getText());
			
			if (rdbtnUpdate.isSelected()) {
				update(a);
			} else {
				create(a);
			}
		}
	}
	
	private void create(Aluno a) {
		
			try {
				AlunoDAO AD = new AlunoDAO();
				AD.create(a);
				JOptionPane.showMessageDialog(null,"Usuario inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				AlunoController controller = new AlunoController(tblAluno);
				controller = new AlunoController(tblAluno);
				controller.tblAluno();
			} catch (SQLException e) {
				
				JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE); 
			}
		
	}

	private void update(Aluno a) {
			
			try {
				AlunoDAO AD = new AlunoDAO();
				AD.update(a);
				JOptionPane.showMessageDialog(null,"Usuario atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
				AlunoController controller = new AlunoController(tblAluno);
				controller = new AlunoController(tblAluno);
				controller.tblAluno();
			} catch (SQLException e) {
				
				JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE);
		
			}
	}
	
	private void delete(Aluno a) {
		
		try {
			AlunoDAO AD = new AlunoDAO();
			AD.delete(a);
			JOptionPane.showMessageDialog(null,"Usuario excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			AlunoController controller = new AlunoController(tblAluno);
			controller = new AlunoController(tblAluno);
			controller.tblAluno();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"ERRO", JOptionPane.ERROR_MESSAGE); 
		}
	}
}
