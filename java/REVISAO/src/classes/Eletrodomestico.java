package classes;

import jdk.internal.misc.FileSystemOption;

public abstract class Eletrodomestico {
	private String marca;
	private int voltagem;
	private double peso;
	
	
	public Eletrodomestico(String marca, int voltagem, double peso) {
		super();
		this.marca = marca;
		this.voltagem = voltagem;
		this.peso = peso;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	

	public void ligar() {
	System.out.println("Ligado");
	}
	


	}


