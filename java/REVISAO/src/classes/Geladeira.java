package classes;

public class Geladeira extends Eletrodomestico {
	

	private String tipo;

	public Geladeira(String marca, int voltagem, double peso, String tipo) {
		super(marca, voltagem, peso);
		this.tipo = tipo;
	}

	@Override
	public void ligar() {
	System.out.println("Ligar na tomada");
	}

	

}
