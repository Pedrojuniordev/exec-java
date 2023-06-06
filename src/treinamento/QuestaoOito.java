package treinamento;

import java.util.Scanner;

public class QuestaoOito {

	public static void main(String[] args) {
		// formula retangulo (base x altura)
		// formula quadrada (lado x lado)
	Scanner input = new Scanner(System.in);
	
	double quadrado, retangulo, base, altura, lado;
	
	System.out.print("\n\t Calculadora do Pedro! <3");
	
	System.out.println("\n\t Adicione a base:");
	base = input.nextDouble();
	System.out.println("\n\t Adicione a altura:");
	altura = input.nextDouble();
	System.out.println("\n\tAdicione a lado:");
	lado = input.nextDouble();
	
	retangulo = base * altura;
	System.out.printf("\n\t Area do retangulo é: " + retangulo);
	
	quadrado = lado * lado;
	System.out.printf("\n\t Area do quadrado é: " + quadrado);
	
	
	
	
	}

}
