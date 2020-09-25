/*
	Disciplina:		Programa��o Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			23/09/20
	Aluno:			escreva seu nome
	Descri��o: 		Cria��o de objetos a partir da classe Livro usando os conceitos de encapsulamento
	
	https://repl.it/languages/java10

*/
class Main {
	public static void main(String[] args) {
		
		// instanciar um Objetos
		Livro pequenoPrincipe = new Livro();

		// povoar os atributos (informar valores a cada atributo)
		// sem encapsulamento
//		pequenoPrincipe.editora = "Saraiva";
//		pequenoPrincipe.sumario = "introdu��o, cap�tulo 1...";
//		pequenoPrincipe.numeroPaginas = 200;
//		pequenoPrincipe.tema = "filosofia";
//		pequenoPrincipe.capa = "desenho";

		// com encapsulamento
		pequenoPrincipe.setEditora("Saraiva");
		pequenoPrincipe.setNumeroPaginas(200);
		

		// mostrar os valores dos atributos (recuperar valores de cada atributo
		// sem encapsulamento
//		System.out.println("Editora: " + pequenoPrincipe.editora);
//		System.out.println("Sum�rio: " + pequenoPrincipe.sumario);
//		System.out.println("N�mero de P�ginas: " + pequenoPrincipe.numeroPaginas);
//		System.out.println("Tema: " + pequenoPrincipe.tema);
//		System.out.println("Capa: " + pequenoPrincipe.capa);

		// com encapsulamento
		System.out.println("Editora: " + pequenoPrincipe.getEditora());
		System.out.println("N�mero de P�ginas: " + pequenoPrincipe.getNumeroPaginas());
	}
}