programa
{
	
	funcao inicio()
	{
	  //variaveis
	const inteiro PESOESTABELECIDO = 50
	real multaKilo = 4.00
	real pesoTomate
	real excesso
	real multa
	real pesoTotal

	//entrada
	escreva ("Qual o peso total encontrado?")
	leia (pesoTotal)
	escreva ("Ocorreu excesso dentro do peso estabelecido de 50kg? Se sim, coloque quantos quilos a mais")
	leia (excesso)

	//processamento
	
	multa = (pesoTotal - PESOESTABELECIDO)*4

	se (pesoTotal <= 50){
		escreva ("Peso não excedido, portanto multa = R$0.00")
	}
		senao se (pesoTotal > 50) {
			escreva("Peso excedido, portanto multa = R$",multa)
		}

		
	}
		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 424; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */