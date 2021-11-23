programa
{
	
	funcao inicio()
	{
	inteiro Idade

		escreva("Insira a idade do nadador: ")
		leia(Idade)

	se(Idade < 5)

	{
		escreva("Idade Invalida! O Nadador não possui a idade minima. ")
	}

	senao se(Idade >=5 e Idade <= 7)

	{
		escreva("Nadador enquadrado na Categoria Infantil A. ")
	}

	senao se(Idade >=8 e Idade <=11)

	{
		escreva("Nadador enquadrado na Categoria Infantil B. ")
	}

	senao se(Idade >=12 e Idade<=13)

	{
		escreva("Nadador enquadrado na Categoria Juvenil A. ")
	}

	senao se(Idade >=14 e Idade<=17)

	{
		escreva("Nadador enquadrado na Categoria Juvenil B. ")
	}

	senao

	{
		escreva("Nadador enquadrado na Categoria Adulta. ")
	}
	
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 673; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */