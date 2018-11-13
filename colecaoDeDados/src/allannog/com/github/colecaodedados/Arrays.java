package allannog.com.github.colecaodedados;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {

		/**
		 * criado um Array simples vetorA[] do tipo inteiro com 5 posições
		 */
		int vetorA[] = new int[5];

		/**
		 * abaixo populamos um à um, manualmente, cada posição do Array
		 */
		vetorA[0] = 1;
		vetorA[1] = 2;
		vetorA[2] = 3;
		vetorA[3] = 4;
		vetorA[4] = 5;
		
		/**
		 * Através do Println buscamos o valor de uma determinada posição
		 */
		System.out.println("Valor da Segunda posição: " + vetorA[1]);

		System.out.println("Array Simples: ");

		/**
		 * No for abaixo realizamos um iteração de todos os valores do VetorA e imprimimos o mesmo na tela
		 */
		for (int i : vetorA) {

			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println("Array Bidimensional: ");

		/**
		 * Abaixo foi criado um Array Bidimensional com 9 posições 3x3
		 */
		int vetorB[][] = new int[3][3];

		/**
		 * Criada uma instancia de Random
		 */
		Random r = new Random();

		/**
		 * Atraves dessas 2 iterações do for populamos todas as posições do vetorB
		 */
		for (int m = 0; m < vetorB.length; m++) {
			vetorB[m][0] = r.nextInt(100);
			for (int n = 0; n < vetorB[0].length; n++) {
				vetorB[m][n] = r.nextInt(100);

			}

		}

		/**
		 * Aqui imprimimos na tela os valores
		 */
		for (int j = 0; j < vetorB.length; j++) {
			for (int k = 0; k < vetorB[0].length; k++) {

				System.out.print(vetorB[j][k] + " ");

			}

			System.out.println();

		}

	}

}
