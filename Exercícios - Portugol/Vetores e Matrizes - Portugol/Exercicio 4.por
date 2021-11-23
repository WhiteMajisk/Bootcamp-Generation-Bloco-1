programa
{
	
	funcao inicio()
	{
	real m[3][3]
	real Valor = 0.0, Soma = 0.0, SomaD = 0.0

	para(inteiro l = 0; l < 3; l++)
	{
	para(inteiro c = 0; c < 3; c++)
	{
		escreva("Valor: ")
		leia(m[l][c])
	
		Soma += m[l][c]
	}
	}

	para(inteiro l = 0; l < 3; l++) 
	{
		SomaD += m[l][l]
	}

		escreva("Soma da matriz: ", Soma)
		escreva("\nSoma da diagonal principal: ", Soma)
		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 53; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */