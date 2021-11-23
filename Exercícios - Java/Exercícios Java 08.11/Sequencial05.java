package exerciciosJava08_11;

import java.util.*;

public class Sequencial05 {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);
        int P1 = 2; 
        int P2 = 3; 
        int P3 = 5; 
        float N1 = 0, M1 = 0;
        float N2 = 0, M2 = 0; 
        float N3 = 0, M3 = 0, mediaFinal = 0;

        System.out.print("Insira a nota do primeiro quadrimestre: ");
        N1 = teclado.nextInt();

        System.out.print("Insira a nota do segundo quadrimestre: ");
        N2 = teclado.nextInt();

        System.out.print("Insira a nota do terceiro quadrimestre: ");
        N3 = teclado.nextInt();

        M1 = N1 * P1;
        M2 = N2 * P2;
        M3 = N3 * P3;
        mediaFinal = (M1+M2+M3) / 10;

        System.out.println("A média final é: " + mediaFinal);

	}

}
