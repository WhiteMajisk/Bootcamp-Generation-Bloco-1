package exerciciosJava10_11;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);

        int par = 0, impar = 0;

        for(int c = 1; c <=10; c++) {

            int ler;
            System.out.println("Digite o numero "+c+" :");
            ler = number.nextInt();

            if(ler%2==0){
                
                par++;

            }
            else{

                impar++;

            }
            System.out.println("Voc� digitou "+par+ " n�mero par e "+impar+" n�mero �mpar");
            
        }

	}

}
