package br.com.senaisp.bauru.richard.licao06;

public class Carta {
	//constantes para uso
	public static final String[] NAIPES = { "Ouros", "Espadas",
			                                "Paus", "Copas"  };
	public static final String[] IMAGENS = {"♦","♠","♣","♥"};
	public static final String[] NOMES_CARTAS = 
								{"A","2","3","4","5","6",
								 "7","8","9","10","Q","J","K"};
	//campos da classe
	private String naipe;
	private String numero;
	//constructor
	public Carta(String np, String nm) {
		setNaipe(np);
		setNumero(nm);
	}
	public String getNaipe() {
		return naipe;
	}
	public void setNaipe(String naipe) {
		if (buscaValor(NAIPES, naipe)==-1) {
			System.out.println("Naipe Inválido!");
		} else {
			this.naipe = naipe;
		}
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if (buscaValor(NOMES_CARTAS, numero)==-1) {
			System.out.println("Número inválido!");
		} else {
			this.numero = numero;
		}
	}
	
	private int buscaValor(String[] vetor, String valorAP) {
		int retorno = -1;
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i].equalsIgnoreCase(valorAP)) {
				retorno=i;
				break;
			}
		}
		return retorno;
	}
	
	public String imagemCarta()
	{               //1234567  
		String img = "+-----+\n"+
	                 "|##   |\n"+
				     "|  $  |\n"+
	                 "|   ##|\n"+
				     "+-----+";
		//encontrando o índice do nome do naipe
		int indiceImg = buscaValor(NAIPES, naipe);
		//usando o indice do naipe para pegar a imagem do naipe
		String imgNP = IMAGENS[indiceImg];
		
		img = img.replaceFirst("##", 
				( numero.equals("10") ? numero : numero + " ") );
		//substituindo o $ pela imagem do naipe
		img = img.replaceAll("\\$", imgNP);
	
		img = img.replaceFirst("##", 
				( numero.equals("10") ? numero : " " + numero) );
		
		return img;
	}
	
	public int getValorCarta()
	{
		int retorno = buscaValor(NOMES_CARTAS, numero) + 1;
		return retorno > 10 ? 10 : retorno;
	}
	
}
