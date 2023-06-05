package treinamento;

import java.util.Scanner;

public class QuestaoUm {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome, cidade;
		int idade;
		
		System.out.print("\n\tDigite seu nome: ");
		nome = in.next();
		
		System.out.print("\n\tDigite seu idade: ");
		idade = in.nextInt();
		
		System.out.print("\n\tDigite sua cidade: ");
		cidade = in.next();
		
		System.out.print("\n\t" + nome + "," + idade + " anos," + cidade + ".");
	
	}

}
