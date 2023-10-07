package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo:");
		String nome = sc.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		sc.nextLine(); //só para capturar o enter do inteiro
		
		System.out.println("Digite sua cidade:");
		String cidade = sc.nextLine();
		System.out.println("Olá, "+ nome + 
				" você nasceu em " + cidade);
		
		sc.close();
	}

}
