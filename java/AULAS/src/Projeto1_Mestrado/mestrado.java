package Projeto1_Mestrado;

import java.util.Scanner;

public class mestrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		int codigo = 0;
		int matricula = 0;
		String cpf;
		double pontos [] = new double [10];
		char continuar;
		double totalAtual = 0.0;
		char movimento;
		double creditoMestrado = 0.0;
		double creditoMestradoAtual = 10.0;
		int x = 0;
		
		//saida
		System.out.println("ESCOLA SND");
		System.out.println("SLOGAN");
		System.out.println();
		System.out.println("1-BÁSICO");
		System.out.println("2-MÉDIO");
		System.out.println("3-GRADUAÇÃO");
		System.out.println("4-PÓS");
		System.out.println("5-MESTRADO");
		System.out.println("6-SAIR");

		System.out.println("DIGITE O CÓDIGO DA OPERAÇÃO: ");
		codigo = leia.nextInt();
		
		if(codigo==5) {
			
			System.out.println("Universidade de Tecnologia");
			System.out.println("SEU DESENVOLVIMENTO COMEÇA AQUI!\n");
			System.out.println();
			System.out.println("MESTRADO\n");
			System.out.println();
			
			System.out.println("Matrícula: ");
			matricula = leia.nextInt();
			System.out.println("CPF: ");
			cpf = leia.next();
			System.out.println();
			

			do {
				System.out.printf ("O total de pontos atual é: %.2f ",totalAtual);

				if(x==0){ //Primeira nota - primeiro espaço
					System.out.println ("Digite sua nota: ");
					pontos[x] = leia.nextInt();
					totalAtual = totalAtual + pontos [x];
				}

				else{
					System.out.println("MOVIMENTOS: I para incluir nota ou R para retirada nota: ");
					movimento = leia.next().toUpperCase().charAt(0);
					System.out.println("\nDigite a nota que deseja incluir ou excluir: ");
					pontos[x] = leia.nextInt();	
					
					if(pontos [x] >0){ //nota for maior que 0
						if(movimento=='I'){ //para incluir nota
							totalAtual = pontos[x] + totalAtual;
						}
						else { //para excluir nota
							totalAtual = totalAtual - pontos[x];
						}
					}
						else {
							System.out.println ("Digite um valor válido(positivo): ");
						pontos[x] = leia.nextInt();
						}
						if(movimento=='I'){ //para incluir nota
							totalAtual = pontos[x] + totalAtual;
						}
						else{ //para excluir nota
							totalAtual = totalAtual - pontos[x];
						}
					}
				
				if(creditoMestradoAtual>0){
					System.out.println("Gostaria de solicitar o uso de seu credito: (S/N): ");
					continuar = leia.next().toUpperCase().charAt(0);
					if(continuar =='S'){
						System.out.printf("Seu crédtio atual é: %.2f. Quantos créditos deseja utilizar:? ",creditoMestradoAtual);
						creditoMestrado = leia.nextDouble();
						creditoMestradoAtual = creditoMestradoAtual - creditoMestrado;
						totalAtual = totalAtual + creditoMestrado;
						
					}
				}
				else {
					System.out.println("\nSeus créditos acabaram");
				}
				x++;
				System.out.println("Continuar S/N?: ");
				continuar = leia.next().toUpperCase().charAt(0);
				
				}while (x<10 && continuar!='N');
				System.out.println("\nFim dos Movimentos!");
				
				
				if(creditoMestrado>0){
					System.out.println("Gostaria de solicitar o uso de seu credito: (S/N): ");
					continuar = leia.next().toUpperCase().charAt(0);
					if(continuar =='S'){
						System.out.printf("Seu crédtio atual é: %.2f. Quantos créditos deseja utilizar:? ",creditoMestradoAtual);
						creditoMestrado = leia.nextDouble();
						creditoMestradoAtual = creditoMestradoAtual - creditoMestrado;
						totalAtual = totalAtual + creditoMestrado;
				
			}
		}
		
				System.out.printf("\nO restante de créditos é: %.2f ",creditoMestradoAtual);
				System.out.printf("\nO total de pontos é: %.2f",totalAtual); 
			
				}
			}
		}
		
		
			
			
			
		
		
		
		
	
		
	