package poo.classes;

/**
 * Criando uma classe com o nome Turma.
 *
 */
public class Turma {
	
	String nome;			// criando uma variável do tipo String com o nome "nome"
	String serie;			// criando uma variável do tipo String com o nome "serie"
	String turno;			// criando uma variável do tipo String com o nome "turno"
	int quantidadeAlunos;	// criando uma variável do tipo int com o nome "quantidadeAlunos"
	float mediaFrequencia; 	// criando uma variável do tipo float com o nome "mediaFrequencia"
	
	/*
	 * Criando um método com o nome "frequencia" e
	 * seu tipo de retorno é "float", ou seja,
	 * ele retorna a média da frequência.
	 * 
	 */
	float frequencia() {
		return mediaFrequencia;
	}
	
}