import modules.entities.Banco.Banco;
import modules.entities.Cliente.Cliente;

public class Main {

	public static void main(String[] args) {

		Banco banco = new Banco();

		banco.cadastrarCliente("Felipe Garcia");
		Cliente cliente = banco.findCliente("Felipe Garcia");

		banco.abrirContaCorrente(cliente);

		var contas = banco.findContaCorrenteByCliente(cliente);
		System.out.println(contas);


	}

}
