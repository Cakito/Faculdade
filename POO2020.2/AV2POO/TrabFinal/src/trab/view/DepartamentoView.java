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

import trab.bo.Departamento;
import trab.controller.DepartamentoController;

import javax.swing.JScrollPane;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.ListSelectionModel;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;

	@SuppressWarnings("serial")
	public class DepartamentoView extends JFrame {

		private JPanel mainPane;
		private JTextField txtCod;
		private JTextField txtName;
		private JTable deptTable;

		
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DepartamentoView  frame = new DepartamentoView ();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		public DepartamentoView () {
			setTitle("Cadastro - Departamento");
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
			
			deptTable = new JTable();
			deptTable.setColumnSelectionAllowed(true);
			deptTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 0, 430, 172);
			tablePane.add(scrollPane);
			
			DefaultTableModel modelo = new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"codigo", "nome"
					}
				);
			
			deptTable.setModel(modelo);
			scrollPane.setViewportView(deptTable);
			
			deptTable.setCellSelectionEnabled(true);
			
			show_user();
			
			JButton btnCreate = new JButton("Create");
			btnCreate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					DefaultTableModel deptModel = (DefaultTableModel) deptTable.getModel();
					Departamento departamento = new Departamento ();
					DepartamentoController controller = new DepartamentoController();
					
					departamento.setCodigo(txtCod.getText());
					departamento.setNome(txtName.getText());
					
					controller.create(departamento);
					
					Object[] dados = {txtCod.getText(), txtName.getText()};
					deptModel.addRow(dados);
					
					JOptionPane.showMessageDialog(null, "Departamento cadastrado com sucesso");
					clearFields();
					
				}
			});
			
			deptTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(deptTable.getSelectedRow() != -1) {
						txtCod.setText(deptTable.getValueAt(deptTable.getSelectedRow(), 0).toString());
						txtName.setText(deptTable.getValueAt(deptTable.getSelectedRow(), 1).toString());
						txtCod.setEditable(false);
						btnCreate.setEnabled(false);
					}
				}
			});
			
			JButton btnUpdate = new JButton("Update");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(deptTable.getSelectedRow() != -1) {					
						Departamento departamento = new Departamento();
						DepartamentoController controller = new DepartamentoController();
						
						departamento.setCodigo(txtCod.getText());
						departamento.setNome(txtName.getText());

						
						controller.update(departamento);
						
						deptTable.setValueAt(txtCod.getText(), deptTable.getSelectedRow(), 0);
						deptTable.setValueAt(txtName.getText(), deptTable.getSelectedRow(), 1);
	
						JOptionPane.showMessageDialog(null, "Departamento atualizado com sucesso");
						btnCreate.setEnabled(true);
						txtCod.setEditable(true);
						clearFields();
					}else {
						JOptionPane.showMessageDialog(null, "Selecione um departamento");
					}
				}
			});
			
			JLabel lblCod = new JLabel("Codigo");
			
			txtCod = new JTextField();
			txtCod.setColumns(10);
			
			JLabel lblNome = new JLabel("Nome");
			
			txtName = new JTextField();
			txtName.setColumns(10);
			
			JButton btnDelete = new JButton("Delete");
			btnDelete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(deptTable.getSelectedRow() != -1) {
						Departamento departamento = new Departamento();
						DepartamentoController controller = new DepartamentoController();
						DefaultTableModel deptModel = (DefaultTableModel) deptTable.getModel();
						
						departamento.setCodigo((String) deptTable.getValueAt(deptTable.getSelectedRow(), 0));
						controller.delete(departamento);
						
						deptModel.removeRow(deptTable.getSelectedRow());
						JOptionPane.showMessageDialog(null, "Departamento excluido com sucesso");
						btnCreate.setEnabled(true);
						txtCod.setEditable(true);
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
					txtCod.setEditable(true);
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
						.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_inputPane.createSequentialGroup()
								.addGap(6)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNome)
									.addComponent(lblCod))
								.addGap(18)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_inputPane.createSequentialGroup()
										.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
										.addComponent(Limpar))
									.addGroup(gl_inputPane.createSequentialGroup()
										.addComponent(txtCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
										.addComponent(btnVoltar))))
							.addGroup(gl_inputPane.createSequentialGroup()
								.addComponent(btnCreate, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGap(48)
								.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
								.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
						.addGap(30))
			);
			gl_inputPane.setVerticalGroup(
				gl_inputPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_inputPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_inputPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_inputPane.createSequentialGroup()
								.addGap(12)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblCod)
									.addComponent(txtCod, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
								.addGroup(gl_inputPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNome))
								.addGap(16))
							.addGroup(gl_inputPane.createSequentialGroup()
								.addComponent(btnVoltar)
								.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
								.addComponent(Limpar)
								.addGap(26)))
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
				DefaultTableModel modelo = (DefaultTableModel) deptTable.getModel();
				try {
					DepartamentoController controller = new DepartamentoController();
					
					for(Departamento dept : controller.read()) {
						modelo.addRow(new Object[] {dept.getCodigo(), dept.getNome()});
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		public void clearFields() {
			txtCod.setText(null);
			txtName.setText(null);
		}
	}
    
//}
