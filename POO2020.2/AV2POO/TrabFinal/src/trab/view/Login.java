//EDUARDO FONSECA LIMA -- 0050014914
package trab.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField idField;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setTitle("Login do sistema");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Funcionario Login ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		idField = new JTextField();
		idField.setBounds(158, 45, 145, 19);
		idField.setColumns(10);
		panel.add(idField);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(117, 48, 21, 15);
		panel.add(lblId);
		
		JLabel lblId_1 = new JLabel("Senha");
		lblId_1.setBounds(106, 96, 53, 15);
		panel.add(lblId_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 94, 145, 19);
		panel.add(passwordField);
		
		JButton btnEntrar = new JButton("Entrar");
				
		btnEntrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(idField.getText(), new String(passwordField.getPassword()))) {
					Menu menu = new Menu();
					menu.setLocationRelativeTo(null);
					menu.setTitle("Menu");
					menu.setVisible(true);
					dispose();
					
					JOptionPane.showMessageDialog(null, "Bem Vindo");
				}else {
					JOptionPane.showMessageDialog(null, "id ou senha incorreto(a)");
				}
			}
		});
		btnEntrar.setBounds(187, 134, 91, 25);
		panel.add(btnEntrar);
		
		JButton btnCancelar = new JButton("Sair");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(0, 203, 74, 25);
		panel.add(btnCancelar);
	}
	public boolean checkLogin(String id, String senha) {
		return id.equals("usuario")&& senha.equals("1234");
	}
}
