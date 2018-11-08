package Automoveis;

/**
 * 
 * @author Allan Nogueira
 *Classe Motocicleta que extend da classe Veiculo
 */
public class Motocicleta extends Veiculo {

	/**
	 * construtor para um objeto da Classe Motocicleta
	 * 
	 * @param marca
	 *            deverá ser informado a marca da Motocicleta atraves de uma String
	 * @param modelo
	 *            deverá ser informado o modelo da Motocicleta atraves de uma String
	 * @param anoDeFabricacao
	 *            deverá ser informado o ano de fabricacao da Motocicleta atraves de um
	 *            inteiro
	 */
	public Motocicleta(String marca, String modelo, int anoDeFabricacao) {
		super(marca, modelo, anoDeFabricacao);
		
	}
	
	/**
	 * Método exclusivo da classe Motocicleta, que ao ser invocado imprime na tela que a motocicleta esta sendo empinada
	 */
	public void empinar () {
		
		System.out.println("A motocicleta " + getModelo() + " empinou!");
		
	}

}
