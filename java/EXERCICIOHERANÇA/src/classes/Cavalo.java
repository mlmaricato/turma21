package classes;

public class Cavalo extends Animal {
	
	public Cavalo (String nome, int idade) {
		super(nome, idade);

	}
	
	
	@Override //sobrecarregamento de m�todos
	
	public void som () {
		System.out.println("iiiirrrr�");			
		}
	
	public void movimento() {
		System.out.println("O cachorro corre!");
	}
	

}
