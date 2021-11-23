programa
{
	
	funcao inicio()
	{
	real Base, Altura, Area

		escreva("Qual o valor da Base do triangulo ? ")
		leia(Base)

		escreva("Qual o valor da Altura do triangulo ? ")
		leia(Altura)

		Area = (Base * Altura) / 2

	se(Base > 0 e Altura > 0)
	{
		escreva("A Área do triangulo é: " + Area)
	}

	senao se(Base <= 0)
	{
		escreva("Valor da Base invalido. ")
	}

	senao se(Altura <=0)	
	{
		escreva("Valor da Base invalido. ")
	}
	
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */