package entities;

public class Conta {
	
	private Integer numeroConta;
	private String agencia;
	private String nomeCliente;
	private Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String agencia, String nomeCliente, Double saldo) {
		this.numeroConta = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numeroConta;
	}

	public void setNumero(Integer numero) {
		this.numeroConta = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + numeroConta + " e seu saldo " + saldo +
				" já está disponível para saque";
	}
		

}
