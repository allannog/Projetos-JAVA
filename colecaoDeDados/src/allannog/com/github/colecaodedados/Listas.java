package allannog.com.github.colecaodedados;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		/**
		 * Criada uma lista de Integer, classe wrapper de int, listaDeInteiros
		 */
		List<Integer> listaDeInteiros = new ArrayList<>();
		
		/**
		 * cada .add adiciona um item ao ArrayList, desde que ele seja do mesmo tipo
		 */
		listaDeInteiros.add(123);
		listaDeInteiros.add(456);
		listaDeInteiros.add(789);
		/**
		 * ao informar uma posição dentro do .add ele "empurra" os demais itens para as outras posições
		 */
		listaDeInteiros.add(0, 0);
		
		/**
		 * usando o .set ele "substitui" o conteúdo da posição informada pelo novo conteúdo informado
		 */
		listaDeInteiros.set(3, 987);
		
		
		for (Integer i : listaDeInteiros) {
			
			System.out.println(i);
			
		}

	}

}
