programa
{
	
	funcao inicio()
	{
		real Resultados[10]
		real Somatoria = 0.0, Cont = 0.0, Maior = 0.0, Media = 0.0

	para(inteiro lado = 0; lado < 10; lado++){
	
		escreva("O resultado " + (lado + 1) + ": ")
		leia(Resultados[lado])

		Somatoria = (Somatoria + Resultados[lado])

	se(Maior < Resultados[lado]){
	   Maior = Resultados[lado]
	
	}
	
	se(Resultados[lado] > Maior){
	   Cont++
	}
}

	Media = Somatoria / 10

	escreva("\nO maior número lançado foi o: " + Maior)
	escreva("\nO número acima apareceu " + Cont++ + " vezes.")
	escreva("\nA média dos resultados nos lançamentos é: " + Media)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */