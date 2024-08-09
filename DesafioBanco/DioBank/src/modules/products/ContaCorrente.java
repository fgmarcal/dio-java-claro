package modules.products;

import modules.entities.Cliente.Cliente;
import modules.entities.Conta.Conta;

public class ContaCorrente extends Conta {

	private String TIPO_DE_CONTA = "Corrente";

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.printf("=== Extrato Conta %s ===\n", this.TIPO_DE_CONTA);
		super.imprimirExtrato();
	}
	
}
