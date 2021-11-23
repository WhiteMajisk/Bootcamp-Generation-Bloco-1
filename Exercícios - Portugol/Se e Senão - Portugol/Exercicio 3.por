programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		inteiro NumeroW, NumeroX, NumeroY, NumeroZ, qW, qX, qY, qZ
		
			   escreva("Digite o primeiro número: ")
			   leia(NumeroW)
			   
			   escreva("Digite o segundo número: ")
			   leia(NumeroX)
			   
			   escreva("Digite o terceiro número: ")
			   leia(NumeroY)
			   
			   escreva("Digite o quarto número: ")
			   leia(NumeroZ)

			   qW = Mat.potencia(NumeroW, 2.0)

			   qX = Mat.potencia(NumeroX, 2.0)

			   qY = Mat.potencia(NumeroY, 2.0)

			   qZ = Mat.potencia(NumeroZ, 2.0)

		se 
			   (qY >= 1000)
		{
			  escreva("Resultado de ", NumeroY, "² = ", qY)
		}
		senao

		{
			  escreva(NumeroW, "² = ", qW)

			  escreva("\n", NumeroX, "² = ", qX)

			  escreva("\n", NumeroY, "² = ", qY)

			  escreva("\n", NumeroZ, "² = ", qZ)
			  
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */