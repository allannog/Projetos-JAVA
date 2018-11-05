
public class BubbleSort {

	public static void main(String[] args) {

		int vetorA[] = { 10, 5, 8, 6, 7, 3, 1, 2, 4, 9 };
		int vetorB[] = { 22, 33, 11, 55, 99, 100, 44, 66, 55, 77, 88 };

		vetorDesordenado(vetorA);
		ordenaVetor(vetorA);

		vetorDesordenado(vetorB);
		ordenaVetor(vetorB);

	}

	/**
	 * método que recebe um vetor desordenado e imprime na tela o conteúdo do mesmo
	 * @param vetor recebe como parametro um vetor de inteiros
	 */
	public static void vetorDesordenado(int vetor[]) {

		System.out.println("\nVetor Desordenado: ");

		for (int x : vetor) {

			System.out.print(x + " ");
		}
	}

	/**
	 * método que recebe um vetor desordenado e ordena o mesmo usando o método bubble sort e imprime na tela o conteúdo ordenado 
	 * @param vetor recebe como parametro um vetor de inteiros
	 */
	public static void ordenaVetor(int vetor[]) {

		int aux = 0;
		boolean continua = true;

		while (continua) {

			continua = false;

			for (int i = 0; i < vetor.length - 1; i++) {

				if (vetor[i] > vetor[i + 1]) {

					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					continua = true;

				}
			}

		}

		System.out.println("\nVetor Ordenado: ");

		for (int k : vetor) {

			System.out.print(k + " ");
		}

	}

}
