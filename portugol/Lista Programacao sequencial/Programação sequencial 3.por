programa{
	funcao inicio () {
		//NOME: OBJETIVO - Transformar segundos em horas, minutos e segundos
		
			//variaveis
			inteiro segundosTotal
			inteiro resultadoHoras
			inteiro resultadoMinutos
			inteiro resultadoSegundos

			//entrada
			escreva ("Qual o total de segundos?")
			leia (segundosTotal)

			//processamento
			resultadoHoras = segundosTotal/3600
			resultadoMinutos = (segundosTotal%3600)/60
			resultadoSegundos = (segundosTotal%3600)%60

			//saida
			escreva ("\nO total de horas é " +resultadoHoras)
			escreva ("\nO total de minutos é " +resultadoMinutos)
			escreva ("\nO total de segundos é " +resultadoSegundos)
			escreva ("\n O total é " +resultadoHoras, "horas, " +resultadoMinutos, "minutos e " +resultadoSegundos, "segundos.")

		//fim	
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */