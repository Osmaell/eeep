package poo.classes;

/**
 * Criando uma classe com o nome Principal3.
 * 
 * Essa classe é responsável por criar um objeto
 * da classe Escola.
 *
 */
public class Principal3 {
	
	public static void main(String[] args) {
		
		Escola e1 = new Escola();	// criando um objeto do tipo "Escola" com o nome de "e1"
		
		e1.codigo = 1020;	// atribuindo um valor ao atributo codigo, ou seja, adicionando um codigo ao objeto e1.
		e1.nome = "EEEP Gerardo José Dias de Loiola"; // atribuindo um valor ao atributo nome, ou seja, adicionando um nome ao objeto e1.
		e1.localizacao = "Urbana";	// atribuindo um valor ao atributo localizacao, ou seja, adicionando uma localizacao ao objeto e1.
		
		e1.funcionar(); // chamando o método funcionar do objeto e1.
	}
	
}
