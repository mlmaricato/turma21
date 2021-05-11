package lista6heranca;

public class Cachorro extends Animal {

	
	//atributos
	
	
	//construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
		
	
	//metodo
	
	@Override //sobrecarregamento de métodos
	
	public void som () {
		System.out.println("Au Au Au");			
		}
	
	
	public void movimento() {
		System.out.println("O cachorro corre!");
	}
	

}
