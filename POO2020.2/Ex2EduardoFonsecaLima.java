// Eduardo Fonseca Lima
// Matrícula: 0050014914

import java.util.Scanner;

public class Ex2EduardoFonsecaLima {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int var;
		
		System.out.println("Entre com um numero inteiro");
		
		var = input.nextInt();
		
		if(var%2 == 0)
		{
			System.out.println("O numero é par");
		}
		else
			System.out.println("O numero é ímpar");
		
	}
}
