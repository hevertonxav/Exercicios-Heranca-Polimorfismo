package curso.herancaPolimorfismo.ContaBanco;

import java.text.DecimalFormat;
import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private  int diaRendimento;
    
    

	public ContaPoupanca() {
		super();
	}


	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}


    public int getDiaRendimento() {
		return diaRendimento;
	}


	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}


    @Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("####0.00");

		String info = " **** BANCO TABAJARA **** " + "\n";
		       info += "  " + "\n";
		       info += "---- CONTA POUPANÇA ---- " + "\n";
		       info += " " + "\n";
		       info += "Cliente:  " + getNomeCliente() + "\n";
		       info += "Conta: " + getNumConta() + "\n";
		       info += "Dia do rendimento: " + getDiaRendimento() + "\n";
		       info += "Saldo: R$ " + df.format(getSaldo()) + "\n";
               
		       return info;
		       
	}


     public boolean calcularNovoSaldo(double juros) {
		
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			
			this.setSaldo(this.getSaldo() + (this.getSaldo() * (juros/100)));
			return true;
		
		}
		
		return false;
		
	}
		
		
}



	
	

