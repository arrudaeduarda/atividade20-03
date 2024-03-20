package estruturaCondicional;

import java.util.Scanner;

public class Segundaatd2003 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero;


		System.out.println("Digite o número do dia da semana (1-7) : ");
		numero = ler.nextInt();

		if (numero == 1) {
			System.out.println("Hoje é domingo.");
		}
		else if (numero == 2) {
			System.out.println("Hoje é segunda-feira.");
		}
		else if (numero == 3) {
			System.out.println("Hoje é terça-feira.");
		}
		else if (numero == 4) {
			System.out.println("Hoje é quarta-feira.");
		}
		else if(numero == 5) {
			System.out.println("Hoje é quinta-feira.");
		}
		else if(numero == 6) {
			System.out.println("Hoje é sexta-feira.");
		}
		else if (numero == 7)
			System.out.println("Hoje é sábado.");

		ler.close();

	}

}
