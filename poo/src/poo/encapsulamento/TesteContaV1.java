package encapsulamento;
		
public class TesteContaV1 {
		
	public static void main(String[] args) {
		
		Conta conta = new Conta();	// criando um objeto do tipo Conta
		
		// conta.numero = 823;
		conta.setNumero(22250); 	// adicionando um valor para o atributo numero
		
		// conta.agencia = 200;
		conta.setAgencia(200);		// adicionando um valor para o atributo agencia
		
		// conta.titular = "Bill Gates";
		conta.setTitular("Bill Gates");	// adicionando um valor para o atributo titular
		
		// System.out.println(conta.numero);
		System.out.println(conta.getNumero()); // exibindo o numero da Conta
		
		// System.out.println(conta.agencia);
		System.out.println(conta.getAgencia()); // exibindo a agencia da Conta
		
		// System.out.println(conta.titular);
		System.out.println(conta.getTitular()); // exibindo o titular da Conta
		
	}
	
}