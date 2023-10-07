package br.com.senaisp.bauru.richard.projeto;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {
	// restringindo a criação de objeto
	private Utils() {
	}

	//
	public static int entradaDados(Scanner sc, String msg, int min, int max) {
		int retorno = 0;
		// inicializando o valor
		do {
			System.out.println(msg);
			try {
				retorno = sc.nextInt();
				// trantando para mostrar a mensagem de erro
				if (retorno < min || retorno > max) {
					System.out.println("O valor deve ser entre " + min + " e " + max);
				}
			} catch (Exception e) {
				System.out.println("Valor inválido, redigite!");
				sc.nextLine(); // para não ficar travado
				retorno = -1;
			}
		} while (retorno < min || retorno > max);
		// retornando o valor
		return retorno;
	}
	public static String entradaDados(Scanner sc, String msg, int tamMin, int tamMax, String pattern) {
		return entradaDados(sc,msg,tamMin,tamMax,pattern,true);
	}
	public static String entradaDados(Scanner sc, String msg, int tamMin, int tamMax, String pattern, boolean checkBuffer) {
		String retorno = "";
		// esse teste é para pegar o enter a mais que vem do
		// sc.nextInt()
		if (checkBuffer && sc.hasNextLine()) sc.nextLine();
		do {
			System.out.println(msg);
			retorno = sc.nextLine();
			// Teste de tamanho da string
			if (retorno.length() < tamMin || retorno.length() > tamMax) {
				System.out.println(
						"O texto deve ter pelo menos " + tamMin + " caracteres e no máximo " + tamMax + " caracteres!");
			}
			// teste do pattern
			if (!pattern.equals("") && !Pattern.matches(pattern, retorno)) {
				System.out.println("O texto não atende " + "ao padrão informado! Padrão: " + pattern);
			}
			// fim dos testes
		} while (retorno.length() < tamMin || retorno.length() > tamMax ||
		// Se há padrão de texto e não for atendido
				!pattern.equals("") && !Pattern.matches(pattern, retorno));
		return retorno;
	}
	public static double entradaDados(Scanner sc, String msg, 
					double min, double max) {
		double retorno = 0;
		//inicializando o valor
		do {
			System.out.println(msg);
			try {
				retorno = sc.nextDouble();
				//trantando para mostrar a mensagem de erro
				if (retorno < min || retorno > max) {
					System.out.println("O valor deve ser entre " + min + " e " + max);
				}
			} catch (Exception e) {
				System.out.println("Valor inválido, redigite!");
				sc.nextLine(); // para não ficar travado
			}
		} while (retorno < min || retorno > max);
//retornando o valor
		return retorno;
	}
}
