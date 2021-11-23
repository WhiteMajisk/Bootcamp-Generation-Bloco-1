programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	
	{
		
	real X1, X2, Y1, Y2, P1, P2, D

		escreva("Digite o valor de X do primeiro ponto: ")
		leia(X1)

		escreva("Digite o valor de Y do primeiro ponto: ")
		leia(Y1)

		escreva("Digite o valor de X do segundo ponto: ")
		leia(X2)

		escreva("Digite o valor de X do segundo ponto: ")
		leia(Y2)

		P1 = mat.potencia((X2-X1), 2.0)
		P2 = mat.potencia((Y2-Y1), 2.0)
		D = mat.raiz(P1 + P2, 2.0)

		escreva("A distância entre os dois pontos é de: " , D)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */