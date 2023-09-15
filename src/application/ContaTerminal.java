package application;

import java.util.Scanner;

import entities.Conta;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Por favor, informe os dados da conta");
		
		System.out.print("Número: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Agência: ");
		sc.nextLine();
		String agencia = sc.nextLine();
		
		System.out.print("Cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		
		Conta conta = new Conta (numeroConta, agencia, nomeCliente, saldo);
		
		System.out.println();
		
		System.out.println(conta);
		
		sc.close();

	}

}
