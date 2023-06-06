package treinamento;

import java.util.Scanner;

public class QuestaoSeis {

	public static void main(String[] args) {
		// IMC = PESO /(ALTURA * ALTURA)
		
	Scanner input = new Scanner(System.in);
		double peso, altura, imc;

		System.out.print("\n\t Calculadora do Pedro! <3");
		
		System.out.println("\n\t Entre com o peso");
		peso = input.nextDouble();
		System.out.println("\n\t Entre com o altura");
		altura = input.nextDouble();
		
		imc = peso /(altura * altura);
		System.out.printf("\n\t O seu IMC é: " + imc);
	
	
	}

}