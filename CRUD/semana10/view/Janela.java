package semana10.view;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import semana10.controller.AlunoController;
import semana10.controller.Botao;
import semana10.controller.RBController;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsername;
	private JTextField tfEmail;
	private JPasswordField tfpswd;
	private JTable tblAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {

		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(41, 88, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(27, 46, 60, 14);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(27, 130, 60, 14);
		contentPane.add(lblPassword);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 278, 455, 139);
		contentPane.add(scrollPane);
		
		tblAluno = new JTable();
		scrollPane.setViewportView(tblAluno);
		DefaultTableModel modelo = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Usu\u00E1rio", "Email"
				}
			);
		tblAluno.setModel(modelo);
		tblAluno.getColumnModel().getColumn(0).setPreferredWidth(315);
		tblAluno.getColumnModel().getColumn(1).setPreferredWidth(318);
		
		AlunoController controller = new AlunoController(tblAluno);
		controller.tblAluno();
		
		
		tfUsername = new JTextField();
		tfUsername.setBounds(100, 43, 162, 20);
		contentPane.add(tfUsername);
		tfUsername.setColumns(10);

		tfEmail = new JTextField();
		tfEmail.setBounds(97, 85, 165, 20);
		contentPane.add(tfEmail);
		tfEmail.setColumns(10);

		tfpswd = new JPasswordField();
		tfpswd.setBounds(100, 127, 162, 20);
		contentPane.add(tfpswd);
		

		JRadioButton rdbtnCreate = new JRadioButton("Create");
		rdbtnCreate.setBounds(41, 248, 109, 23);
		contentPane.add(rdbtnCreate);
		rdbtnCreate.setSelected(true);

		JRadioButton rdbtnUpdate = new JRadioButton("Update");
		rdbtnUpdate.setBounds(182, 248, 109, 23);
		contentPane.add(rdbtnUpdate);

		JRadioButton rdbtnDelete = new JRadioButton("Delete");
		rdbtnDelete.setBounds(322, 248, 109, 23);
		contentPane.add(rdbtnDelete);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtnCreate);
		bg.add(rdbtnUpdate);
		bg.add(rdbtnDelete);

		JButton btnAplicar = new JButton("Aplicar");
		
		btnAplicar.setBounds(173, 187, 89, 23);
		contentPane.add(btnAplicar);

		RBController rcontrol = new RBController(tfUsername, tfEmail, tfpswd, 
				lblUsername, lblEmail, lblPassword,
				rdbtnCreate, rdbtnUpdate, rdbtnDelete, btnAplicar);
		
		rdbtnCreate.addActionListener(rcontrol);
		rdbtnUpdate.addActionListener(rcontrol);
		rdbtnDelete.addActionListener(rcontrol);
		
		Botao bc = new Botao(tfUsername, tfEmail, tfpswd, rdbtnCreate, rdbtnUpdate, rdbtnDelete, tblAluno);
		btnAplicar.addActionListener(bc);
		
		
	}
}
