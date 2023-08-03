/*
Elabore uma classe ContaBancaria com os seguintes atributos:

• nomeCliente
• numConta
• saldo

E os seguintes métodos:

• sacar(o saldo não pode ficar negativo)
• depositar$

Crie também duas subclasses chamadas ContaPoupanca e ContaEspecial, com as
seguintes características:

ContaPoupanca
• atributo diaRendimento
• método calcularNovoSaldo, recebe taxa de rendimento da poupança e
atualiza o saldo

ContaEspecial
• atributo limite
• sobrescreva o método sacar com a nova lógica necessária 

Crie uma classe Teste que contenha a seguinte lógica:
• Criar contas
• Sacar um valor das contas
• Depositar
• Mostrar um novo saldo a partir de um rendimento
• Mostrar os dados da conta do cliente
*/


package curso.herancaPolimorfismo.ContaBanco;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String tipoConta = JOptionPane.showInputDialog("Escolha uma opção: " + "\n"
				+ "1 - para acessar a conta bancária" + "\n" + "2 - para acessar a conta poupança" + "\n"
				+ "3 - para acessar a conta especial");

		String valor;
		
		switch (tipoConta) {

		case "1":

			ContaBancaria conta = new ContaBancaria();

			conta.setNomeCliente("Heverton Xavier Soares");
			conta.setNumConta("13131-3");
			conta.setSaldo(13000);

			System.out.println(conta);

			String opcao = JOptionPane.showInputDialog("Você está na sua conta bancária, escolha uma opção: " + "\n"
					+ "1 - para  depositar" + "\n" + "2 - para sacar");

			switch (opcao) {

			case "1":

				valor = JOptionPane.showInputDialog("Digite o valor a depositar: ");
				conta.depositar(Double.valueOf(valor));
				break;

			case "2":

				valor = JOptionPane.showInputDialog("Digite o valor a sacar: ");
				conta.sacar(Double.valueOf(valor));

			}
			
		
		case "2":
			
			ContaPoupanca poupanca = new ContaPoupanca();
			
			poupanca.setNomeCliente("Heverton Xavier Soares");
			poupanca.setNumConta("13131-3");
			poupanca.setSaldo(8000);
			poupanca.setDiaRendimento(23);
			
			System.out.println(poupanca);
			
			 if(poupanca.calcularNovoSaldo(0.5)) {
					
			        System.out.printf("Rendimendo aplicado, novo saldo é de: R$ %.2f %n " , poupanca.getSaldo());
			
		        } else {
			
			        System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
			
		        }; break;
		
		case "3":
			
			ContaEspecial especial = new ContaEspecial();
			
			especial.setNomeCliente("Heverton Xavier Soares");
			especial.setNumConta("13131-3");
			especial.setSaldo(13000);
			especial.setLimite(7000);
			
			System.out.println(especial);
			
			valor = JOptionPane.showInputDialog("Digite o valor a sacar: ");
			especial.sacar(Double.valueOf(valor));
			break;
			
			

		}
		

		

	}
}
