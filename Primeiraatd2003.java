package estruturaCondicional;

import java.util.Scanner;

public class Primeiraatd2003 {

	public static void main(String[] args) {
		

		double nota1, nota2, nota3, nota4, media;

		Scanner ler = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextDouble();
		media = nota1 + nota2 + nota3 + nota4;
		media /= 4; 

		if (media >=6) {
			System.out.println("Aprovado " + media);
		}
		else {
			System.out.println("Reprovado " + media);
		}
		ler.close();
	}

}
