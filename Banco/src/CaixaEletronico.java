import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @version 1.0
 * @author Kallan
 *Aplicacao para uso da classe Conta
 */
public class CaixaEletronico {

	public static void main(String[] args) {

		/**
		 * criado novo objeto minhaConta da classe Conta
		 */
		Conta minhaConta = new Conta();

		/**
		 * criado novo objeto entrada da classe Scanner para receber um valor
		 */
		Scanner entrada = new Scanner(System.in);

		/**
		 * atributo continua do tipo boolean com o valor true
		 */
		boolean continua = true;

		/**
		 * criado loop while que usa como parametro o boolean continua
		 */
		while (continua) {

			/**
			 * Enquanto a condi��o de while for verdadeira ele exibira as op��es abaixo
			 */
			System.out.println("Selecione sua op��o:");
			System.out.println("1 - Saldo");
			System.out.println("2 - Dep�sito");
			System.out.println("3 - Saque");
			System.out.println("4 - Encerrar");
			System.out.print("Digite sua op��o: ");
			/**
			 * Ao escolher uma das op��es ela ser� armazenada em um int opcao que esta ligado ao Scanner entrada
			 */
			int opcao = entrada.nextInt();

			/**
			 * Esse int op��o ira direcionar atrav�s do switch caso ele deve exibir 
			 */
			switch (opcao) {
			
			/**
			 * caso 1 para saldo
			 */
			case 1:
				
				/**
				 * criada uma instancia de NumberFormat para formatar em padr�o de moeda brasileira o valor do m�todo getSaldo()
				 */
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				String valorFormato = nf.format(minhaConta.getSaldo());
				
				System.out.println("Seu saldo � de " + valorFormato);

				break;

				/**
				 * caso 2 para dep�sito
				 */
			case 2:
				
				/**
				 * ser� solicitado que seja digitado o valor a ser depositado
				 */
				System.out.print("Digite o valor do dep�sito: ");
				double valorDepositado = entrada.nextDouble();
				
				/**
				 * caso ocorra uma exce��o o try ira tratar a mesma em conjunto com o catch
				 */
				try {
					minhaConta.depositar(valorDepositado);
				} catch (Exception e) {
					System.out.println("Ocorre um erro no dep�sito: " + e.getMessage());
				}

				break;

				/**
				 * caso 3 para saque
				 */
			case 3:
				
				/**
				 * ser� solicitado que seja digitado o valor a ser depositado
				 */
				System.out.print("Digite o valor do saque: ");
				double valorSacado = entrada.nextDouble();
				
				/**
				 * caso ocorra uma exce��o o try ira tratar a mesma em conjunto com o catch
				 */
				try {
					minhaConta.sacar(valorSacado);
				} catch (Exception e) {
					System.out.println("Ocorre um erro no saque: " + e.getMessage());
				}

				break;

				/**
				 * caso 4 para encerrar
				 */
			case 4:
				
				/**
				 * ser� exibida a mensagem abaixo e loop while usando continua como true ser� alterado para false e ser� encerrada a sess�o
				 */
				System.out.println("Opera��o encerrada, obrigado!");
				continua = false;

				break;

				/**
				 * caso seja digitada alguma op��o, fora das op��es possiveis, ser� exibida a mensagem abaixo
				 */
			default:
				System.out.println("Op��o inv�lida");
				break;
			}

		}

	}

}
