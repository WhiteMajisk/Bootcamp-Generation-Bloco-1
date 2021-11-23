package exerciciosJava10_11;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int idade = 0, menosDeVinteUm = 0, maisDeCinquenta = 0;

        while(idade < 99) {

            System.out.print("Qual sua idade ?");
            idade = input.nextInt();

            if(idade < 21){
                menosDeVinteUm++;
            }
            if(idade > 50){
                maisDeCinquenta++;
            }

        }
        System.out.println("Existem "+menosDeVinteUm+" pessoas menores de 21 anos e "+maisDeCinquenta+" pessoas com mais de 50 anos !!");
    }
    
}