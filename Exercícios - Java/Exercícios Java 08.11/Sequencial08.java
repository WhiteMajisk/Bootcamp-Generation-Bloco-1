package exerciciosJava08_11;

import java.util.*;

public class Sequencial08 {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);

        double CustodoConsumidor, PrešodeFabrica, LucroDistribuidor, LucroGoverno;  
        double PercLucroDistribuidor = 28, Impostos = 45;

        System.out.print("Qual Ú o custo de fabrica deste carro? ");
        PrešodeFabrica = teclado.nextInt();

        LucroDistribuidor = (PrešodeFabrica*PercLucroDistribuidor) / 100;
        LucroGoverno = (PrešodeFabrica*Impostos) / 100;

        CustodoConsumidor = PrešodeFabrica + LucroGoverno + PercLucroDistribuidor;

        System.out.println("O prešo final ao consumidor Ú: " + "R$ " +CustodoConsumidor);

	}

}
