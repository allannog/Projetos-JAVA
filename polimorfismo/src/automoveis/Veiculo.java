package Automoveis;

/**
 * Classe abstrata Veiculo, será extendida para outras classes, mas como é
 * abstrata não será possui instanciar objetos dela
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
	 * método que será usado para informar quando um determinado veiculo acelerar
	 */
	public void acelerar() {

		System.out.println("O veiculo " + modelo + " acelerou");
	}

	/**
	 * método que será usado para informar quando um determinado veiculo frear
	 */
	public void frear() {

		System.out.println("O veiculo " + modelo + " freou");
	}

	/**
	 * construtor para um objeto que extenda da classe veiculo
	 * 
	 * @param marca
	 *            deverá ser informado a marca do veiculo atraves de uma String
	 * @param modelo
	 *            deverá ser informado o modelo do veiculo atraves de uma String
	 * @param anoDeFabricacao
	 *            deverá ser informado o ano de fabricacao do veiculo atraves de um
	 *            inteiro
	 */
	public Veiculo(String marca, String modelo, int anoDeFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
	}

	/**
	 * método para obter a marca do veiculo
	 * 
	 * @return retorna a String relacionada a marca do veiculo
	 */

	public String getMarca() {
		return marca;
	}

	/**
	 * método para obter o modelo do veiculo
	 * 
	 * @return retorna a String relacionada ao modelo do veiculo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * método para obter o ano de fabricacao do veiculo
	 * 
	 * @return retorna o inteiro relacionada ao ano de fabricação do veiculo
	 * 
	 */
	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

}
