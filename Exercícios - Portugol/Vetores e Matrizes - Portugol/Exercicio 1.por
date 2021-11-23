programa
{
	
	funcao inicio()
	{
		real Pontuacao [5], MValor = 0.0
		
		para (inteiro i = 0; i < 5; i++) 
		{
			escreva("Digite as pontuações: ")
			leia(Pontuacao [i])

		se (MValor < Pontuacao[i])
		{
			MValor = Pontuacao[i]
			
		}
		}
		escreva("\n Dentre a atividades a maior pontuação é: " + MValor)
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {Pontuacao, 6, 7, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */