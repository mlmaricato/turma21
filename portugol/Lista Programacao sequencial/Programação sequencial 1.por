programa{
	funcao inicio () {
		//NOME: OBJETIVO - Transformar idade expressa em anos, meses e dias em apenas dias
		// inicio
			//variaveis
			inteiro anos
			inteiro meses
			inteiro dias
			inteiro resultadoDias

			//entradas
			escreva ("Qual sua idade em anos?")
			leia(anos)
			escreva ("Qual sua idade em meses?")
			leia (meses)
			escreva ("Qual sua idade em dias?")
			leia (dias)

			//processamento
			resultadoDias = (anos*365)+(meses*30)+dias

			//saída
			escreva ("Sua idade aproximada em dias é: "+resultadoDias)

		//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */