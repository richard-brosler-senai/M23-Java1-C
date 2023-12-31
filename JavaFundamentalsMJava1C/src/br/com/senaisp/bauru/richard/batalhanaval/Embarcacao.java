package br.com.senaisp.bauru.richard.batalhanaval;

public class Embarcacao {
	//campos
	private int tamanho;
	private int dano;
	//constructor
	public Embarcacao(int tam) {
		setTamanho(tam);
	}
	//Métodos/getters e setters
	public int getDano() {
		return dano;
	}
	
	public void addDano(int value) {
		if (dano < tamanho) {
			dano += value;
		}
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public String getNomeEmbarcacao() {
		switch(tamanho) {
			case 4 : return "Porta Aviões";
			case 3 : return "Contra torpedeiro";
			case 2 : return "Submarino";
			default : return "Navio";
		}
	}
	
	public void setTamanho(int value) {
		if (value<1 || value >4) {
			throw new RuntimeException("Valor deve ser entre"
					+ " 1 e 4!");
		}
		tamanho = value;
	}
	
	public boolean isEliminado() {
		return dano >= tamanho;
	}
}
