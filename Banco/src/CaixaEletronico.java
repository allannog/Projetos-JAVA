import java.text.NumberFormat;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Conta minhaConta = new Conta();

		Scanner entrada = new Scanner(System.in);

		boolean continua = true;

		while (continua) {

			System.out.println("Selecione sua op��o:");
			System.out.println("1 - Saldo");
			System.out.println("2 - Dep�sito");
			System.out.println("3 - Saque");
			System.out.println("4 - Encerrar");
			System.out.print("Digite sua op��o: ");
			int opcao = entrada.nextInt();

			switch (opcao) {
			
			case 1:
				
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				String valorFormato = nf.format(minhaConta.getSaldo());
				
				System.out.println("Seu saldo � de " + valorFormato);

				break;

			case 2:
				
				System.out.print("Digite o valor do dep�sito: ");
				double valorDepositado = entrada.nextDouble();
				
				try {
					minhaConta.depositar(valorDepositado);
				} catch (Exception e) {
					System.out.println("Ocorre um erro no dep�sito: " + e.getMessage());
				}

				break;

			case 3:
				
				System.out.print("Digite o valor do saque: ");
				double valorSacado = entrada.nextDouble();
				
				try {
					minhaConta.sacar(valorSacado);
				} catch (Exception e) {
					System.out.println("Ocorre um erro no saque: " + e.getMessage());
				}

				break;

			case 4:
				
				System.out.println("Opera��o encerrada, obrigado!");
				continua = false;

				break;

			default:
				System.out.println("Op��o inv�lida");
				break;
			}

		}

	}

}
