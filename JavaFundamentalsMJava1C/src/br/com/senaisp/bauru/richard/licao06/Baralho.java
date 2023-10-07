package br.com.senaisp.bauru.richard.licao06;

import java.util.Random;

public class Baralho {
	private Carta[] cartas;
	private boolean[] cartasUsadas;
	
	private Random rnd;
	//constructor
	public Baralho()
	{
		cartas = new Carta[52];
		cartasUsadas = new boolean[cartas.length];
		rnd = new Random();
		//criar as cartas do baralho
		int idx=0;
		for(int np=0;np<Carta.NAIPES.length;np++) {
			for(int nm=0;nm<Carta.NOMES_CARTAS.length;nm++) {
				cartas[idx] = 
						new Carta(Carta.NAIPES[np],
								  Carta.NOMES_CARTAS[nm]);
				cartasUsadas[idx++] = false;
			}
		}
	}
	
	public Carta sortearCarta()
	{
		Carta retorno = null;
		int idx;
		do {
			idx = rnd.nextInt(52);
			//Se a carta não foi utilizada
			if (!cartasUsadas[idx]) {
				retorno = cartas[idx];
				cartasUsadas[idx] = true;
				break;
			}
		}while(cartasUsadas[idx]);
		
		return retorno;
	}
}
