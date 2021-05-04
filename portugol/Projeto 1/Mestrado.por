programa
{
	
	funcao inicio()

	{
		
		inteiro codigo=0
		inteiro matricula=0
		cadeia cpf
		real pontos[10]
		// status
		caracter continuar
		real totalAtual = 0.0
		caracter movimento
		real creditoMestrado = 0.0
		real creditoMestradoAtual = 10.0
		inteiro x = 0
		
		
		
		escreva("ESCOLA SND\n")
		escreva("SLOGAN")
		escreva("\n")
		escreva("1-BÁSICO\n")
		escreva("2-MÉIO\n")
		escreva("3-GRADUAÇÃO\n")
		escreva("4-PÓS\n")
		escreva("5-MESTRADO\n")
		escreva("6-SAIR\n")

		escreva("DIGITE O CÓDIGO DA OPERAÇÃO: ")
		leia(codigo)

		limpa ()

		se(codigo==5){
			escreva("Universidade de Tecnologia\n")
			escreva("SEU DESENVOLVIMENTO COMEÇA AQUI!\n")
			escreva("\n")
			escreva("MESTRADO\n")
			escreva("\n")
			
			escreva("Matrícula: ")
			leia(matricula)
			escreva("\nCPF: ")
			leia(cpf)
			//escreva("\nStatus(1-Ativo 2-Inativo): ")
			//leia(status)
			escreva("\n")

			limpa()

			//processamento

			
			faca{
				escreva ("O total de pontos atual é: ", totalAtual)

				se(x==0){ //Primeira nota - primeiro espaço
					escreva ("\nDigite sua nota: ")
					leia (pontos[x])
					totalAtual = totalAtual + pontos [x]
				}

				senao{
					escreva("\nMOVIMENTOS: I para incluir nota ou R para retirada nota: ")
					leia(movimento)
					escreva("\nDigite a nota que deseja incluir ou excluir: ")
					leia(pontos[x])
			

					se(pontos [x] >0){ //nota for maior que 0
					se(movimento=='I'){ //para incluir nota
						totalAtual = pontos[x] + totalAtual
					}
					senao{ //para excluir nota
						totalAtual = totalAtual - pontos[x]
					}
				}
					senao { //?????
					escreva ("\nDigite um valor válido(positivo): ")
					leia(pontos[x])
					}
					se(movimento=='I'){ //para incluir nota
						totalAtual = pontos[x] + totalAtual
					}
					senao{ //para excluir nota
						totalAtual = totalAtual - pontos[x]
					}
				}
			

			se(creditoMestradoAtual>0){
				escreva("Gostaria de solicitar o uso de seu credito: (S/N): ")
				leia (continuar)
				se(continuar =='S'){
					escreva("Seu crédtio atual é: ",creditoMestradoAtual,". Quantos créditos deseja utilizar:? ")
					leia(creditoMestrado)
					creditoMestradoAtual = creditoMestradoAtual - creditoMestrado
					totalAtual = totalAtual + creditoMestrado
					
				}
			}

			senao{
				escreva("\nSeus créditos acabaram")
			}
			x++
			escreva ("Continuar S/N?: ")
			leia(continuar)
			
			}enquanto (x<10 e continuar!='N')
			escreva ("\nFim dos Movimentos!")

				se(creditoMestrado>0){
				escreva("Gostaria de solicitar o uso de seu credito: (S/N): ")
				leia (continuar)
				se(continuar =='S'){
					escreva("Seu crédtio atual é: ",creditoMestradoAtual,". Quantos créditos deseja utilizar:? ")
					leia(creditoMestrado)
					creditoMestradoAtual = creditoMestradoAtual - creditoMestrado
					totalAtual = totalAtual + creditoMestrado
					
				}
			}

			escreva ("\nO restante de créditos é: ",creditoMestradoAtual)
			escreva ("\nO total de pontos é: ",totalAtual) 
		
			}
		}
	}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */