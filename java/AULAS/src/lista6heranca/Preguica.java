package lista6heranca;

public class Preguica extends Animal{
	
	
	public Preguica (String nome, int idade) {
		super(nome, idade);
	}
		
		@Override //sobrecarregamento de m�todos
		
		public void som () {
			System.out.println("Crush Crush Crush (mastigando plantas)");			
			}
		
		
		public void movimento() {
			System.out.println("A pregui�a sobre em �rvores!");
		}
		
}
