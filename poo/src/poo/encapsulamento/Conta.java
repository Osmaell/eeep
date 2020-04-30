package encapsulamento;

public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 *	Método de acesso, responsável
	 *	por retornar o valor do atributo
	 *	saldo para seu respectivo objeto.
	 */
	public double getSaldo() {
		return this.saldo;
	}
	
	/**
	 *	Método de acesso, responsável
	 *	por retornar o valor do atributo
	 *	número, para seu respectivo objeto.
	 */
	public int getNumero() {
		return numero;
	}
	
	/**
	 *	Método de acesso, responsável por
	 *  atribuir/adicionar um novo valor
	 *  ao atributo numero, para seu 
	 *  respectivo objeto.
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	/**
	 *	Método de acesso, responsável
	 *	por retornar o valor do atributo
	 *	agencia, para seu respectivo objeto.
	 */
	public int getAgencia() {
		return this.agencia;
	}
	
	/**
	 *	Método de acesso, responsável por
	 *  atribuir/adicionar um novo valor
	 *  ao atributo agencia, para seu 
	 *  respectivo objeto.
	 */
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	/**
	 *	Método de acesso, responsável
	 *	por retornar o valor do atributo
	 *	titular, para seu respectivo objeto.
	 */
	public String getTitular() {
		return titular;
	}
	
	/**
	 *	Método de acesso, responsável por
	 *  atribuir/adicionar um novo valor
	 *  ao atributo titular, para seu 
	 *  respectivo objeto.
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
