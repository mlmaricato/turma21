package lista6heranca;

public class CachorroCaseiro extends Cachorro {
	
	//atributo
	private String porte;
	private char pelagem; //M - Muito P - pouco
	
	//construtor
	
	public CachorroCaseiro(String nome, int idade, String porte, char pelagem) {
		super(nome, idade);
		this.porte = porte;
		this.pelagem = pelagem;
	} 
	
	public void som () {
		System.out.println("Ruf Ruf Ruf");			
		}
}
