programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{	

	//variaveis 
	const inteiro QUANTIDADELANCAMENTO = 3
	inteiro lancamento [QUANTIDADELANCAMENTO] 
	

	para (inteiro x = 0; x < QUANTIDADELANCAMENTO; x++){
		escreva ("Jogue o dado e digite o valor encontrado: ")
		leia (lancamento [x])
	}

	limpa()

	//variaveis
	real soma = 0.0
	real maiorLancamento = 0.0

	para (inteiro x = 0; x < QUANTIDADELANCAMENTO; x++){
		escreva ("Lançamento ",x+1,": ",lancamento[x],"\n")

		soma = soma + lancamento [x]
		
		se (lancamento [x] > maiorLancamento){
			maiorLancamento = lancamento [x]
		}
	}

	//variaveis
	inteiro numeroVezesMaiorLancamento = 0

	para (inteiro x = 0; x < QUANTIDADELANCAMENTO; x++){
		se (lancamento[x] == maiorLancamento){
			numeroVezesMaiorLancamento = numeroVezesMaiorLancamento + 1
		}		
	}

	//variaveis
	real media = 0.0

	media = mat.arredondar(soma / QUANTIDADELANCAMENTO,2)

	escreva ("\nA média aritmética dos lançamentos é: ",media)
	escreva("\nO maior lançamento foi: ",maiorLancamento)
	escreva ("\nO maior lançamento ocorreu ",numeroVezesMaiorLancamento," vezes")

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 835; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */