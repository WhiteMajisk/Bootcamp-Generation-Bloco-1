programa

{
	
	funcao inicio()
	
	{
	
	inteiro tempo, horas, minutos, segundos

		escreva("Quantos segundos de duração terá o evento? ")
		leia(segundos)

		horas = (segundos / 3600)
		minutos = ((segundos % 3600) / 60)
		segundos = ((segundos % 3600) % 60)


        escreva("O evento terá a duração de ", horas, " horas, ", minutos, " minutos e ", segundos, " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */