package br.com.senaisp.bauru.richard.licao02;

public class CalculadoraTester {

	public static void main(String[] args) {
	/*
	 * Operações matemáticas padrões
	 * 
	 * + - Soma
	 * - - Subtração
	 * * - Multiplicação
	 * / - Divisão
	 * % - Resto da divisão
	 * 
	 */
	 // Math - Classe para operações matemáticas
     /*
      * Métodos mais conhecidos do Math
      * Math.sqrt - Raiz quadrada
      * Math.pow  - exponenciação. 
      */
	  int a = 5;
	  int b = 8;
	  int c = 3;
	  //como ficaria a fórmula de Delta aqui?
	  double delta = b * b - 4 * a * c;
	       //delta = Math.pow(b, 2) - 4 * a * c;
	  //como ficaria x1 e x2 de baskara?
	  double x1 = ( -b + Math.sqrt(delta) ) / ( 2 * a );
	  double x2 = ( -b - Math.sqrt(delta) ) / ( 2 * a );
	  //mostrando os resultados
	  System.out.println("Delta = " + delta);
	  System.out.println("x1 = " + x1);
	  System.out.println("x2 = " + x2);
	}

}
