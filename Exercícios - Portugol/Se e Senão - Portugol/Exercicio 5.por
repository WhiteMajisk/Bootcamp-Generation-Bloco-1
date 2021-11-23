programa
{
	
	funcao inicio()
	
	{
	real Poluicao

		escreva("Insira o indice de poluição: ")
		leia(Poluicao)

	se(Poluicao < 0.3)

	{
		escreva("Poluição dentro dos parametros aceitaveis. ")
	}

	senao se(Poluicao == 0.3 ou Poluicao < 0.4)

	{
		escreva("Industrias de Primeiro Nível devem suspender as atividades! ")
	}

	senao se(Poluicao == 0.4 ou Poluicao < 0.5)

	{
		escreva("Industrias de Primeiro e Segundo Nível deveram suspender atividades!! ")
	}

	senao se(Poluicao >= 0.5)

	{
		escreva("Todas as industria devem suspender as suas atividades IMEDIATAMENTE!!! ")
	}

	senao

		escreva("Valor Invalido. ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */