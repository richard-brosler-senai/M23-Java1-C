package br.com.senaisp.bauru.richard.projeto;

public class Produto {
	//Campos
	private int id;
	private String nome;
	private int saldo;
	private double preco;
	private boolean ativo;
	//Constructor
	public Produto(int pId, String pNome, 
			int pSaldo, double pPreco, boolean pAtivo) {
		id = pId;
		nome = pNome;
		saldo = pSaldo;
		preco = pPreco;
		ativo = pAtivo;
	}
	//Métodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Id: " + id + "\n"+
			   "Nome: " + nome + "\n"+
			   "Saldo: " + saldo + "\n"+
			   "Preço: " + preco + "\n"+
			   "Ativo: " + ( ativo ? "Sim" : "Não") + "\n";
	}
}
