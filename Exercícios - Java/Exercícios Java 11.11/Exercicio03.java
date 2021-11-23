package exerciciosJava11_11;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);	
		
		int[][] n1 = new int[4][6]; int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6]; int[][] m2 = new int[4][6];

		for(int l = 0; l < 4; l++){
				for(int c = 0; c < 6; c++){
				
				//N1
				System.out.println("Digite os valores de N1: ");
				n1[l][c] = leia.nextInt();
				
				//N2
				System.out.println("Digite os valores de N2: ");
				n2[l][c] = leia.nextInt();

				//SOMA E DIFERENÇA
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
			System.out.println("\n");
		}
		//RESULTADO M1
		System.out.println("A Matriz de soma M1: ");
		for(int l = 0; l < 4; l++){
				for(int c = 0; c < 6; c++){
					System.out.print(m1[l][c] + " | ");
				}
				System.out.print("\n");				
		}
		//RESULTADO M2
		System.out.println("A Matriz das diferenças M2: ");
		for(int l = 0; l < 4; l++){
				for(int c = 0; c < 6; c++){
					System.out.print(m2[l][c] + " | ");
				}
				System.out.print("\n");
		}
		
		leia.close();
	}

}
