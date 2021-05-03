programa
{

	funcao inicio (){
		real mediaSalario = 0.0
		real mediaFilhos = 0.0
		real salarioMaior = 0.0
		real salarioMenor100 = 0.0
		real percentualMenorSalario = 0.0	
		real somaSalario = 0.0
		real somaFilhos = 0.0
		real salario = 0.0
		inteiro filhos = 0
		const inteiro HABITANTES = 20

		para (inteiro contador = 1; contador <=20; contador++){
			escreva ("Qual seu salário?")
			leia (salario)
			escreva ("Quantos filhos(as) você tem?")
			leia (filhos)

			somaSalario = somaSalario + salario
			somaFilhos = somaFilhos + filhos

			se (salario > salarioMaior){
				salarioMaior = salario
			}
			se (salario <= 100.00){
				salarioMenor100++
			}
		}

		mediaSalario = somaSalario / 20
		mediaFilhos = somaFilhos / 20
		percentualMenorSalario = (salarioMenor100/20) * 100

		//saidas
		escreva ("A média de salário da população é:",mediaSalario,"\n")
		escreva ("A média de filhos é:",mediaFilhos, "\n")
		escreva ("O maior salário é:",salarioMaior, "\n")
		escreva ("O percentual com pessoas com salário até R$100 é:",percentualMenorSalario, "\n")	
		
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */