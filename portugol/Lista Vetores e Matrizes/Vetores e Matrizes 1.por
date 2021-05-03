programa
{
	
	funcao inicio()
	{

	//variaveis
	real pontuacao [5]
	real maiorPontuacao = 0.0

	//entrada
	para (inteiro x=0; x<5; x++){ 
	escreva ("Digite o valor: ")
	leia (pontuacao [x])

	}
	limpa ()
	
	para (inteiro x=0; x<5; x++){
		se (pontuacao [x] > maiorPontuacao){
			maiorPontuacao = (pontuacao [x])
		}
		escreva ("\nA nota ",x+1," citada é: ",pontuacao [x])
		}
		
	escreva ("\nA maior pontuação entre os valores citados é: ",maiorPontuacao)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 71; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */