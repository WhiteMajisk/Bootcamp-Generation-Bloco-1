package exerciciosJava08_11;

import java.util.*;

public class Sequencial08 {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);

        double CustodoConsumidor, Pre�odeFabrica, LucroDistribuidor, LucroGoverno;  
        double PercLucroDistribuidor = 28, Impostos = 45;

        System.out.print("Qual � o custo de fabrica deste carro? ");
        Pre�odeFabrica = teclado.nextInt();

        LucroDistribuidor = (Pre�odeFabrica*PercLucroDistribuidor) / 100;
        LucroGoverno = (Pre�odeFabrica*Impostos) / 100;

        CustodoConsumidor = Pre�odeFabrica + LucroGoverno + PercLucroDistribuidor;

        System.out.println("O pre�o final ao consumidor �: " + "R$ " +CustodoConsumidor);

	}

}
