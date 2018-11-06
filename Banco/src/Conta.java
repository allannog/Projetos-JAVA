import javax.swing.JOptionPane;

/**
 *classe conta para que sejam instaciados objetos dessa classe
 *@author Kallan
 *@version 1.0
 */
public class Conta {

	/**
	 * atributo saldo do tipo double com visualização private
	 */
	private double saldo;

	/**
	 * método para realização de depósitos
	 * @param valor recebe como parâmetro um valor do tipo double, é o valor a ser depositado
	 * @throws Exception o método mostra uma mensagem de exceção caso a mesma ocorra
	 */
	public void depositar(double valor) throws Exception {

		/**
		 * se o valor informado como parâmetro for menor do que 0, será exibida a mensagem de exceção abaixo 
		 */
		if (valor < 0) {
			
			throw new Exception("O valor informado é negativo");
		}

		/**
		 * caso o valor informado não seja menor que zero o valor será somado ao saldo e exibirá a mensagem abaixo
		 */
		this.saldo += valor;

		JOptionPane.showMessageDialog(null, "O depósito foi realizado com sucesso!");
		//System.out.println("O depósito foi realizado com sucesso!");

	}

	/**
	 * método para realização de saques
	 * @param valor valor recebe como parâmetro um valor do tipo double, é o valor a ser sacado
	 * @throws Exception o método mostra uma mensagem de exceção caso a mesma ocorra
	 */
	public void sacar(double valor) throws Exception {

		/**
		 * se o valor informado como parâmetro for menor do que 0, será exibida a mensagem de exceção abaixo 
		 */
		if (valor < 0) {
			throw new Exception("O valor informado é negativo");
		}

		/**
		 * se o valor informado como parâmetro for maior do que o saldo, será exibida a mensagem abaixo
		 */
		if (valor > saldo) {
			throw new Exception("O saldo é insuficiente");
		}

		/**
		 * caso o valor informado não seja menor que zero e maior que o saldo, o valor será subtraido do saldo e exibirá a mensagem abaixo
		 */
		this.saldo -= valor;

		JOptionPane.showMessageDialog(null, "O saque foi realizado com sucesso!");
		//System.out.println("O saque foi realizado com sucesso!");

	}

	/**
	 * método para retornar o valor do saldo
	 * @return retona do valor do saldo
	 */
	public double getSaldo() {
		return saldo;
	}

}
