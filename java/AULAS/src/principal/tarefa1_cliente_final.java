package principal;

import java.util.Locale;
import java.util.Scanner;

import entidade.Cliente;

public class tarefa1_cliente_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner (System.in);
			Locale.setDefault(Locale.US);
			Cliente cliente = new Cliente(); //instanciou o objeto 
			
			System.out.println("Insira o nome do cliente: ");
			cliente.nome = leia.nextLine();
			System.out.println("Insira o ano de nascimento do cliente:");
			cliente.anoNascimento = leia.nextInt();
			System.out.println("Insira o gênero com o qual o/a cliente se identifica (M/F/O): ");
			cliente.genero = leia.next().toUpperCase().charAt(0);
			System.out.println("O/A cliente possui cartão (S/N)? ");
			cliente.cartao = leia.next().toUpperCase().charAt(0);
			System.out.println();
			System.out.printf("O nome do/da cliente é: %s",cliente.nome);
			
			cliente.idade();
			cliente.genero(cliente.genero);
			cliente.cartao(cliente.cartao);	
	
	}

}
