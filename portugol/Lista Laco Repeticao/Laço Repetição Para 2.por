programa
{
	
	funcao inicio()
	{
		//Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram 
		//no conjunto dos números de 1 até 500.

		//variaveis
		inteiro soma = 0

		//processamento

		para (inteiro contador =1; contador <=500; contador++){
			se ((contador % 2 != 0) e (contador % 3 == 0)){
				escreva (soma)
				soma = soma + contador
				escreva("+",contador,"=",soma,"\n") // pq o escreva começa com mais? o numero ja vai direto?
				
				
			}
			
		}

		//saida

		
		escreva ("\nA soma desses números é um total de:",soma)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */