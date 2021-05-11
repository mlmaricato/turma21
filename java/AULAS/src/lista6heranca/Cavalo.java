package lista6heranca;

public final class Cavalo extends Animal {
	
	public Cavalo (String nome, int idade) {
		super(nome, idade);

	}
	
	
	@Override //sobrecarregamento de métodos
	
	public void som () {
		System.out.println("Relinchando..");			
		}
	
	public void movimento() {
		System.out.println("O cachorro corre!");
	}
	

}
