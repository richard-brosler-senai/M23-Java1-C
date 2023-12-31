package br.com.senaisp.bauru.richard.projeto;

import java.util.Scanner;

import br.com.senaisp.bauru.richard.licao06.Carta;

public class TesteInventario {

	public static void main(String[] args) {
		Produto[] inventario = new Produto[5]; //5 produtos
		Scanner sc = new Scanner(System.in);
		//Cadastrando produtos...
		for (int i=0;i<inventario.length;i++) {
			System.out.println("Produto " + (i + 1));
			
			//System.out.println("Digite o id:");
			//int id = sc.nextInt();
			int id = Utils.entradaDados(sc,"Digite o id",1,99_999);

			//sc.nextLine(); //para capturar o enter do nextInt
			//System.out.println("Digite o nome:");
			//String nome = sc.nextLine();
			String nome = Utils.entradaDados(sc, "Digite o nome:", 
											 2, 60, "");
			
			//System.out.println("Digite o saldo:");
			//int saldo = sc.nextInt();
			int saldo = Utils.entradaDados(sc, "Digite o Saldo", 0, 
											999_999);
			
			//System.out.println("Digite o preço:");
			//double preco = sc.nextDouble();
			double preco = Utils.entradaDados(sc, "Digite o preço",
											  1.0, 999_999_999.99);
			
			//sc.nextLine(); //para capturar o enter do nextDouble
			//System.out.println("Produto ativo? (S/N)");
			//char cAtivo = sc.next().charAt(0);
			char cAtivo = Utils.entradaDados(
					       sc, 
					       "Produto ativo? (S/N)", 
					       1, 
					       1,
					       "^[S|s|N|n]$")
						   .charAt(0);
			
			boolean ativo = cAtivo != 'N';
			
			inventario[i] = new Produto(id, nome, saldo, preco, ativo);
		} //Término da entrada de dados
		
		int opc = 0;
		do {
			System.out.println("Menu");
			System.out.println("1 - Consultar produto");
			System.out.println("2 - Alterar produto");
			System.out.println("9 - Fim");
			opc = Utils.entradaDados(sc, "Digite sua opção", 1, 9);
			if (opc != 9) {
				
				int id = Utils.entradaDados(sc, 
						"Digite o id do produto:", 1, 99_999);
				int idx = pesquisarProduto(inventario,id);
				
				switch(opc) {
				case 1:
					if (idx>-1) {
						System.out.println(inventario[idx].toString());
					} else {
						System.out.println("Produto não encontrado!");
					}
					System.out.println("Digite um enter para continuar");
					sc.nextLine();
					break;
				case 2:
					inventario[idx].setSaldo(
									Utils.entradaDados(sc, 
											"Digite o Saldo", 
											0, 
											999_999)
											);
					
					inventario[idx].setPreco(
									Utils.entradaDados(sc, 
											"Digite o preço",
											1.0, 
											999_999_999.99)
											);
					char cAtivo = Utils.entradaDados(
						       sc, 
						       "Produto ativo? (S/N)", 
						       1, 
						       1,
						       "^[S|s|N|n]$")
							   .charAt(0);
					inventario[idx].setAtivo(cAtivo != 'N' && cAtivo != 'n');
					System.out.println("Digite um enter para continuar");
					sc.nextLine();
				}
			}
		} while (opc != 9);
	}//fim do main

	public static int pesquisarProduto(Produto[] inventario, 
										int id) {
		int retorno = -1;
		//percorrendo o vetor para encontrar o produto
		for (int i=0;i<inventario.length;i++) {
			if (inventario[i].getId()==id) {
				retorno = i;
				break; //para sair do for
			}
		}
		return retorno;
	}
}//fim da classe
