programa
{
	funcao inicio()
 {
		cadeia nome
		inteiro qtdMenorNota = 0
		real nota = 0.0, mediaNota = 0.0, maiorNota = 0.0, resultado = 0.0

		para (inteiro contador = 1; contador <= 5; contador++) {
			//escreva("Digite seu nome: ")
			//leia(nome)
			escreva("Informe sua nota: ")
			leia(nota)

			resultado = resultado + nota

			//Média das notas
			mediaNota = resultado / 5
		}



		escreva("\nMédia de notas: ", mediaNota)
	}
}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 242; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */