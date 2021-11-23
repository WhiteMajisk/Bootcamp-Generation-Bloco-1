package exerciciosJava08_11;

import java.util.*;

public class Sequencial08 {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);

        double CustodoConsumidor, PreçodeFabrica, LucroDistribuidor, LucroGoverno;  
        double PercLucroDistribuidor = 28, Impostos = 45;

        System.out.print("Qual é o custo de fabrica deste carro? ");
        PreçodeFabrica = teclado.nextInt();

        LucroDistribuidor = (PreçodeFabrica*PercLucroDistribuidor) / 100;
        LucroGoverno = (PreçodeFabrica*Impostos) / 100;

        CustodoConsumidor = PreçodeFabrica + LucroGoverno + PercLucroDistribuidor;

        System.out.println("O preço final ao consumidor é: " + "R$ " +CustodoConsumidor);

	}

}
