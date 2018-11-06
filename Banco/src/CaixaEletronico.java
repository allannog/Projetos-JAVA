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
			 * Enquanto a condição de while for verdadeira ele exibira as opções abaixo
			 */
			System.out.println("Selecione sua opção:");
			System.out.println("1 - Saldo");
			System.out.println("2 - Depósito");
			System.out.println("3 - Saque");
			System.out.println("4 - Encerrar");
			System.out.print("Digite sua opção: ");
			/**
			 * Ao escolher uma das opções ela será armazenada em um int opcao que esta ligado ao Scanner entrada
			 */
			int opcao = entrada.nextInt();

			/**
			 * Esse int opção ira direcionar através do switch caso ele deve exibir 
			 */
			switch (opcao) {
			
			/**
			 * caso 1 para saldo
			 */
			case 1:
				
				/**
				 * criada uma instancia de NumberFormat para formatar em padrão de moeda brasileira o valor do método getSaldo()
				 */
				NumberFormat nf = NumberFormat.getCurrencyInstance();
				String valorFormato = nf.format(minhaConta.getSaldo());
				
				System.out.println("Seu saldo é de " + valorFormato);

				break;

				/**
				 * caso 2 para depósito
				 */
			case 2:
				
				/**
				 * será solicitado que seja digitado o valor a ser depositado
				 */
				System.out.print("Digite o valor do depósito: ");
				double valorDepositado = entrada.nextDouble();
				
				/**
				 * caso ocorra uma exceção o try ira tratar a mesma em conjunto com o catch
				 */
				try {
					minhaConta.depositar(valorDepositado);
				} catch (Exception e) {
					System.out.println("Ocorre um erro no depósito: " + e.getMessage());
				}

				break;

				/**
				 * caso 3 para saque
				 */
			case 3:
				
				/**
				 * será solicitado que seja digitado o valor a ser depositado
				 */
				System.out.print("Digite o valor do saque: ");
				double valorSacado = entrada.nextDouble();
				
				/**
				 * caso ocorra uma exceção o try ira tratar a mesma em conjunto com o catch
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
				 * será exibida a mensagem abaixo e loop while usando continua como true será alterado para false e será encerrada a sessão
				 */
				System.out.println("Operação encerrada, obrigado!");
				continua = false;

				break;

				/**
				 * caso seja digitada alguma opção, fora das opções possiveis, será exibida a mensagem abaixo
				 */
			default:
				System.out.println("Opção inválida");
				break;
			}

		}

	}

}
