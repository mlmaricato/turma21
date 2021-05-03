programa
{
	funcao inicio (){

	real valores = 0.0
	real somaTotal = 0.0
	real media = 0.0
	inteiro totalValoresLidos = 0

	//entrada
	escreva ("Digite um número")
	leia (valores)

	//processamento

	enquanto(valores>=0){
		somaTotal = somaTotal + valores
		totalValoresLidos++
		escreva ("Digite o próximo valor (negativo se quiser parar")
		leia (valores)
	}

	media = somaTotal / totalValoresLidos

	//saída

	escreva ("O total do somatório dos valores lidos é de:",somaTotal,"\n")
	escreva ("A média final dos valores lidos é de:",media,"\n")
	escreva ("O total de valores lidos é de:",totalValoresLidos,"\n")
		
	}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 124; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */