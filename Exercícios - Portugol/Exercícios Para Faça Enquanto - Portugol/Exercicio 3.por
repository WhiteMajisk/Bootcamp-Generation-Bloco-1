programa
{
	
	funcao inicio()
	{

	real SomaTotal = 0.0, ValorMedio = 0.0, Valor = 0.0
	inteiro QuantidadeValores = 0.0

	enquanto(Valor >= 0)
	{
		SomaTotal = SomaTotal + Valor

		escreva("Resultado: " + SomaTotal)

		escreva("\nDigite um númer a ser somado: ")
		leia(Valor)

		QuantidadeValores++
		
	}
	
		ValorMedio = SomaTotal / QuantidadeValores

		escreva("A soma total dos valores é: " + SomaTotal)

		escreva("\nO valor médio é: " + ValorMedio)

		escreva("\nVocê inseriu um total de: " + QuantidadeValores + "Valores.")

	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */