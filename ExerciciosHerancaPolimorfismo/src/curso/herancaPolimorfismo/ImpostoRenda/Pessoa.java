package curso.herancaPolimorfismo.ImpostoRenda;

public abstract class Pessoa {

	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa() {}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public abstract String toString();

	public abstract void calcularImposto(String valor);

}
