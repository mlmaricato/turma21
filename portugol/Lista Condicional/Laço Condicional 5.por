programa
{
	
	funcao inicio(){
		//variaveis
		real indicePoluicao

		//estradas
		escreva ("Digite o Índice de Poluição")
		leia (indicePoluicao)

		//processamentos
		se (indicePoluicao >= 0.5){
			escreva ("Todos devem parar as atividades")
		}

		senao se (indicePoluicao >= 0.4){
			escreva ("Industrias do primeiro e segundo grupo devem parar as atividades!")
		}

		senao se (indicePoluicao >= 0.3) {
			escreva ("Industrias do primeiro grupo devem parar as atividades!")
		}

		senao {
			escreva ("Indice de Poluição Aceitável")
		}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 545; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */