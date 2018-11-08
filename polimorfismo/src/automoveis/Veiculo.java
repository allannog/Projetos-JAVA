package Automoveis;

/**
 * Classe abstrata Veiculo, ser� extendida para outras classes, mas como �
 * abstrata n�o ser� possui instanciar objetos dela
 * 
 * @author Allan Nogueira
 *
 */
public abstract class Veiculo {

	/**
	 * Atributos marca e modelo do tipo String Atributo anoDeFabricacao do tipo int
	 */
	private String marca;
	private String modelo;
	private int anoDeFabricacao;

	/**
	 * m�todo que ser� usado para informar quando um determinado veiculo acelerar
	 */
	public void acelerar() {

		System.out.println("O veiculo " + modelo + " acelerou");
	}

	/**
	 * m�todo que ser� usado para informar quando um determinado veiculo frear
	 */
	public void frear() {

		System.out.println("O veiculo " + modelo + " freou");
	}

	/**
	 * construtor para um objeto que extenda da classe veiculo
	 * 
	 * @param marca
	 *            dever� ser informado a marca do veiculo atraves de uma String
	 * @param modelo
	 *            dever� ser informado o modelo do veiculo atraves de uma String
	 * @param anoDeFabricacao
	 *            dever� ser informado o ano de fabricacao do veiculo atraves de um
	 *            inteiro
	 */
	public Veiculo(String marca, String modelo, int anoDeFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
	}

	/**
	 * m�todo para obter a marca do veiculo
	 * 
	 * @return retorna a String relacionada a marca do veiculo
	 */

	public String getMarca() {
		return marca;
	}

	/**
	 * m�todo para obter o modelo do veiculo
	 * 
	 * @return retorna a String relacionada ao modelo do veiculo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * m�todo para obter o ano de fabricacao do veiculo
	 * 
	 * @return retorna o inteiro relacionada ao ano de fabrica��o do veiculo
	 * 
	 */
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

}
