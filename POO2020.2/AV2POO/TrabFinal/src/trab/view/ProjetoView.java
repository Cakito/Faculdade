package trab.view;

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

import trab.bo.Projeto;
import trab.controller.ProjetoController;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


@SuppressWarnings("serial")
public class ProjetoView extends JFrame {
	
	private JPanel mainPane;
		private JTextField txtNum;
		private JTextField txtName;
		private JTable projTable;

		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ProjetoView  frame = new ProjetoView ();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public ProjetoView () {
			setTitle("Cadastro - Projeto");
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 396);
			mainPane = new JPanel();
			mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(mainPane);
			
			JPanel inputPane = new JPanel();
			inputPane.setBounds(5, 5, 430, 185);
			
			JPanel tablePane = new JPanel();
			tablePane.setBounds(5, 196, 430, 223);
			tablePane.setLayout(null);
			
			projTable = new JTable();
			projTable.setColumnSelectionAllowed(true);
			projTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 0, 430, 172);
			tablePane.add(scrollPane);
			
			DefaultTableModel modelo = new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"numero", "nome"
					}
				);
			
			projTable.setModel(modelo);
			scrollPane.setViewportView(projTable);
			
			projTable.setCellSelectionEnabled(true);
			
			show_user();
			
			JButton btnCreate = new JButton("Create");
			btnCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					DefaultTableModel projModel = (DefaultTableModel) projTable.getModel();
					Projeto projeto = new Projeto ();
					ProjetoController controller = new ProjetoController();
					
					projeto.setNumero(txtNum.getText());
					projeto.setNome(txtName.getText());
					
					controller.create(projeto);
					
					Object[] dados = {txtNum.getText(), txtName.getText()};
					projModel.addRow(dados);
					
					JOptionPane.showMessageDialog(null, "Projeto cadastrado com sucesso");
					clearFields();
					
				}
			});
			
			projTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(projTable.getSelectedRow() != -1) {
						txtNum.setText(projTable.getValueAt(projTable.getSelectedRow(), 0).toString());
						txtName.setText(projTable.getValueAt(projTable.getSelectedRow(), 1).toString());
						txtNum.setEditable(false);
						btnCreate.setEnabled(false);
					}
				}
			});
			
			JButton btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(projTable.getSelectedRow() != -1) {					
						Projeto projeto = new Projeto();
						ProjetoController controller = new ProjetoController();
						
						projeto.setNumero(txtNum.getText());
						projeto.setNome(txtName.getText());

						
						controller.update(projeto);
						
						projTable.setValueAt(txtNum.getText(), projTable.getSelectedRow(), 0);
						projTable.setValueAt(txtName.getText(), projTable.getSelectedRow(), 1);
	
						JOptionPane.showMessageDialog(null, "Projeto atualizado com sucesso");
						btnCreate.setEnabled(true);
						txtNum.setEditable(true);
						clearFields();
					}else {
						JOptionPane.showMessageDialog(null, "Selecione um projeto");
					}
				}
			});
			
			JLabel lblNum = new JLabel("Numero");
			
			txtNum = new JTextField();
			txtNum.setColumns(10);
			
			JLabel lblNome = new JLabel("Nome");
			
			txtName = new JTextField();
			txtName.setColumns(10);
			
			JButton btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(projTable.getSelectedRow() != -1) {
						Projeto projeto = new Projeto ();
						ProjetoController controller = new ProjetoController();
						DefaultTableModel projModel = (DefaultTableModel) projTable.getModel();
						
						projeto.setNumero((String) projTable.getValueAt(projTable.getSelectedRow(), 0));
						controller.delete(projeto);
						
						projModel.removeRow(projTable.getSelectedRow());
						JOptionPane.showMessageDialog(null, "Projeto excluido com sucesso");
						btnCreate.setEnabled(true);
						txtNum.setEditable(true);
						clearFields();
					}else {
						JOptionPane.showMessageDialog(null, "Selecione um departamento");
					}
					
				}
			});
			
			JButton Limpar = new JButton("Limpar");
			Limpar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clearFields();
					btnCreate.setEnabled(true);
					txtNum.setEditable(true);
				}
			});
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			mainPane.setLayout(null);
			GroupLayout gl_inputPane = new GroupLayout(inputPane);
			gl_inputPane.setHorizontalGroup(
				gl_inputPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_inputPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(Alignment.TRAILING, gl_inputPane.createSequentialGroup()
								.addGap(6)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNome)
									.addComponent(lblNum))
								.addGap(18)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(99)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(Limpar)
									.addComponent(btnVoltar)))
							.addGroup(gl_inputPane.createSequentialGroup()
								.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGap(48)
								.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
						.addGap(53))
			);
			gl_inputPane.setVerticalGroup(
				gl_inputPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_inputPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_inputPane.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_inputPane.createSequentialGroup()
								.addGap(12)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNum)
									.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNome))
								.addGap(16))
							.addGroup(Alignment.LEADING, gl_inputPane.createSequentialGroup()
								.addComponent(btnVoltar)
								.addGap(30)
								.addComponent(Limpar)))
						.addGap(17)
						.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(33, Short.MAX_VALUE))
			);
			inputPane.setLayout(gl_inputPane);
			mainPane.add(inputPane);
			mainPane.add(tablePane);
		}
		
		public void show_user() {
				DefaultTableModel modelo = (DefaultTableModel) projTable.getModel();
				try {
					ProjetoController controller = new ProjetoController();
					
					for(Projeto proj : controller.read()) {
						modelo.addRow(new Object[] {proj.getNumero(), proj.getNome()});
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		public void clearFields() {
			txtNum.setText(null);
			txtName.setText(null);
		}
	}
