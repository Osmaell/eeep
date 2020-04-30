package encapsulamento;

public class TesteContaV2 {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(); 	// criando uma classe do tipo Conta.
		conta.deposita(350);		// depositando 100 reais na conta.
		conta.saca(200);			// sacando 200 reais da conta.
		
		System.out.println(conta.getSaldo()); // imprimindo o saldo da conta
		
		// proibido: atributo saldo de conta está "encapsulado" como private.
		// System.out.println(conta.saldo);
		
		// proibido:
		// conta.saldo = conta.saldo - 101;
		// System.out.println(conta.saldo);
		
	}
	
}