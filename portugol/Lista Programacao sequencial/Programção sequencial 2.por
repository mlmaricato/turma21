programa {
	funcao inicio () {
		//NOME: OBJETIVO: Transformar a idade mostrada em dias em anos, meses e dias
		

			//variaveis:
			inteiro anos
			inteiro meses
			inteiro dias
			inteiro resultadoAnos
			inteiro resultadoMeses
			inteiro resultadoDias

			//entrada
			escreva("Escreva o número de dias")
			leia (dias)

			//processamento
			resultadoAnos = (dias/365)
			//resultadoMeses = (dias-(resultadoAnos*365))/30
			//resultadoDias = (dias - (resultadoAnos*365)-(resultadoMeses*30))

			resultadoMeses = (dias%365)/30
			resultadoDias = (dias%365)%30

			//saida
			escreva("\nSua idade em anos é " +resultadoAnos)
			escreva("\nSua idade em meses é " +resultadoMeses)
			escreva("\nSua idade em dias é " +resultadoDias)
			escreva ("\nSua idade é " +resultadoAnos, "anos, " +resultadoMeses, "meses e " +resultadoDias, "dias.")

		//fim
			
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */