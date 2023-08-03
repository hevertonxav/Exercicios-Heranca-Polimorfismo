package curso.herancaPolimorfismo.Animal;

public class Peixe extends Animal {
	
	private String caracteristica;

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	

	public Peixe() {
		super();
	}

	public Peixe(String nome, int comprimento, int patas, String cor, String ambiente, double velocidade, String caracteristica) {
		super(nome, comprimento, patas, cor, ambiente, velocidade);
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String mostrarAnimal() {
	    
		String info = "Animal: " + getNome() + "\n";
		info += "Comprimento: " + getComprimento() + " cm" + "\n"; 
		info += "Patas: " + getPatas() +  "\n";
		info += "Cor: " + getCor() +  "\n";
		info += "Ambiente: " + getAmbiente() +  "\n";
		info += "Velocidade: " + getVelocidade() + " m/s" +   "\n";
		info += "Características: " + getCaracteristica() +  "\n";
		return info;
	
	}
	
}
