package Automoveis;

/**
 * 
 * @author Allan Nogueira
 *Classe Caminhao que extend da classe Veiculo
 */
public class Caminhao extends Veiculo {

	/**
	 * Atributo exclusivo da classe Caminhao caminhaoComCarga do tipo Boolean
	 */
	private boolean caminhaoComCarga;

	/**
	 * Construtor para objetos da classe Caminhao
	 * 
	 * @param marca
	 *            deverá ser informado a marca do caminhao atraves de uma String
	 * @param modelo
	 *            deverá ser informado o modelo do caminhao atraves de uma String
	 * @param anoDeFabricacao
	 *            deverá ser informado o ano de fabricacao do caminhao atraves de um
	 *            inteiro
	 * @param quatroPortas
	 *            deverá ser informado se o caminhao, possui ou não carga
	 *            atraves de um boolean
	 */
	public Caminhao(String marca, String modelo, int anoDeFabricacao, boolean caminhaoComCarga) {
		super(marca, modelo, anoDeFabricacao);
		this.caminhaoComCarga = caminhaoComCarga;

	}
	
	/**
	 * Método excluviso da classe Caminhao que ira imprimir na tela se o caminhão esta carregado ou não
	 */
	public void caminhaoCarregado() {

		if (caminhaoComCarga == true) {

			System.out.println("O caminhão " + getModelo() + " está carregado");

		} else {

			System.out.println("O caminhão " + getModelo() + " não está carregado");
		}

	}

}
