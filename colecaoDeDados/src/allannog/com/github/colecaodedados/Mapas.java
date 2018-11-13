package allannog.com.github.colecaodedados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

	public static void main(String[] args) {
		
		/**
		 * criado um Map, que ira vincular, um Integer a um Produtos, em um mapaProdutos
		 */
		Map<Integer, Produtos> mapaProdutos = new HashMap<>();
		
		/**
		 * Criado 4 produtos
		 */
		Produtos p1 = new Produtos(1, "Produto 1");
		Produtos p2 = p1;
		Produtos p3 = new Produtos(3, "Produto 3");
		Produtos p4 = new Produtos(1, "Produto 4");
		
		/**
		 * com o .put vinculamos uma chave a cada produto
		 */
		mapaProdutos.put(1, p1);
		mapaProdutos.put(2, p2);
		mapaProdutos.put(3, p3);
		mapaProdutos.put(4, p4);
		
		/**
		 * abaixo exibimos cada item que pertence a determinada chave
		 */
		System.out.println(mapaProdutos.get(1));
		System.out.println(mapaProdutos.get(2));
		System.out.println(mapaProdutos.get(3));
		System.out.println(mapaProdutos.get(4));
		

	}

}
