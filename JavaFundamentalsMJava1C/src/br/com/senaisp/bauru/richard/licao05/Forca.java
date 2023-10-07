package br.com.senaisp.bauru.richard.licao05;

public class Forca {
	public static final int LIMITE_ERROS = 6;
	private String palavraOculta;
	private String palavraVisivel;
	private int erros;
	private int tentativas;
	
	public Forca(String pPalavra) {
		palavraOculta = pPalavra;
		palavraVisivel = "_".repeat(pPalavra.length());
		erros = 0;
		tentativas = 0;
	}
	
	public String getPalavraOculta() {
		return palavraOculta;
	}
	public String getPalavraVisivel() {
		return palavraVisivel;
	}
	public int getErros() {
		return erros;
	}
	public int getTentativas() {
		return tentativas;
	}
	public boolean isTerminado() {
		return erros>=LIMITE_ERROS || 
			   palavraVisivel.indexOf('_') == -1;
	}
	
	public boolean verificaLetra(char letra) {
		boolean retorno = false;
		tentativas++;
		if ( isTerminado() ) {
			return retorno;
		}
		//Verificando se a palavra existe na palavra oculta
		if (palavraOculta.indexOf(letra)>-1) {
			String apoio="";
			for(int i=0;i<palavraOculta.length();i++) {
				if (palavraOculta.charAt(i)==letra) {
					apoio += letra;//apoio = apoio + letra
				} else {
					apoio += palavraVisivel.charAt(i);
				}//fim do if
			}//fim do for
			palavraVisivel = apoio;
		} else {
			System.out.println("Letra não encontrada!");
			erros++;
		}
		
		return retorno;
	}
	public void mostrarTela() {
		char cab = ( erros >= 1 ? 'O' : ' ' );
		char brE = ( erros >= 2 ? '/' : ' ' );
		char brD = ( erros >= 3 ? '\\' : ' ' );
		char cor = ( erros >= 4 ? '|' : ' ' );
		char peE = ( erros >= 5 ? '\\' : ' ' );
		char peD = ( erros >= 6 ? '/' : ' ' );
		//Montando a tela
		System.out.println("+--+");
		System.out.println("| " + brD + cab + brE);
		System.out.println("|  " + cor);
		System.out.println("| " + peD + " " + peE);
		System.out.println("| ");
		System.out.println("-------------");
		System.out.println(palavraVisivel);
		
	}
}
