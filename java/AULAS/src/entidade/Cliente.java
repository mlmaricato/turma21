package entidade;

public class Cliente {
	

		
		//atributos
		public String nome;
		public char genero;
		public int anoNascimento;
		public char cartao;
		
		//m�todos
		
		public void idade (){
			System.out.printf("\nA idade do cliente %s �: "+(2021 - anoNascimento),nome);
			
		}
		
		public void genero (char genero) {
			if (genero == 'M') {
				System.out.println("\nO cliente se identifica com o g�nero masculino");
			}
			else if (genero == 'F') {
				System.out.println("\nA cliente se identifica com o g�nero feminino");
			}
			else {
				System.out.println("\nO/A cliente se identifica com o g�nero outre");
			}
		}
			
		public void cartao (char cartao) {
			if(cartao == 'S') {
				System.out.println("\nO/A cliente possui cart�o");
			}
			else {
				System.out.println("\nO cliente n�o possui cart�o");
			}
		}
	}
		
		
		
		