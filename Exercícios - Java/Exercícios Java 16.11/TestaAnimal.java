package heranca;

	public class TestaAnimal {
			
				public static void main(String[] args) {
				
				Cachorro c1 = new Cachorro ();
				Cavalo cv1 = new Cavalo ();
				Preguica pr1 = new Preguica ();
				
				c1.setNome("O nome do cachorro �: Pirata");
				c1.setEspecie("Cachorro");
				c1.setRaca("Bulldog Ingles");
				c1.setIdade(6);
				c1.setPorte("Pequeno");
				c1.setMovimentacao("Correr");
				c1.setEmitirSom("Au Au!");
				
				System.out.println("Nome: " + c1.getNome());
				System.out.println("Esp�cie: " + c1.getEspecie());
				System.out.println("Ra�a: " + c1.getRaca());
				System.out.println("Idade: " + c1.getIdade() + " anos");
				System.out.println("Porte: " + c1.getPorte());
				System.out.println("Movimenta��o: " + c1.getMovimentacao());
				System.out.println("Som emitido: " + c1.getEmitirSom());
				
				System.out.println();
				
				cv1.setNome("\nO nome do cavalo �: Trojan");
				cv1.setEspecie("Cavalo");
				cv1.setRaca("Mustang");
				cv1.setIdade(11);
				cv1.setPorte("Grande");
				cv1.setMovimentacao("Correr");
				cv1.setEmitirSom("Hiin in in");
				
				System.out.println("Nome: " + cv1.getNome());
				System.out.println("Esp�cie: " + cv1.getEspecie());
				System.out.println("Ra�a: " + cv1.getRaca());
				System.out.println("Idade: " + cv1.getIdade() + " anos");
				System.out.println("Porte: " + cv1.getPorte());
				System.out.println("Movimenta��o: " + cv1.getMovimentacao());
				System.out.println("Som emitido: " + cv1.getEmitirSom());
				
				System.out.println();
				
				pr1.setNome("O nome do cavalo �: Flash");
				pr1.setEspecie("Pregui�a");
				pr1.setRaca("Pregui�a-de-bentinho");
				pr1.setIdade(4);
				pr1.setPorte("M�dio");
				pr1.setMovimentacao("Subir em �rvores");
				pr1.setEmitirSom("ZzZzZzZz ZzZzZzZzZz");
				
				System.out.println("Nome: " + pr1.getNome());
				System.out.println("Esp�cie: " + pr1.getEspecie());
				System.out.println("Ra�a: " + pr1.getRaca());
				System.out.println("Idade: " + pr1.getIdade() + " anos");
				System.out.println("Porte: " + pr1.getPorte());
				System.out.println("Movimenta��o: " + pr1.getMovimentacao());
				System.out.println("Som emitido: " + pr1.getEmitirSom());

			}

}