package br.com.senaisp.bauru.richard.licao06;

import java.util.Scanner;

public class TesteBaralho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Baralho ba = new Baralho();
		Carta ct = ba.sortearCarta();

		int total = ct.getValorCarta();
		char continua;
		System.out.println(ct.imagemCarta());
		do {
			ct = ba.sortearCarta();
			total += ct.getValorCarta();
			System.out.println(ct.imagemCarta());
			System.out.println("Total de cartas: " + total);
			
			System.out.println("Continua? (S/N)");
			continua = sc.next().charAt(0);
		}while( continua=='S' );
	}

}
