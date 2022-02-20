package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		
		gato.setNome("Mingau");
		gato.setCor("Branco");
		gato.setIdade(1);

		System.out.println(gato);
		System.out.println(livro);
		
	}
}

class Livro {
	private String nome;
	private String npag;
}
