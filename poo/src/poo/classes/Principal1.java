package poo.classes;

/**
 * Criando uma classe com o nome Principal1.
 * 
 * Essa classe é responsável por criar um objeto
 * da classe Pessoa.
 *
 */
public class Principal1 {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(); 	// criando um objeto do tipo "Pessoa" com o nome de "p1"
		
		p1.nome = "Bill Gates"; 	// atribuindo um valor ao atributo nome, ou seja, adicionando um nome ao objeto p1.
		p1.idade = 64;				// atribuindo um valor ao atributo idade, ou seja, adicionando uma idade ao objeto p1.
		p1.sexo = "Masculino";		// atribuindo um valor ao atributo sexo, ou seja, adicionando um sexo ao objeto p1.
		p1.altura = 1.80;			// atribuindo um valor ao atributo altura, ou seja, adicionando uma altura ao objeto p1.
		p1.peso = 85;				// atribuindo um valor ao atributo peso, ou seja, adicionando um peso ao objeto p1.
		
		p1.andar();					// chamando o método andar do objeto p1.
		p1.falar();					// chamando o método falar do objeto p1.
		
	}
	
}
