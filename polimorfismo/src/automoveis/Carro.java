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
	 *            dever� ser informado a marca do carro atraves de uma String
	 * @param modelo
	 *            dever� ser informado o modelo do carro atraves de uma String
	 * @param anoDeFabricacao
	 *            dever� ser informado o ano de fabricacao do carro atraves de um
	 *            inteiro
	 * @param quatroPortas
	 *            dever� ser informado se o carro, possui ou n�o quatro portas
	 *            atraves de um boolean
	 */
	public Carro(String marca, String modelo, int anoDeFabricacao, boolean quatroPortas) {
		super(marca, modelo, anoDeFabricacao);
		this.quatroPortas = quatroPortas;
	}

	/**
	 * M�todo excluviso da classe Carro que ira imprimir na tela se o carro possui ou n�o quatro portas
	 */
	public void possuiQuatroPortas() {

		if (quatroPortas == true) {

			System.out.println("O carro " + getModelo() + " possui 4 portas");

		} else {

			System.out.println("O carro " + getModelo() + " n�o possui 4 portas");
		}

	}

}
