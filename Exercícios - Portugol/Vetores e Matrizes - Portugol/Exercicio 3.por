programa
{
	
	funcao inicio()
	{

	inteiro N1 [4][6], N2 [4][6]
	inteiro M1 [4][6], M2 [4][6]

	para (inteiro l = 0; l<4; l++)
	{
	para (inteiro c = 0; c<6; c++)
	{
		escreva("Insira os valores da tabela N1: ")
		leia(N1[l][c]) 
		escreva("Insira os valores da tavela N2: ")
		leia(N2[l][c])

		M1[l][c] = N1[l][c] + N2[l][c] 
		M2[l][c] = N1[l][c] - N2[l][c]
	}
		escreva("\n")
	}
		escreva("A Matriz de soma M1: " + "\n")
	para (inteiro l = 0; l<4; l++)
	{
	para (inteiro c = 0; c<6; c++)
	{
		escreva(M1[l][c] + ",")
	}
		escreva("\n")
	}
		escreva("A Matriz de soma M2: " + "\n")
	para (inteiro l = 0; l<4; l++)
	{
	para (inteiro c = 0; c<6; c++)
	{
		escreva(M2[l][c] + ",")
	}	
		escreva("\n")

	}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 700; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */