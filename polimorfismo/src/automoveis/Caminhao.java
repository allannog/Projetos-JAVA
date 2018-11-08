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
	 *            dever� ser informado a marca do caminhao atraves de uma String
	 * @param modelo
	 *            dever� ser informado o modelo do caminhao atraves de uma String
	 * @param anoDeFabricacao
	 *            dever� ser informado o ano de fabricacao do caminhao atraves de um
	 *            inteiro
	 * @param quatroPortas
	 *            dever� ser informado se o caminhao, possui ou n�o carga
	 *            atraves de um boolean
	 */
	public Caminhao(String marca, String modelo, int anoDeFabricacao, boolean caminhaoComCarga) {
		super(marca, modelo, anoDeFabricacao);
		this.caminhaoComCarga = caminhaoComCarga;

	}
	
	/**
	 * M�todo excluviso da classe Caminhao que ira imprimir na tela se o caminh�o esta carregado ou n�o
	 */
	public void caminhaoCarregado() {

		if (caminhaoComCarga == true) {

			System.out.println("O caminh�o " + getModelo() + " est� carregado");

		} else {

			System.out.println("O caminh�o " + getModelo() + " n�o est� carregado");
		}

	}

}
