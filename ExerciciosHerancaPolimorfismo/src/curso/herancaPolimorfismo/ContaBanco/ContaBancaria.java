package curso.herancaPolimorfismo.ContaBanco;

import java.text.DecimalFormat;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	protected double saldo;
	
	public ContaBancaria() { }
	

	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	
	}

	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public  double sacar() {
		
		return saldo;
	}

	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("####0.00");

		String info = " **** BANCO TABAJARA **** " + "\n";
		       info += "  " + "\n";
		       info += "---- CONTA BANCÁRIA ---- " + "\n";
		       info += " " + "\n";
		       info += "Cliente:  " + getNomeCliente() + "\n";
		       info += "Conta: " + getNumConta() + "\n";
		       info += "Saldo: R$ " + df.format(getSaldo()) + "\n";
               
		       return info;
		       
	}
	
	
	void depositar(double valor) {
		
		saldo += valor;
		System.out.printf("O novo saldo é R$ %.2f %n ", saldo);
		
	}
	
	void sacar(double valor) {
		
		if(valor < getSaldo()) {
		
			saldo -= valor;
	        System.out.printf("O novo saldo é R$ %.2f %n ", saldo);
		
		} else { 
			
	        System.out.println("Saque não realizado pois o valor é maior do que o saldo");

	    }
	}

	
	
	
	



}
