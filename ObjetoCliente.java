package br.com.generation.poo;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente objeto_cliente = new Cliente();
		
		
		objeto_cliente.nome = "Milene";
		objeto_cliente.idade = 19;
		objeto_cliente.profissao = "Desenvolvedora Java";
		
		System.out.println("Nome do cliente: " + objeto_cliente.nome);
		System.out.println("Idade do cliente: " + objeto_cliente.idade);
		System.out.println("Profissão do cliente: " + objeto_cliente.profissao);
		
		objeto_cliente.comprar();
		objeto_cliente.elogiar();
			System.out.println();
	}

}
