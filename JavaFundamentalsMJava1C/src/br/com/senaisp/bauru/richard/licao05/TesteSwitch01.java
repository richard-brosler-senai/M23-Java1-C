package br.com.senaisp.bauru.richard.licao05;

import java.util.Scanner;

public class TesteSwitch01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto itens você vendeu?(máximo 6,minimo 0)");
		int qtde = sc.nextInt();
		switch(qtde) 
		{
		case 6 -> {
			System.out.println("Você ganhou R$ 10.000,00"); 
			System.out.println("Que legal!!!");
		}
		case 5 -> 
			System.out.println("Você ganhou um IPhone"); 
		case 4 -> 
			System.out.println("Você ganhou um Samsung A5"); 
		case 3 ->
			System.out.println("Você ganhou um micro-ondas");
		case 2 -> 
			System.out.println("Você ganhou um liquidificador"); 
		case 1 ->
			System.out.println("Você ganhou uma frigideira");
		default ->
			System.out.println("Infelizmente você "
					+ "não ganhou nada!");
		}
	}

}
