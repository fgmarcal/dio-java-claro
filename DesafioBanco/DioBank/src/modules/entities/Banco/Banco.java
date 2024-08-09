package modules.entities.Banco;

import lombok.Data;
import modules.entities.Cliente.Cliente;
import modules.entities.Conta.Conta;
import modules.products.ContaCorrente;
import modules.products.ContaPoupanca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

@Data
public class Banco {

	private String nome = "MyBank";
	private Map<Cliente, Conta> contas;
	private List<Cliente> clientes;

	public Banco() {
		this.contas = new HashMap<>();
		this.clientes = new ArrayList<>();
	}

	public void cadastrarCliente(String nomeCliente){
		clientes.add(new Cliente(nomeCliente));
	}

	public Cliente findCliente(String nomeCliente){
		return clientes.stream()
				.filter(c -> c.getNome().equals(nomeCliente))
				.findFirst()
				.orElseThrow();
	}

	public void abrirContaCorrente(Cliente cliente){
		this.contas.put(cliente, new ContaCorrente(cliente));
	}

	public void abrirContaPoupanca(Cliente cliente){
		this.contas.put(cliente, new ContaCorrente(cliente));
	}

	public List<Conta> findContaCorrenteByCliente(Cliente cliente){
		List<Conta> contasCorrente = new ArrayList<>();
		for(Conta conta : this.contas.values()){
			if(conta.getCliente().equals(cliente)){
				contasCorrente.add(contas.get(cliente));
			}
		}
		return contasCorrente;
	}


}
