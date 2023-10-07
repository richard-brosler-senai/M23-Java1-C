package br.com.senaisp.bauru.richard.licao03;

import java.util.Scanner;

public class TesteInversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor a ser "
							+ "invertido:");
		int valor = sc.nextInt();
		//Aqui faremos a conta
		//CDU
		//123 => 321 Divisão(/), Multiplicação(*),
		//           Resto (%) e Soma(+)
		int c = valor / 100;
		int d = valor % 100 / 10;
		int u = valor % 10;
		
		int valorInvertido = u * 100 + d * 10 + c;
		System.out.println("Valor invertido é " 
					+ valorInvertido);
		sc.close();
	}

}
