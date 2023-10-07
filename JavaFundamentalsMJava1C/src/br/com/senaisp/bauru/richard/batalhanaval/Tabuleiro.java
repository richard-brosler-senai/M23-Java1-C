package br.com.senaisp.bauru.richard.batalhanaval;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.senaisp.bauru.richard.projeto.Utils;

public class Tabuleiro {
	private static final char IS_PREENCHIDO = '▓';
	private static final char IS_LIMPO = '░';
	private static final char IS_BOMB = '¤';
	private static final char IS_BOMBOK = '†';
	//Campos
	private Scanner sc;
	private String nomeJogador;
	private boolean[][] tabuleiroAtaque;
	private Embarcacao[][] tabuleiroEmbarcacao;
	private boolean terminado;
	//Constructor
	public Tabuleiro(String nome, Scanner sc) {
		this.sc = sc;
		nomeJogador = nome;
		terminado = false;
		tabuleiroAtaque = new boolean[10][10];
		tabuleiroEmbarcacao = new Embarcacao[10][10];
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				tabuleiroAtaque[lin][col] = false;
				tabuleiroEmbarcacao[lin][col] = null;
			}
		}
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public boolean isTerminado() {
		return terminado;
	}
	//metodos
	public void mostrarTabuleiro(boolean visualizarEmb) {
		                  //1234567890123
		System.out.println("  12345678910");
		for(int lin=0;lin<10;lin++) {
			char let = 'A';
			let += lin;
			System.out.print(""+let+" ");
			for (int col=0;col<10;col++) {
				char ret = IS_LIMPO;
				if (tabuleiroEmbarcacao[lin][col]!=null) {
					if (visualizarEmb){
						ret = IS_PREENCHIDO;
					}
					if (tabuleiroAtaque[lin][col]) {
						ret = IS_BOMBOK;
					}
				} else { //não tem embarcação na posição
					if (tabuleiroAtaque[lin][col]) {
						ret = IS_BOMB;
					}
				}//fim do else
				System.out.print(ret);
			}//fim do for coluna
			System.out.println();
		}//fim do for de linha
	}//fim do método
	
	public void montarTabuleiro() {
		//0 - Porta aviões
		//1, 2 - Contra torpedeiros
		//3, 4, 5 - Submarinos
		//6, 7, 8, 9 - Barcos
		for (int id=0;id<10;id++) {
			Embarcacao emb;
			switch(id) {
			case 0 : //porta aviões
				emb = new Embarcacao(4); break;
				
			case 1 :
			case 2 : //contra-torpedeiros
				emb = new Embarcacao(3); break;
				
			case 3 :
			case 4 :
			case 5 : //submarino
				emb = new Embarcacao(2); break;
				
			default : //barcos
				emb = new Embarcacao(1); break;
			}
			String posicao;
			boolean posOK;
			do {
				//A01:B01
				posicao = Utils.entradaDados(sc, 
						"Digite a posição a ser ocupada:", 
						7, 7, 
						"[A-J](0[1-9]|10):[A-J](0[1-9]|10)",
						false);
				posOK = posicionarEmbarcacao(posicao,emb);
				if (!posOK) {
					System.out.println("Não posso colocar "
							+ "nessa posição!");
				}
			} while(!posOK);
			mostrarTabuleiro(true);
		}
	}
	private boolean posicionarEmbarcacao(String posicao, Embarcacao emb) {
		return false;
	}
	
}//fim da classe
