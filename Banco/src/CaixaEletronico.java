import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

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
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione sua opção:\n"+
			
			"1 - Saldo\n"+
			"2 - Depósito\n"+
			"3 - Saque\n"+
			"4 - Encerrar\n"+
			"Digite sua opção:"
			));
			/**
			 * Ao escolher uma das opções ela será armazenada em um int opcao que esta ligado ao Scanner entrada
			 */
			//int opcao = entrada.nextInt();

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
				
				JOptionPane.showMessageDialog(null, "Seu saldo é de " + valorFormato);
				
				//System.out.println("Seu saldo é de " + valorFormato);

				break;

				/**
				 * caso 2 para depósito
				 */
			case 2:
				
				/**
				 * será solicitado que seja digitado o valor a ser depositado
				 */
				//System.out.print("Digite o valor do depósito: ");
				//double valorDepositado = entrada.nextDouble();
				double valorDepositado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
				
				/**
				 * caso ocorra uma exceção o try ira tratar a mesma em conjunto com o catch
				 */
				try {
					minhaConta.depositar(valorDepositado);
				} catch (Exception e) {
					//System.out.println("Ocorre um erro no depósito: " + e.getMessage());
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro no Depósito", JOptionPane.ERROR_MESSAGE);
				}

				break;

				/**
				 * caso 3 para saque
				 */
			case 3:
				
				/**
				 * será solicitado que seja digitado o valor a ser depositado
				 */
//				System.out.print("Digite o valor do saque: ");
//				double valorSacado = entrada.nextDouble();
				double valorSacado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: "));
				
				/**
				 * caso ocorra uma exceção o try ira tratar a mesma em conjunto com o catch
				 */
				try {
					minhaConta.sacar(valorSacado);
				} catch (Exception e) {
					//System.out.println("Ocorre um erro no saque: " + e.getMessage());
					JOptionPane.showMessageDialog(null, e.getMessage(), "Erro no Saque", JOptionPane.ERROR_MESSAGE);
				}

				break;

				/**
				 * caso 4 para encerrar
				 */
			case 4:
				
				/**
				 * será exibida a mensagem abaixo e loop while usando continua como true será alterado para false e será encerrada a sessão
				 */
				
				JOptionPane.showMessageDialog(null, "Operação encerrada, obrigado", "Sessão Encerrada", JOptionPane.WARNING_MESSAGE);
				//System.out.println("Operação encerrada, obrigado!");
				continua = false;

				break;

				/**
				 * caso seja digitada alguma opção, fora das opções possiveis, será exibida a mensagem abaixo
				 */
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
				System.out.println("Opção inválida");
				break;
			}

		}

	}

}
