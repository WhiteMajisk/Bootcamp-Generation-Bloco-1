package exerciciosJava08_11;

import java.util.*;

public class Sequencial01 {

	public static void main(String[] args) {
		var keybord = new Scanner(System.in);
		int age = 0;
		int mes = 0;
		int dia = 0;
		int dias = 0;
		
		System.out.print("Qual � a sua idade? ");
		age = keybord.nextInt();
		System.out.println(age);
		
		System.out.print("Qual m�s voc� nasceu? ");
		mes = keybord.nextInt();
		System.out.println(mes);
		
		System.out.print("Qual dia voc� nasceu? ");
		dia = keybord.nextInt();
		System.out.println(dia);
		
		dias = (age * 365) + (mes * 30) + dia;
		System.out.println("Voc� nasceu �: " + dias + " dias");
				
			
	}

}