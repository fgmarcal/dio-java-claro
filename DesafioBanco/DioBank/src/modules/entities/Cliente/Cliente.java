package modules.entities.Cliente;

import lombok.Data;

@Data
public class Cliente {

	private static int id;
	private String nome;

	public Cliente(String nome){
		this.nome = nome;
		this.id = ++Cliente.id;
	}
}
