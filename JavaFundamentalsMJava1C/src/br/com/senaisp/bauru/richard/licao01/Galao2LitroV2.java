package br.com.senaisp.bauru.richard.licao01;

import java.util.Locale;
import java.util.Scanner;

public class Galao2LitroV2 {
	public static void main(String[] args) {
		//useLocale fará com que a entrada de dados 
		//seja . e não , no caso de decimal
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		//Inicializando as variáveis que irei utilizar
		double qtdeGaloes = 0.00;
		double fatorLitros = 3.785;
		double litros = 0.00;
		//Iniciando o código
		System.out.println("Programa de conversão "
				+ "de galões para litros\n");
		System.out.println("Digite a quantidade "
				+ "de galões a converter:");
		qtdeGaloes = sc.nextDouble();
		//calculando os litros
		litros = qtdeGaloes * fatorLitros;
		//mostrando o resultado
		System.out.println("Quantidade de litros: " + litros);
		//terminando
		sc.close();
	}
}
