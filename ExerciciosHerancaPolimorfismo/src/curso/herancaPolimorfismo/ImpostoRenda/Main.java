/*
A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte
possui nome.

Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.

Os contribuintes podem ser:

 -Pessoa Jurídica: o imposto corresponde a 10% da renda bruta da empresa.
 
 -Pessoa Física:
      
      Renda Bruta    Alíquota   Parcela a deduzir
       0 a 1400         0%          R$ 0
     1400,01 a 2100    10%          R$ 100
     2100,01 a 2800    15%          R$ 270
     2800,01 a 3600    25%          R$ 500
     3600,01 ou mais   30%          R$ 700

Escreva um programa para calcular e imprimir na tela o imposto a ser pago de 6
contribuintes, sendo 3 PJ e 3 PF.
*/

package curso.herancaPolimorfismo.ImpostoRenda;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String valor;

		JOptionPane.showMessageDialog(null, "ENTRE COM OS DADOS DAS PESSOAS JURÍDICAS! ");

		System.out.println("-----PESSOAS JURÍDICAS----");
		System.out.println(" ");

		for (int i = 0; i < 3; i++) {

			List<PessoaJuridica> contribuintePj;
			contribuintePj = new ArrayList<PessoaJuridica>();

			PessoaJuridica pj = new PessoaJuridica();

			String nome = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º contribuinte: ");
			valor = JOptionPane.showInputDialog("Digite a renda bruta do " + (i + 1) + "º contribuinte: ");

			pj.setNome(nome);

			contribuintePj.add(pj);

			System.out.println(pj);
			pj.calcularImposto(valor);

		}

		JOptionPane.showMessageDialog(null, "ENTRE COM OS DADOS DAS PESSOAS FÍSICAS! ");

		System.out.println(" ");
		System.out.println("-----PESSOAS FÍSICAS----");
		System.out.println(" ");

		for (int i = 0; i < 3; i++) {

			List<PessoaFisica> contribuintePf;
			contribuintePf = new ArrayList<PessoaFisica>();

			PessoaFisica pf = new PessoaFisica();

			String nome = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º contribuinte: ");
			valor = JOptionPane.showInputDialog("Digite a renda bruta do " + (i + 1) + "º contribuinte: ");

			pf.setNome(nome);

			contribuintePf.add(pf);

			System.out.println(pf);
			pf.calcularImposto(valor);

		}

	}

}
