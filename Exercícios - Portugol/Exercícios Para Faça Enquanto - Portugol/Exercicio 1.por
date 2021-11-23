programa
{
	
	funcao inicio()
	{
	real Salario, SomaSalario = 0.0, SomaNFilhos = 0.0, SalMedio, MediaFilhos, MaiorSalario = 0.0, perc100, cont100 = 0.0
	
	inteiro Filhos, Habitantes = 20, X
	
	para(X = 1; X <= Habitantes; X++)

	{
		escreva("Digite o salário do habitante: ")
		leia(Salario)

		escreva("Digite a quantidade de filhos: ")
		leia(Filhos)

		SomaSalario = SomaSalario + Salario
		SomaNFilhos = SomaNFilhos + Filhos

	se(Salario > MaiorSalario)

	{
		MaiorSalario = Salario
	}

	se(Salario <= 100)

	{
		cont100++
	}
	}

		SalMedio = SomaSalario / Habitantes
		MediaFilhos = SomaNFilhos / Habitantes

		perc100 = (cont100*100) / Habitantes

		escreva("\nMédia salarial: " + SalMedio)
		escreva("\nMédia de filhos: " + MediaFilhos)
		escreva("\nMaior salário: " + MaiorSalario)
		escreva("\nPessoas que ganham até R$100: " + perc100)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 577; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */