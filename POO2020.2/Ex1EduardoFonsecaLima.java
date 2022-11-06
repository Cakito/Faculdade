// Eduardo Fonseca Lima
// Matrícula: 0050014914

import java.util.Scanner;

public class Ex1EduardoFonsecaLima {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int var;
		int i;
		
		System.out.println("Entre com um numero para saber a sua tabuada");
		
		var = input.nextInt();
		
		for (i = 0; i <= 9; i++) {
			System.out.println(var + " x " +  i  + " = " + (var * i));
		}
		System.out.println();
	}
}
