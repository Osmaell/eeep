package poo.classes;

/**
 * Criando uma classe com o nome Principal2.
 * 
 * Essa classe é responsável por criar objetos
 * da classe Pessoa.
 *
 */
public class Principal2 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(); 	// criando um objeto do tipo "Pessoa" com o nome de "p1"
		
		p1.nome = "Bill Gates"; 	// atribuindo um valor ao atributo nome, ou seja, adicionando um nome ao objeto p1.
		p1.idade = 64;				// atribuindo um valor ao atributo idade, ou seja, adicionando uma idade ao objeto p1.
		p1.sexo = "Masculino";		// atribuindo um valor ao atributo sexo, ou seja, adicionando um sexo ao objeto p1.
		p1.altura = 1.80;			// atribuindo um valor ao atributo altura, ou seja, adicionando uma altura ao objeto p1.
		p1.peso = 85;				// atribuindo um valor ao atributo peso, ou seja, adicionando um peso ao objeto p1.

		Pessoa p2 = new Pessoa(); 		// criando um objeto do tipo "Pessoa" com o nome de "p1"
		
		p2.nome = "Joaquim Barbosa"; 	// atribuindo um valor ao atributo nome, ou seja, adicionando um nome ao objeto p2.
		p2.idade = 65;					// atribuindo um valor ao atributo idade, ou seja, adicionando uma idade ao objeto p2.
		p2.sexo = "Masculino";			// atribuindo um valor ao atributo sexo, ou seja, adicionando um sexo ao objeto p2.
		p2.altura = 1.60;				// atribuindo um valor ao atributo altura, ou seja, adicionando uma altura ao objeto p2.
		p2.peso = 92;					// atribuindo um valor ao atributo peso, ou seja, adicionando um peso ao objeto p2.
		
		p1.andar();	// chamando o método andar do objeto p1.
		p1.falar();	// chamando o método falar do objeto p1.
		
		p2.correr(); // chamando o método correr do objeto p2.
		p2.falar();  // chamando o método falar do objeto p2.
		
	}
	
}
