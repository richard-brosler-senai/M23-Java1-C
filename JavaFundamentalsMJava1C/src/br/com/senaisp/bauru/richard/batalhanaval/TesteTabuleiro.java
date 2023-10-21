package br.com.senaisp.bauru.richard.batalhanaval;

import java.util.Scanner;

public class TesteTabuleiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro("Richard",sc);
		Tabuleiro tabC = new Tabuleiro("Computador", sc);
		//Montagens dos tabuleiros
		tab.montarTabuleiro(true);
		tabC.montarTabuleiro(true);
		//Mostrando tabuleiros
		System.out.println(tab.getNomeJogador());
		tab.mostrarTabuleiro(true);
		
		System.out.println(tabC.getNomeJogador());
		tabC.mostrarTabuleiro(false);
		
		do {
			//Jogador jogando
			System.out.println("Digite a posição de ataque:");
			String posicao = sc.nextLine();
			boolean acertou = tabC.sofrerAtaque(posicao);
			
			System.out.println(tabC.getNomeJogador());
			tabC.mostrarTabuleiro(false);
			if (acertou) continue;
			//Computador jogando
			do {
				//Computador gerou lance aleatório
				posicao = tab.gerarPosicaoAleatoria();
				System.out.println(posicao);
				acertou = tab.sofrerAtaque(posicao);
				
				System.out.println(tab.getNomeJogador());
				tab.mostrarTabuleiro(true);
			}while (acertou && !tab.isTerminado());
			
		}while(!tabC.isTerminado() && !tab.isTerminado());
		
	}

}
