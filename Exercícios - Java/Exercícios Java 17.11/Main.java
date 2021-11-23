package collections;
	
		import java.util.ArrayList;
		import java.util.Scanner;

		public class Main{

			public static void main(String[] args) {
				
				int tipo;
				
				Scanner input = new Scanner(System.in);
				System.out.println("Quantos motores que você pode preparar por semana? ");
				tipo = input.nextInt();
				
				ArrayList <OficinadoRodrigão> Loja1 = new ArrayList(); 
								
				for(int i = 0; i < tipo; i++) {
					
					String Produtos, Validade, Turbina;
					int Quantidade; 
					System.out.println("Quantos kits de preparação temos em estoque? ");
					Produtos = input.next();
					
					System.out.println("Qual a validade dessas peças? ");
					Validade = input.next();
					
					System.out.println("Quais turbinas temos em estoque? ");
					Turbina = input.next();
					
					System.out.println("Qual a quantidade? ");
					Quantidade = input.nextInt();
					
					Loja1.add(new OficinadoRodrigão(Produtos, Validade, Quantidade, Turbina));
						 
				}
				
				for (OficinadoRodrigão al : Loja1) {
					System.out.println(al);
				}
				
	}

}
