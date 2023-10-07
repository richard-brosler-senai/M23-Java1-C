package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesteSeparadorSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite nomes de frutas"
				+ " separadas por vírgula:");
		String frutas = sc.nextLine();
		//Nesse scanner iremos usar a string como
		//entrada de dados
		Scanner cap = new Scanner(frutas);
		cap.useDelimiter(",");
		while (cap.hasNext()) {
			System.out.println(cap.next());
		}
		
		cap.close();
		sc.close();
	}

}
