package exerciciosJava10_11;

import java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int number, total =0 ; 
        do{
            System.out.println("Digite um numero: ");
            number = input.nextInt();
            total = number + total;

        }
        while(number != 0);
        
        System.out.println("A soma dos numeros digitados é: "+total);

	}

}
