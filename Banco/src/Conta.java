import javax.swing.JOptionPane;

/**
 *classe conta para que sejam instaciados objetos dessa classe
 *@author Kallan
 *@version 1.0
 */
public class Conta {

	/**
	 * atributo saldo do tipo double com visualiza��o private
	 */
	private double saldo;

	/**
	 * m�todo para realiza��o de dep�sitos
	 * @param valor recebe como par�metro um valor do tipo double, � o valor a ser depositado
	 * @throws Exception o m�todo mostra uma mensagem de exce��o caso a mesma ocorra
	 */
	public void depositar(double valor) throws Exception {

		/**
		 * se o valor informado como par�metro for menor do que 0, ser� exibida a mensagem de exce��o abaixo 
		 */
		if (valor < 0) {
			
			throw new Exception("O valor informado � negativo");
		}

		/**
		 * caso o valor informado n�o seja menor que zero o valor ser� somado ao saldo e exibir� a mensagem abaixo
		 */
		this.saldo += valor;

		JOptionPane.showMessageDialog(null, "O dep�sito foi realizado com sucesso!");
		//System.out.println("O dep�sito foi realizado com sucesso!");

	}

	/**
	 * m�todo para realiza��o de saques
	 * @param valor valor recebe como par�metro um valor do tipo double, � o valor a ser sacado
	 * @throws Exception o m�todo mostra uma mensagem de exce��o caso a mesma ocorra
	 */
	public void sacar(double valor) throws Exception {

		/**
		 * se o valor informado como par�metro for menor do que 0, ser� exibida a mensagem de exce��o abaixo 
		 */
		if (valor < 0) {
			throw new Exception("O valor informado � negativo");
		}

		/**
		 * se o valor informado como par�metro for maior do que o saldo, ser� exibida a mensagem abaixo
		 */
		if (valor > saldo) {
			throw new Exception("O saldo � insuficiente");
		}

		/**
		 * caso o valor informado n�o seja menor que zero e maior que o saldo, o valor ser� subtraido do saldo e exibir� a mensagem abaixo
		 */
		this.saldo -= valor;

		JOptionPane.showMessageDialog(null, "O saque foi realizado com sucesso!");
		//System.out.println("O saque foi realizado com sucesso!");

	}

	/**
	 * m�todo para retornar o valor do saldo
	 * @return retona do valor do saldo
	 */
	public double getSaldo() {
		return saldo;
	}

}
