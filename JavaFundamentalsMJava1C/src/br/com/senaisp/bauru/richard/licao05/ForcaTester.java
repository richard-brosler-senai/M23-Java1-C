package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class ForcaTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Forca fo = new Forca("JAVA");
		char letra;
		do {
			fo.mostrarTela();
			System.out.println("Digite a letra:");
			letra = sc.next().charAt(0);
			
			fo.verificaLetra(letra);
		}while(!fo.isTerminado());
		fo.mostrarTela();
		if (fo.getErros()<Forca.LIMITE_ERROS) {
			System.out.println("Parabéns, você venceu!");
		} else {
			System.out.println("Que pena, você erro!");
		}
		sc.close();
	}

}
