package semana10.view;
import java.sql.SQLException;
import java.util.Scanner;

import semana10.bo.Aluno;
import semana10.controller.AlunoController;

//São as informações passadas pelo usuario

public class AlunoView {
	
	public void create () throws SQLException {
		
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
	
		System.out.println("Entre com o nome do usuario:");
		aluno.setUsername(in.next());
		System.out.println("Entre com o email:");
		aluno.setEmail(in.next());
		System.out.println("Entre com a senha:");
		aluno.setPassword(in.next());
	
		AlunoController controller = new AlunoController(null);
		controller.create(aluno);
		}
	
	public void read() {
		
		AlunoController controller = new AlunoController(null);
		
		System.out.println("Listagem de Alunos");
		System.out.println("*******************");
		for(Aluno aluno:controller.read()){
			
		System.out.println("Username:" + aluno.getUsername());
		System.out.println("Email:" + aluno.getEmail());
		System.out.println("-------------------------");
		
		}
	}
	
	public void update() {
		
		
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do novo usuario:");
		aluno.setUsername(in.next());
		System.out.println("Entre com o email antigo:");
		aluno.setEmail(in.next());
		
		AlunoController controller = new AlunoController(null);
		controller.update(aluno);
		}
	
		public void delete(){
		
	
		Scanner in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Entre com o usuario a ser removido: ");
		aluno.setUsername(in.next());
			
		AlunoController controller = new AlunoController(null);
		controller.delete(aluno);
		}	
		

	public static void main(String[] args) throws SQLException {
	
		AlunoView crud = new AlunoView();
	
		int cont = 1;
		
		while(cont != 0) {
		
		System.out.println("Menu");
		System.out.println("------");
		System.out.println("1 - create");
		System.out.println("2 - read");
		System.out.println("3 - update");
		System.out.println("4 - delete");
		System.out.println("0 - sair");
		
		Scanner in = new Scanner(System.in);
		cont = in.nextInt();
		
		if(cont == 1) {
			crud.create();
		}
		else if (cont == 2) {
			crud.read();
		}
		else if (cont == 3){
			crud.update();
		}
		else if (cont == 4) {
			crud.delete();
		}
	}	
		System.out.println("Fim de cadastro");
	}
}