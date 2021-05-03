programa
{

    funcao inicio()
    {

    	//variaveis
    	const inteiro VALORHORA = 10
    	const inteiro VALORHORAEXTRA = 20
    	const inteiro LIMITEHORAS = 50
    	inteiro horasTrabalho
    	inteiro horasExtras
    	inteiro salarioExtra
    	inteiro salarioHora

	//entrada
	escreva ("Quantas horas você trabalhou?")
	leia (horasTrabalho)

	//processamento
	se (horasTrabalho > LIMITEHORAS) {
		horasExtras = horasTrabalho - LIMITEHORAS
		salarioExtra = horasExtras * VALORHORAEXTRA
		salarioHora = 50 * VALORHORA
		escreva ("Você receberá o salário total de R$" ,salarioHora, " e por ter trabalhado " ,horasExtras, " horas, seu salário excedente é R$",salarioExtra)
	}

	senao{
	salarioHora = horasTrabalho * VALORHORA
	escreva ("Você trabalhou: ",horasTrabalho, " horas e receberá: ", salarioHora, " reais")
	}

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */