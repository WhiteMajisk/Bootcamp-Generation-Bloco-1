package exerciciosJava10_11;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        int number;
        int c=0, somaNumeros=0, mediaNumeros, multiplosDeTres=0;
        
        System.out.println("Digite os números que deseja, para realizar a média dos multiplos"
        						+ " de 3 ou 0 para encerrar o programa ");
        
        do{ 

            c++;
            System.out.println("Digite o número " + c);
            number = input.nextInt();
            if(number%3==0){
            
                somaNumeros = number + somaNumeros;
                multiplosDeTres++;
            
            }
        }while(number != 0);

        mediaNumeros = somaNumeros / multiplosDeTres;
        System.out.println("A média dos números múltiplos de 3 é: "+mediaNumeros);
    
	}

}
