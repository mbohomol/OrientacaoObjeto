package br.com.generation.poo;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria objeto_conta = new ContaBancaria();
		
		objeto_conta.numero_da_agencia = 1234;
		objeto_conta.numero_da_conta = 1234;
		objeto_conta.saldo_da_conta = 10.0;
		
		System.out.println("O número da agência é: " + objeto_conta.numero_da_agencia);
		System.out.println("O número da conta é: " + objeto_conta.numero_da_conta);
		System.out.println("O saldo da conta " + objeto_conta.numero_da_conta +  " é: R$" +objeto_conta.saldo_da_conta);
		

	}

}
