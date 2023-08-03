package curso.herancaPolimorfismo.ContaBanco;

import java.text.DecimalFormat;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial() {
	   super();
	}

	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {

		DecimalFormat df = new DecimalFormat("####0.00");

		String info = " **** BANCO TABAJARA **** " + "\n";
		info += "  " + "\n";
		info += "---- CONTA ESPECIAL ---- " + "\n";
		info += " " + "\n";
		info += "Cliente:  " + getNomeCliente() + "\n";
		info += "Conta: " + getNumConta() + "\n";
		info += "Saldo conta-corrente: R$ " + df.format(getSaldo()) + "\n";
		info += "Limite especial: R$ " + df.format(getLimite()) + "\n";

		return info;

	}

	void sacar(double valor) {

		if (valor <= getSaldo() + getLimite()) {

			if (valor < getSaldo()) {

				saldo -= valor;
				System.out.printf("O novo saldo da conta-corrente é R$ %.2f %n", saldo);
				System.out.printf("O novo saldo limite é R$ %.2f %n", limite);

			} else {
				
				saldo -= valor;
				limite += saldo;
				System.out.println("O novo saldo da conta-corrente é R$ 0,00");
				System.out.printf("O novo saldo limite é R$ %.2f %n ", limite);
				
			}
			
		} else {

			System.out.println("Saldo insuficiente, pois não há limite especial disponível");

		}
	}

}
