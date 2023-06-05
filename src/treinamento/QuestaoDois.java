package treinamento;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	String nome;
	long cpf;
	long rg;
	
	System.out.print("\n\tDigite seu nome: ");
	nome = in.next();
	
	System.out.print("\n\tDigite seu cpf: ");
	cpf = in.nextLong();
	
	System.out.print("\n\tDigite seu rg: ");
	rg = in.nextLong();
	
	System.out.print("\n\t" + nome + "," + cpf + "," + rg + ". Cadastro realizado");
	
	}

}
