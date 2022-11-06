package semana10.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RBController implements ActionListener{
	
	JTextField tfUsername, tfEmail, tfpswd;
	JLabel lblUsername, lblEmail, lblPassword;
	JRadioButton rdbtnCreate, rdbtnUpdate, rdbtnDelete;
	JButton btnAplicar;
	
	public RBController(JTextField tfUsername, JTextField tfEmail, JTextField tfpswd,
			JLabel lblUsername, JLabel lblEmail, JLabel lblPassword, 
			JRadioButton rdbtnCreate, JRadioButton rdbtnUpdate, JRadioButton rdbtnDelete,
			JButton btnAplicar)
	{
		this.tfUsername = tfUsername;
		this.tfEmail = tfEmail;
		this.tfpswd = tfpswd;
		this.lblUsername = lblUsername;
		this.lblEmail = lblEmail;
		this.lblPassword = lblPassword;
		this.rdbtnCreate = rdbtnCreate; 
		this.rdbtnUpdate = rdbtnUpdate;
		this.rdbtnDelete = rdbtnDelete;
		this.btnAplicar = btnAplicar;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		limpaCampos();
		
		if(rdbtnCreate.isSelected()) 
		{
			telaCreate();
		}
		else if(rdbtnUpdate.isSelected())
		{
			telaUpdate();
		} else	{
			telaDelete();
		}
	}

	private void limpaCampos() {
		
		tfUsername.setText("");
		tfEmail.setText("");
		tfpswd.setText("");
	}
	
	private void telaCreate() {

		lblUsername.setVisible(true);
		lblEmail.setVisible(true);
		lblPassword.setVisible(true);
		tfUsername.setVisible(true);
		tfEmail.setVisible(true);
		tfpswd.setVisible(true);
		btnAplicar.setVisible(true);
	}
	
	private void telaUpdate() {
		
		tfUsername.setText("Digite o usuario novo");
		tfEmail.setText("Digite o email antigo");
		lblUsername.setVisible(true);
		lblEmail.setVisible(true);
		lblPassword.setVisible(false);
		tfUsername.setVisible(true);
		tfEmail.setVisible(true);
		tfpswd.setVisible(false);
		btnAplicar.setVisible(true);
		
	}

	private void telaDelete() {
		
		lblUsername.setVisible(true);
		lblPassword.setVisible(false);
		lblEmail.setVisible(false);
		tfUsername.setVisible(true);
		tfEmail.setVisible(false);
		tfpswd.setVisible(false);
		btnAplicar.setVisible(true);
	}


}
