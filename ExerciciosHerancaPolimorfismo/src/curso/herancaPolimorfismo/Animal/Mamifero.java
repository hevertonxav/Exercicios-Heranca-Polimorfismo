package curso.herancaPolimorfismo.Animal;

public class Mamifero extends Animal {
	
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	
	public Mamifero() {
		super();
	}

	public Mamifero(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade, String alimento) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}
	
	
	@Override
	public String mostrarAnimal() {
		
		String info = "Animal: " + getNome() +  "\n";
		info += "Comprimento: " + getComprimento() + " cm" + "\n"; 
		info += "Patas: " + getPatas() +  "\n";
		info += "Cor: " + getCor() +  "\n";
		info += "Ambiente: " + getAmbiente() +  "\n";
		info += "Velocidade: " + getVelocidade() + " m/s" + "\n";
		info += "Características: " + getAlimento() +  "\n";
		return info;
	
	}
	

}
