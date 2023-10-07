package br.com.senaisp.bauru.richard.licao02;
/**
 * Classe que irá controlar o Estudante
 * @author Richard Brosler
 * @version 2023-08-23
 *
 */
public class Estudante {
	//Campos de instância (fields)
	private String nome;
	private int idade;
	private double altura;
	private boolean fumante;
	// constante
	private static final int QTDE_BIMESTRE = 4;
	//Construtores (constructs)
	public Estudante() {
		nome = "sem nome";
		idade = 1;
		altura = 1.00;
		fumante = false;
	}
	
	public Estudante(String nome, int pIdade, 
					double altura, boolean pFumante )
	{
		this.nome = nome;
		idade = pIdade;
		this.altura = altura;
		fumante = pFumante;
	}
	//métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + 
			   "\nAltura: " + altura + 
			   "\nIdade: " + idade +
			   "\nFumante: " + fumante;
	}
}
