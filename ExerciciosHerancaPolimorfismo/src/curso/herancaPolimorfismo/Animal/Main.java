/*
Um animal contém nome, comprimento, número de patas(padrão é 4), cor,
ambiente e velocidade(em m/s).
Um peixe é um animal, tem 0 patas, seu ambiente é o mar(padrão), cor cinzenta.
(padrão). Além disso tem como características barbatanas e cauda.
Um mamífero é um animal e seu ambiente padrão é terra.
Um urso é um mamífero, cor castanho e seu alimento preferido é o mel.
Crie as classes Animal, Peixe e Mamífero.
Para a classe Animal, coloque os atributos: nome, comprimento, patas, cor, ambiente, velocidade 
Para a classe Peixe, codifique o atributo características.
Para a classe Mamifero, coloque o atributo alimento.
Porúltimo, crie uma classe teste de forma a ter um jardim zoológico com os
seguintes animais: camelo, tubarão, urso-do-canadá.

Exemplo da execução:

-----ZOOLÓGICO: -----
 
Animal: camelo
Comprimento: 150 cm
Patas: 4
Cor: amarelo
Ambiente: terra
Velocidade: 2.0 m/s
Características: vegetais

Animal: tubarão
Comprimento: 300 cm
Patas: 0
Cor: cinzento
Ambiente: mar
Velocidade: 1.5 m/s
Características: barbatanas e cauda

Animal: urso-do-canadá
Comprimento: 180 cm
Patas: 4
Cor: vermelho
Ambiente: terra
Velocidade: 0.5 m/s
Características: mel

*/

package curso.herancaPolimorfismo.Animal;

public class Main {
	
	public static void main(String[] args) {
	
	
		System.out.println("-----ZOOLÓGICO: TODOS OS BICHOS-----");
		System.out.println(" ");
		
        Mamifero mamifero1 = new Mamifero();
		
		mamifero1.setNome("camelo");
		mamifero1.setComprimento(150);
		mamifero1.setPatas(4);
		mamifero1.setCor("amarelo");
		mamifero1.setAmbiente("terra");
		mamifero1.setVelocidade(2);
		mamifero1.setAlimento("vegetais");
		
		System.out.println(mamifero1.mostrarAnimal());

	    
		Peixe peixe = new Peixe();
		
		peixe.setNome("tubarão");
		peixe.setComprimento(300);
		peixe.setPatas(0);
		peixe.setCor("cinzento");
		peixe.setAmbiente("mar");
		peixe.setVelocidade(1.5);
		peixe.setCaracteristica("barbatanas e cauda");
		
		System.out.println(peixe.mostrarAnimal());
		
		
        Mamifero mamifero2 = new Mamifero();
		
		mamifero2.setNome("urso-do-canadá");
		mamifero2.setComprimento(180);
		mamifero2.setPatas(4);
		mamifero2.setCor("vermelho");
		mamifero2.setAmbiente("terra");
		mamifero2.setVelocidade(0.5);
		mamifero2.setAlimento("mel");
		
		System.out.println(mamifero2.mostrarAnimal());

	}

}
