package exerciciosJava09_11;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int A, B, C;

        System.out.println("Qual o valor de A ?");
        A = input.nextInt();

        System.out.println("Qual o valor de B ?");
        B = input.nextInt();

        System.out.println("Qual o valor de C ?");
        C = input.nextInt();
        
        if(A > B && A > C) {
            System.out.println("O maior numero � A : "+A);
        }
        if(B > A && B > C) {
            System.out.println("O maior numero � B : "+B);
        }
        if(C > A && C > B) {
            System.out.println("O maior numero � C : "+C);

        }
            
	}

}
