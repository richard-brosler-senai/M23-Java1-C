package br.com.senaisp.bauru.richard.licao04;

public class TrabalhandoComString {

	public static void main(String[] args) {
		String nome1 = "Richard";
		String nome2 = "Richard";
		//String nome2 = new String("Richard");
		
		if (nome1 == nome2) {
			System.out.println("São endereços iguais");
		} else {
			System.out.println("São endereços diferentes");
		}
		
		if (nome1.equals(nome2)) {
			System.out.println("São conteúdos iguais");
		} else {
			System.out.println("São conteúdos diferentes");
		}
	}

}
