programa
{
	
	funcao inicio()
	{
		//variaveis
		cadeia nome
		inteiro idade

		//entradas
		escreva ("Olá, qual seu nome?")
		leia (nome)
		escreva ("Olá, qual sua idade?")
		leia (idade)

		//processamento

		se (idade>=5 e idade<=7) {
			escreva ("\nVocê está classificado como Infantil A " ,nome)
		}
		senao se (idade>=8 e idade<=11) {
			escreva ("\nVocê está classificado como Infantil B " ,nome)
		}

		senao se (idade==12 e idade==13) {
			escreva ("\nVocê está classificado como Juvenil A " ,nome)
		}
		senao se (idade>=14 e idade<=17) {
			escreva ("\nVocê está classificado como Juvenil B " ,nome)
		}

		senao se (idade>18) {
			escreva ("\nVocê está classificado como Adulto (a) " ,nome)
		}


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */