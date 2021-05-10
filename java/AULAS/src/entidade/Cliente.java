package entidade;

public class Cliente {
	

		
		//atributos
		public String nome;
		public char genero;
		public int anoNascimento;
		public char cartao;
		
		//métodos
		
		public void idade (){
			System.out.printf("\nA idade do cliente %s é: "+(2021 - anoNascimento),nome);
			
		}
		
		public void genero (char genero) {
			if (genero == 'M') {
				System.out.println("\nO cliente se identifica com o gênero masculino");
			}
			else if (genero == 'F') {
				System.out.println("\nA cliente se identifica com o gênero feminino");
			}
			else {
				System.out.println("\nO/A cliente se identifica com o gênero outre");
			}
		}
			
		public void cartao (char cartao) {
			if(cartao == 'S') {
				System.out.println("\nO/A cliente possui cartão");
			}
			else {
				System.out.println("\nO cliente não possui cartão");
			}
		}
	}
		
		
		
		