package exerciciosJava08_11;

import java.util.*;

public class Sequencial07 {

	public static void main(String[] args) {
		
		var teclado = new Scanner(System.in);
        double A, B, C, D, E, F;
        double X, Y;

        System.out.print("Insira o valor de A? ");
        A = teclado.nextInt();

        System.out.print("Insira o valor de B? ");
        B = teclado.nextInt();

        System.out.print("Insira o valor de C? ");
        C = teclado.nextInt();

        System.out.print("Insira o valor de D? ");
        D = teclado.nextInt();

        System.out.print("Insira o valor de E? ");
        E = teclado.nextInt();

        System.out.print("Insira o valor de F? ");
        F = teclado.nextInt();

        X = ((C*E) - (B*F)) / ((A*E)-(B*D));
        Y = ((A*F) - (C*D)) / ((A*E)-(B*D));

        System.out.println("O valor de X é: "+ X + "\n O valor de Y é: " + Y);

	}

}
