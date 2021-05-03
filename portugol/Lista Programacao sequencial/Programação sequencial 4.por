programa {
	
	inclua biblioteca Matematica --> mat

	funcao inicio () {
		//NOME: OBJETIVO - CALCULAR A EXPRESSÃO
		
			//variaveis
			real A
			real B
			real C
			real resultadoR
			real resultadoS
			real resultadoD
			

			//entradas
			escreva ("Determine um valor para A")
			leia (A)
			escreva ("Determine um valor para B")
			leia (B)
			escreva ("Determine um valor para C")
			leia (C)

			//processamento
			resultadoR = mat.potencia((A+B), 2.0)
			resultadoS = mat.potencia((B+C), 2.0)
			resultadoD = (resultadoR+resultadoS)/2


			//saida
			escreva ("\nO valor de R é ",resultadoR)
			escreva ("\nO valor de S é ",resultadoS)
			escreva ("\nO valor de D é ",resultadoD)
			
		//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 657; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */