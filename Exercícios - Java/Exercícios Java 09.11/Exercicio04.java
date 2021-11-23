package exerciciosJava09_11;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        double number;

        System.out.println("Digite um numero: ");
        number = input.nextDouble();

        if(number % 2 == 0) {
            double n = Math.sqrt(number);
            System.out.println("O número "+number+" é par, e sua raiz quadrada é: "+n);
        }
        else{
            double n = Math.pow(number, 2);
            System.out.println("O número "+number+" é ímpar, e "+number+ " elevado ao quadrado é: "+n);
        }

	}

}
