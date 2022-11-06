package trab.view;

import trab.controller.FuncionarioController;
import trab.bo.Funcionario;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class FuncionarioView extends JFrame {

	
	private JPanel mainPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTable funcTable;
	private JPasswordField passwordField;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioView frame = new FuncionarioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FuncionarioView() {
		setTitle("Cadastro - Funcionario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 396);
		mainPane = new JPanel();
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
		
		JPanel inputPane = new JPanel();
		inputPane.setBounds(5, 0, 430, 187);
		
		JPanel tablePane = new JPanel();
		tablePane.setBounds(5, 139, 430, 223);
		tablePane.setLayout(null);
		
		funcTable = new JTable();
		funcTable.setColumnSelectionAllowed(true);
		funcTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 53, 430, 170);
		tablePane.add(scrollPane);
		
		@SuppressWarnings("unused")
		DefaultTableModel modelo = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"id", "nome", "senha"
				}
			);
		
		funcTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "nome"
			}
		));
		scrollPane.setViewportView(funcTable);
		
		
		funcTable.setCellSelectionEnabled(true);
		
		show_user();
		
		JButton createButton = new JButton("Create");
		createButton.addActionListener(new ActionListener() {
		
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel funcModel = (DefaultTableModel) funcTable.getModel();
				Funcionario funcionario = new Funcionario();
				FuncionarioController controller = new FuncionarioController();
				
				funcionario.setId(txtId.getText());
				funcionario.setNome(txtNome.getText());
				funcionario.setSenha(passwordField.getText());
	
				
				controller.create(funcionario);
				
				Object[] dados = {txtId.getText(), txtNome.getText(),passwordField.getText()};
				funcModel.addRow(dados);
				
				JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
				clearFields();
				
			}
		});
		
		funcTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(funcTable.getSelectedRow() != -1) {
					txtId.setText(funcTable.getValueAt(funcTable.getSelectedRow(), 0).toString());
					txtNome.setText(funcTable.getValueAt(funcTable.getSelectedRow(), 1).toString());
					//passwordField.setText(funcTable.getValueAt(funcTable.getSelectedRow(), 2).toString());
					txtId.setEditable(false);
					createButton.setEnabled(false);
				}
			}
		});
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(funcTable.getSelectedRow() != -1) {					
					Funcionario funcionario = new Funcionario();
					FuncionarioController controller = new FuncionarioController();
					
					funcionario.setId(txtId.getText());
					funcionario.setNome(txtNome.getText());
					funcionario.setSenha(passwordField.getText());

					
					controller.update(funcionario);
					
					funcTable.setValueAt(txtId.getText(), funcTable.getSelectedRow(), 0);
					funcTable.setValueAt(txtNome.getText(), funcTable.getSelectedRow(), 1);
					//funcTable.setValueAt(passwordField.getText(), funcTable.getSelectedRow(), 2);

					
					JOptionPane.showMessageDialog(null, "Funcionario atualizado com sucesso");
					createButton.setEnabled(true);
					txtId.setEditable(true);
					clearFields();
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um funcionario");
				}
			}
		});
		
		JLabel lblId = new JLabel("ID");
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		JLabel lblpswd = new JLabel("Senha");
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(funcTable.getSelectedRow() != -1) {
					Funcionario funcionario = new Funcionario();
					FuncionarioController controller = new FuncionarioController();
					DefaultTableModel funcModel = (DefaultTableModel) funcTable.getModel();
					
					funcionario.setId((String) funcTable.getValueAt(funcTable.getSelectedRow(), 0));
					controller.delete(funcionario);
					
					funcModel.removeRow(funcTable.getSelectedRow());
					JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso");
					createButton.setEnabled(true);
					txtId.setEditable(true);
					clearFields();
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um funcionario");
				}
				
			}
		});
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFields();
				createButton.setEnabled(true);
				txtId.setEditable(true);
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mainPane.setLayout(null);
		
		passwordField = new JPasswordField();
		GroupLayout gl_inputPane = new GroupLayout(inputPane);
		gl_inputPane.setHorizontalGroup(
			gl_inputPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_inputPane.createSequentialGroup()
					.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inputPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblpswd, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome)
								.addGroup(gl_inputPane.createSequentialGroup()
									.addGap(8)
									.addComponent(lblId)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtId, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
								.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
						.addGroup(gl_inputPane.createSequentialGroup()
							.addGap(32)
							.addComponent(createButton, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_inputPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_inputPane.createSequentialGroup()
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(btnLimpar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnVoltar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_inputPane.setVerticalGroup(
			gl_inputPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inputPane.createSequentialGroup()
					.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inputPane.createSequentialGroup()
							.addGap(17)
							.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblId)
								.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_inputPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnVoltar, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inputPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
							.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNome))
							.addGap(18)
							.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblpswd)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
							.addGap(36))
						.addGroup(gl_inputPane.createSequentialGroup()
							.addGap(27)
							.addComponent(btnLimpar)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(createButton, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(25))
		);
		inputPane.setLayout(gl_inputPane);
		mainPane.add(inputPane);
		mainPane.add(tablePane);
	}
	
	public void show_user() {
			DefaultTableModel modelo = (DefaultTableModel) funcTable.getModel();
			try {
				FuncionarioController controller = new FuncionarioController();
				
				for(Funcionario funcionario:controller.read()) {
					modelo.addRow(new Object[] {funcionario.getId(), funcionario.getNome()});
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	public void clearFields() {
		txtId.setText(null);
		txtNome.setText(null);
		passwordField.setText(null);
	}
}