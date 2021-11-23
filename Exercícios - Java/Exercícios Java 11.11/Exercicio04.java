package exerciciosJava11_11;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);	
		
		double[][] matriz = new double[3][3];
		double soma = 0; double sdiagonal = 0;

		for(int l = 0; l < 3; l++){
			for(int c = 0; c < 3; c++){
				System.out.println("Insira os valores para preencher a matriz: ");
				matriz[l][c] = leia.nextDouble();

				soma += matriz[l][c];
			}
		}
		for(int l = 0; l < 3; l++){
			//para(inteiro c = 0; c < 3; c++){
				//se(l == c){
					sdiagonal += matriz[l][l];
				//}6
			//}
		}
		System.out.println("\n");
		System.out.println("A Soma total dos valores da matriz é: " + soma);
		System.out.println("\n" + "A Soma total da diagonal principal é: " + sdiagonal);
		System.out.println("\n");
		leia.close();

	}

}
