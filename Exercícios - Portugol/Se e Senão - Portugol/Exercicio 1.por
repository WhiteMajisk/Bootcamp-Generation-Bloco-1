programa
{
	
	funcao inicio()
	{
	real Peso, Excesso, Multa

		escreva("Peso da carga: ")
		leia(Peso)

		Excesso = Peso - 50
	se (Peso > 50.0)
	{
		escreva("O peso ultrapassou o limite. ")

		escreva("\nExcesso de peso: " + Excesso)

		escreva("\nMulta: " + Excesso * 4)
		
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */