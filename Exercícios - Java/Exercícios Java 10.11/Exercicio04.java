package exerciciosJava10_11;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		
		 int masculino=0, feminino=0, outros=0;
	        int pessoasCalmas=0, pessoasAgressivas=0, mulheresNervosas=0, homensAgressivo=0, outrosCalmos=0, pNervosasMaisQuarenta=0, pCalmasMenosDezoito=0;
	        int contador = 0;

	        Scanner input = new Scanner(System.in);
	        while(contador < 150){
	            contador++;

	            System.out.println("Digite seu sexo: \n Mulher aperte -> 1 \n Homem aperte -> 2 \n Outros aperte -> 3");
	            int sexo = input.nextInt();
	            if(sexo == 1){
	                feminino++;
	                System.out.println("Qual a sua idade? ");
	                int idade = input.nextInt();
	                System.out.println("Digite o número que corresponde a sua personalidade: \n 1-> Nervosa \n 2-> Agressiva \n 3-> Calma");
	                int calma = input.nextInt();
	                if(calma == 1){
	                    mulheresNervosas++;}
	                if(calma == 3){
	                    pessoasCalmas++;
	                }
	                if(calma == 1 && idade > 40){
	                    pNervosasMaisQuarenta++;
	                }
	                if(calma == 3 && idade < 18){
	                    pCalmasMenosDezoito++;
	                }
	            }
	            if(sexo == 2){
	                masculino++;
	                System.out.println("Qual a sua idade? ");
	                int idade = input.nextInt();
	                System.out.println("Digite o número que corresponde a sua personalidade: \n 1-> Nervoso \n 2-> Agressivo \n 3-> Calmo");
	                int calma = input.nextInt();
	                if(calma == 2){
	                    homensAgressivo++;}
	                if(calma == 3){
	                    pessoasCalmas++;
	                }
	                if(calma == 1 && idade > 40){
	                    pNervosasMaisQuarenta++;
	                }
	                if(calma == 3 && idade < 18){
	                    pCalmasMenosDezoito++;
	                }
	            }
	            if(sexo == 3){
	                outros++;
	                System.out.println("Qual a sua idade? ");
	                int idade = input.nextInt();
	                System.out.println("Digite o número correspondente a sua personalidade: \n 1-> Nervoso \n 2-> Agressivo \n 3-> Calmo");
	                int calma = input.nextInt();
	                
	                if(calma == 3){
	                    pessoasCalmas++;
	                    outrosCalmos++;
	                }
	                if(calma == 1 && idade > 40){
	                    pNervosasMaisQuarenta++;
	                }
	                if(calma == 3 && idade < 18){
	                    pCalmasMenosDezoito++;
	                }
	            }

	        }
	        System.out.println("O numero de pessoas calmas é: "+pessoasCalmas);
	        System.out.println("O numero de mulheres nervosas é: "+mulheresNervosas);
	        System.out.println("O numero de homens agressivos é: "+homensAgressivo);
	        System.out.println("O numero de outros calma é: "+outrosCalmos);
	        System.out.println("O numero de pessoas nervosas com mais de 40 anos é: "+pNervosasMaisQuarenta);
	        System.out.println("O numero de pessoas calmas com menos de 18 anos é: "+pCalmasMenosDezoito);

	    }
	    
	}