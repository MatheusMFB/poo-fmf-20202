/*
	Disciplina:		Programa��o Orientada a Objetos
	Facilitador:	Orlewilson Bentes Maia
	Data: 			14/10/20
	Aluno:			escreva seu nome
	Descri��o: 		Representa��o de um modelo para Livro usando o conceito de encapsulamento e construtor
	
	https://repl.it/languages/java10

*/

// classe Livro
class Livro {

	// Atributos
	private String editora;
	private String sumario;
	private int numeroPaginas;
	private String tema;
	private String capa;

	// Construtor sem argumento
	public Livro() {
		// primeira forma
//		this.editora = "";
//		this.sumario = "";
//		this.numeroPaginas = 0;
//		this.tema = "";
//		this.capa = "";

		// segunda forma (minha recomenda��o)
		setEditora("");
		setSumario("");
		setNumeroPaginas(0);
		setTema("");
		setCapa("");

	}

	// Construtor com argumento
	public Livro(String editora, String sumario, int numeroPaginas, String tema, String capa) {
		// primeira forma
//		this.editora = editora;
//		this.sumario = sumario;
//		this.numeroPaginas = numeroPaginas;
//		this.tema = tema;
//		this.capa = capa;

		// segunda forma (minha recomenda��o)
		setEditora(editora);
		setSumario(sumario);
		setNumeroPaginas(numeroPaginas);
		setTema(tema);
		setCapa(capa);

	}

	// M�todos
	// ----- m�todos get e set para o atributo editora
	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getEditora() {
		return this.editora;
	}

	// ----- m�todos get e set para o atributo numeroPaginas
	public void setNumeroPaginas(int numeroPaginas) {

		if (numeroPaginas < 0) {
			System.out.println("Informe um valor maior que zero!");
		} else {
			this.numeroPaginas = numeroPaginas;
		}
	}

	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}

	// ----- m�todos get e set para o atributo sumario
	public void setSumario(String sumario) {
		this.sumario = sumario;
	}

	public String getSumario() {
		return this.sumario;
	}

	// ----- m�todos get e set para o atributo tema
	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getTema() {
		return this.tema;
	}

	// ----- m�todos get e set para o atributo capa
	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getCapa() {
		return this.capa;
	}

	// mostrar informa��es informadas em cada atributo
	public void mostrarInformacoesLivro() {
		// primeira forma
//		System.out.println("Editora: " + this.editora);
//		System.out.println("N�mero de P�ginas: " + this.numeroPaginas);
//		System.out.println("Sum�rio: " + this.sumario);
//		System.out.println("Tema: " + this.tema);
//		System.out.println("Capa: " + this.capa);
		
		// segunda forma (minha recomenda��o)
		System.out.println("Editora: " + getEditora());
		System.out.println("N�mero de P�ginas: " + getNumeroPaginas());
		System.out.println("Sum�rio: " + getSumario());
		System.out.println("Tema: " + getTema());
		System.out.println("Capa: " + getCapa());
	}
}
