package br.com.senaisp.bauru.richard.licao02;

public class EstudanteTester {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		//Atribuindo os valores via setters
		estudante.setNome("Richard Brosler");
		estudante.setIdade(47);
		estudante.setAltura(1.83);
		estudante.setFumante(false);
		// Usando o outro constructor
		Estudante estud2 = new Estudante("Maria",25,1.80,true);
		//-------
		//Mostrando informações do estudante
		System.out.println("Nome: " + estudante.getNome());
		//Mostrando os dados do objeto
		System.out.println(estudante.toString());
		//Mostrando o estudante 2
		System.out.println();
		System.out.println(estud2.toString());
	}

}
