package treinamento;

import java.util.Scanner;

public class QuestaoSete {
	
	public static void main(String[] args) {
		// (°F -32) x 5/9 = °C // kelvin C = K - 273.15
		// kevin = C + 273 // fahreite = Celsius x 1,8 + 32.
		
		Scanner entrada = new Scanner(System.in);
		
		double cel, fah, ken;
		
		System.out.print("\n\t Calculadora do Pedro! <3");
		
		System.out.print("\n Digite a temperatura em Celsius: ");
		cel = entrada.nextDouble();
		
		fah = ( cel * 1.8) + 32;
		
		System.out.print("\n A medida convertida da calculadora do Pedro é:" + fah + "ºF \n");
		
		ken = cel + 273;
		
		System.out.print("\n A medida convertida da calculadora do Pedro é:" + ken + "ºK \n");

	
	}

}
