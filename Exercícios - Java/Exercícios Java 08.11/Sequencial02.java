package exerciciosJava08_11;

import java.util.*;

public class Sequencial02 {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);
        int anos = 0;
        int meses = 0;
        int dias = 0;

        System.out.print("Insira a quantidade de dias que você nasceu: ");
        dias = teclado.nextInt();

        anos = dias / 365;
     
        meses = (dias % 365) / 30;
        System.out.println("Você tem "+ anos + " anos e "+ meses + " meses .");
 

	}

}
