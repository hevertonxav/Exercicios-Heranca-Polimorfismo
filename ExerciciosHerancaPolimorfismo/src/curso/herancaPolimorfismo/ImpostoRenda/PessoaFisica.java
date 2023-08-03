package curso.herancaPolimorfismo.ImpostoRenda;

import java.text.DecimalFormat;

public class PessoaFisica extends Pessoa {

	public PessoaFisica() {}

	public PessoaFisica(String nome) {
		super(nome);
	}

	DecimalFormat df = new DecimalFormat("####0.00");

	@Override
	public void calcularImposto(String valor) {

		int aliquota;
		double parcelaDeduzir;
		double renda = Double.valueOf(valor);
		System.out.println("Renda bruta: R$ " + df.format(renda));

		if (renda <= 1400) {

			aliquota = 0;
			parcelaDeduzir = 0;

		} else if (renda > 1400 && renda <= 2100) {

			aliquota = 10;
			parcelaDeduzir = 100;

        } else if (renda > 2100 && renda <= 2800) {

			aliquota = 15;
			parcelaDeduzir = 270;

        } else if (renda > 2800 && renda <= 3600) {

			aliquota = 25;
			parcelaDeduzir = 500;
 
        } else {

			aliquota = 30;
			parcelaDeduzir = 700;

        }

		double impostoDevido = (renda * ((double) aliquota / 100)) - parcelaDeduzir;
		
		System.out.println("Imposto à pagar: R$ " + df.format(impostoDevido));
		System.out.println(" ");

	}

	@Override
	public String toString() {

		String info = "Nome do contribuinte: " + getNome();
		return info;

	}

}
