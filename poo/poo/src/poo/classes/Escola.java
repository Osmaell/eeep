package poo.classes;

/**
 * Criando uma classe com o nome Escola.
 *
 */
public class Escola {

	int codigo; 		// criando uma variável do tipo int com o nome "codigo"
	String nome;		// criando uma variável do tipo String com o nome "nome"
	String localizacao;	// criando uma variável do tipo String com o nome "localizacao"
	
	/*
	 * Criando um método com o nome "funcionar" e
	 * seu tipo de retorno é "void", ou seja,
	 * não retorna nada, apenas executa a ação.
	 * 
	 * A ação a ser executada por esse método é
	 * imprimir o nome da escola seguido da palavra
	 * "funcionado...".
	 * 
	 */
	void funcionar() {
		System.out.println(nome + " funcionando...");
	}

	/*
	 * Criando um método com o nome "paralizar" e
	 * seu tipo de retorno é "void", ou seja,
	 * não retorna nada, apenas executa a ação.
	 * 
	 * A ação a ser executada por esse método é
	 * imprimir o nome da escola seguido da palavra
	 * "paralizada!".
	 * 
	 */
	void paralizar() {
		System.out.println(nome + " paralizada!");
	}
	
}
