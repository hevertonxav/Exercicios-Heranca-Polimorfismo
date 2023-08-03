package curso.herancaPolimorfismo.ImpostoRenda;

import java.text.DecimalFormat;

public class PessoaJuridica extends Pessoa {

	public PessoaJuridica() {}
	
	public PessoaJuridica(String nome) {
		super(nome);
	}


	DecimalFormat df = new DecimalFormat("####0.00");

	@Override
	public void calcularImposto(String valor) {

		double renda = Double.valueOf(valor);
		System.out.println("Renda bruta: R$ " + df.format(renda));
		double impostoDevido = renda * (0.1);
		System.out.println("Imposto à pagar: R$ " + df.format(impostoDevido));
		System.out.println(" ");

	}

	@Override
	public String toString() {

		String info = "Nome do contribuinte: " + getNome();
		return info;

	}

}
