programa
{
	
	funcao inicio()
	{
	inteiro Codigo, Horas, Salario, Excedente, Extras, TotalSalario
	real Total

		escreva("Cód. do Operario: ")
		leia(Codigo)

		escreva("Horas de Trabalho: ")
		leia(Horas)

		Salario = 10 * Horas
		Excedente = Horas - 50
		Extras = Excedente * 20

	se(Horas > 50)
	{
		TotalSalario = (Horas - Excedente) * 10
		Total = TotalSalario + Extras

		escreva("Código do Operario ", Codigo, " Realizou horas extras. ")
		escreva("\nHoras extras trabalhadas: ", Excedente, "H")
		escreva("\nAdicional correspondente: R$", Extras)
		escreva("\nSalário + Adicional (Extras): R$", TotalSalario)
	}
	senao
	
		escreva("\nNão há incidencia de Horas Extras, o Salario é: R$")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */