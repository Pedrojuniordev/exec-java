package treinamento;

import java.util.Scanner;

public class QuestaoQuatro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double number1, number2, soma, multi, div, sub;
		
		System.out.println("Entre com 1 numero:");
		number1 = input.nextDouble();
		System.out.println("Entre com 2 numero");
		number2 = input.nextDouble();
 
		
		soma = number1 + number2;
		multi = number1 * number2;
		div = number1 / number2;
		sub = number1 - number2;
		
		System.out.printf("O resultado de seu algoritimo é: %.3f, %.3f, %.3f, %.3f", soma, multi,div, sub);
	
	}

}
