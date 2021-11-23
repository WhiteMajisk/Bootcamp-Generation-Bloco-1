package exerciciosJava11_11;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

Scanner leia = new Scanner(System.in);
		
		double[]leiturapont = new double[5]; double maiorpont = 0.0;
				
		for(int i = 0; i < leiturapont.length; i++){
			System.out.println("Insira a nota da atividade: " + (i+1) + ": ");
			leiturapont[i] = leia.nextDouble();
			
			if(leiturapont[i] > maiorpont){
				maiorpont = leiturapont[i];
			}
		}
		System.out.println("\n" + "A maior nota entre as atividades é: " + maiorpont + "!" + "\n");
		leia.close();

	}

}
