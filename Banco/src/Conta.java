
public class Conta {

	private double saldo;

	public void depositar(double valor) throws Exception {

		if (valor < 0) {
			throw new Exception("O valor informado � negativo");
		}

		this.saldo += valor;

		System.out.println("O dep�sito foi realizado com sucesso!");

	}

	public void sacar(double valor) throws Exception {

		if (valor < 0) {
			throw new Exception("O valor informado � negativo");
		}

		if (valor > saldo) {
			throw new Exception("O saldo � insuficiente");
		}

		this.saldo -= valor;

		System.out.println("O saque foi realizado com sucesso!");

	}

	public double getSaldo() {
		return saldo;
	}

}
