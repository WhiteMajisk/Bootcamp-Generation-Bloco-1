package exerciciosJava09_11;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade ?\n");
        idade = input.nextInt();

        if(idade <= 14){
            System.out.println("Categoria Infantil!");
        }
        if(idade >= 14 && idade <= 17){
            System.out.println("Categoria Juvenil!");
        }
        if(idade > 18){
            System.out.println("Categoria Adulto !");
        }


	}

}
