//EDUARDO FONSECA LIMA -- 0050014914
package trab.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel homeTitlePane = new JPanel();
		homeTitlePane.setBounds(12, 5, 425, 36);
		homeTitlePane.setBorder(null);
		contentPane.add(homeTitlePane);
		
		JLabel lblNewLabel = new JLabel("Sistema Gerenciador de Dados");
		lblNewLabel.setFont(new Font("Consolas", Font.PLAIN, 18));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		homeTitlePane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 53, 425, 201);
		contentPane.add(panel);
		
		JButton btnFun = new JButton("Funcionario");
		btnFun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FuncionarioView funcionario = new FuncionarioView();
				funcionario.setLocationRelativeTo(null);
				funcionario.setTitle("Funcionario");
				funcionario.setVisible(true);
			}
		});
		
		JButton btnDept = new JButton("Departamento");
		btnDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepartamentoView departamento = new DepartamentoView();
				departamento.setLocationRelativeTo(null);
				departamento.setTitle("Departamento");
				departamento.setVisible(true);
			}
		});
		
		JButton btnProjeto = new JButton("Projeto");
		btnProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjetoView projeto = new ProjetoView();
				projeto.setLocationRelativeTo(null);
				projeto.setTitle("Projeto");
				projeto.setVisible(true);
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login login = new Login();
				login.setLocationRelativeTo(null);
				login.setTitle("Sistema Login");
				login.setVisible(true);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(160, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnProjeto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnDept, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnFun, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(164))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(357, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(22)
					.addComponent(btnFun, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addGap(34)
					.addComponent(btnDept)
					.addGap(31)
					.addComponent(btnProjeto)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSair)
					.addGap(12))
		);
		panel.setLayout(gl_panel);
	}
}
