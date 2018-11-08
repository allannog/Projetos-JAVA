package Automoveis;

/**
 * 
 * @author Allan Nogueira Criada classe Carro que extend de Veiculo
 */
public class Carro extends Veiculo {

	/**
	 * Atributo exclusivo da classe Carro quatroPortas do tipo Boolean
	 */
	private boolean quatroPortas;

	/**
	 * Construtor para objetos da classe Carro
	 * 
	 * @param marca
	 *            deverá ser informado a marca do carro atraves de uma String
	 * @param modelo
	 *            deverá ser informado o modelo do carro atraves de uma String
	 * @param anoDeFabricacao
	 *            deverá ser informado o ano de fabricacao do carro atraves de um
	 *            inteiro
	 * @param quatroPortas
	 *            deverá ser informado se o carro, possui ou não quatro portas
	 *            atraves de um boolean
	 */
	public Carro(String marca, String modelo, int anoDeFabricacao, boolean quatroPortas) {
		super(marca, modelo, anoDeFabricacao);
		this.quatroPortas = quatroPortas;
	}

	/**
	 * Método excluviso da classe Carro que ira imprimir na tela se o carro possui ou não quatro portas
	 */
	public void possuiQuatroPortas() {

		if (quatroPortas == true) {

			System.out.println("O carro " + getModelo() + " possui 4 portas");

		} else {

			System.out.println("O carro " + getModelo() + " não possui 4 portas");
		}

	}

}
