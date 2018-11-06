
public class Conta {

	private double saldo;

	public void depositar(double valor) throws Exception {

		if (valor < 0) {
			throw new Exception("O valor informado é negativo");
		}

		this.saldo += valor;

		System.out.println("O depósito foi realizado com sucesso!");

	}

	public void sacar(double valor) throws Exception {

		if (valor < 0) {
			throw new Exception("O valor informado é negativo");
		}

		if (valor > saldo) {
			throw new Exception("O saldo é insuficiente");
		}

		this.saldo -= valor;

		System.out.println("O saque foi realizado com sucesso!");

	}

	public double getSaldo() {
		return saldo;
	}

}
