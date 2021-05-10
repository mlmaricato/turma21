package principal;

import java.util.Scanner;

import entidade.ProdutoEletronico;

public abstract class tarefa3_produto_eletronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		ProdutoEletronico produto1 = new ProdutoEletronico("Celular", 1000);
		ProdutoEletronico produto2 = new ProdutoEletronico("TV", 2000);
		ProdutoEletronico produto3 = new ProdutoEletronico("Computador", 4000);
		
		System.out.println("O produto eletronico é: "+produto1.tipo);
		System.out.println("O valor do produto é: "+produto1.valor);
		System.out.println("O produto está ligado? (S/N)");
		char estado;
		estado = leia.next().toUpperCase().charAt(0);
		if(estado == 'S') {
			System.out.println("O aparelho está ligado");
		}
		else {
			System.out.println("O aparelho está desligado");
			
		}
		System.out.println();
		System.out.println("O produto eletronico é: "+produto2.tipo);
		System.out.println("O valor do produto é: "+produto2.valor);
		System.out.println("O produto está ligado? (S/N)");
		estado = leia.next().toUpperCase().charAt(0);
		if(estado == 'S') {
			System.out.println("O aparelho está ligado");
		}
		else {
			System.out.println("O aparelho está desligado");
			
		}
		System.out.println();
		System.out.println("O produto eletronico é: "+produto3.tipo);
		System.out.println("O valor do produto é: "+produto3.valor);
		System.out.println("O produto está ligado? (S/N)");
		estado = leia.next().toUpperCase().charAt(0);
		if(estado == 'S') {
			System.out.println("O aparelho está ligado");
		}
		else {
			System.out.println("O aparelho está desligado");
			
		}
		

	}

}
