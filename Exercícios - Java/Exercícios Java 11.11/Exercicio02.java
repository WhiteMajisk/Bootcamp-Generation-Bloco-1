package exerciciosJava11_11;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
		
		int[]results = new int[10];
		double soma = 0.0, cont = 0.0, maior = 0.0, media = 0.0;

		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.println("* * * *LAN�AMENTO DE DADOS * * * *");
		System.out.println("**********************************");
		System.out.println("**********************************\n");

		for(int lado = 0; lado < 10; lado++){
			System.out.println("Insira o " + (lado + 1) + "� resultado dos lan�amentos dos dados: ");
			results[lado] = leia.nextInt();
			soma = (soma + results[lado]);

			if(maior < results[lado]){
				maior = results[lado];
			}
			if(results[lado] == maior){
				cont++;
			}
		}
		media = soma / 10;
		
		System.out.println("\n" + "O maior n�mero lan�ado: " + maior);
		System.out.println("\n" + "O n�mero acima foi lan�ado " + cont + " vezes.");
		System.out.println("\n" + "A m�dia dos resultados dos lan�amentos foi: " + media);
		leia.close();

	}

}
