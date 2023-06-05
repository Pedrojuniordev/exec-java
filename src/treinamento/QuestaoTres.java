package treinamento;

import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
		int number1 = 9;
		int number2 = 18;
		
		int soma;
		int multi;
		int div;
		int menos;
		
		soma = number1 + number2;
		multi = number1 * number2;
		div = number1 / number2;
		menos = number1 - number2;
		
		System.out.printf("O resultado é esse: %d, %d, %d, %d", soma, multi, div, menos);
		
	}

}
