package poo.classes;

/**
 * Criando uma classe com o nome Principal4.
 * 
 * Essa classe é responsável por criar objetos
 * da classe Escola.
 *
 */
public class Principal4 {
	
	public static void main(String[] args) {
		
		Escola escola1 = new Escola();	// criando um objeto do tipo "Escola" com o nome de "escola1"
		
		escola1.codigo = 1020;	// atribuindo um valor ao atributo codigo, ou seja, adicionando um codigo ao objeto escola1.
		escola1.nome = "EEEP Gerardo José Dias de Loiola"; // atribuindo um valor ao atributo nome, ou seja, adicionando um nome ao objeto escola1.
		escola1.localizacao = "Urbana";	// atribuindo um valor ao atributo localizacao, ou seja, adicionando uma localizacao ao objeto escola1.
		
		Escola escola2 = new Escola();	// criando um objeto do tipo "Escola" com o nome de "escola2"
		
		escola2.codigo = 1030;	// atribuindo um valor ao atributo codigo, ou seja, adicionando um codigo ao objeto escola2.
		escola2.nome = "Vicente Reis Cavalcante"; // atribuindo um valor ao atributo nome, ou seja, adicionando um nome ao objeto escola2.
		escola2.localizacao = "Rural";	// atribuindo um valor ao atributo localizacao, ou seja, adicionando uma localizacao ao objeto escola2.
		
		escola1.paralizar(); // chamando o método paralizar do objeto escola1.
		escola2.paralizar(); // chamando o método paralizar do objeto escola2.
		
	}
	
}
