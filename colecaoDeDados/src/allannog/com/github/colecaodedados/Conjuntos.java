package allannog.com.github.colecaodedados;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {

	public static void main(String[] args) {
		
		System.out.println("Conjunto HashSet");

		/**
		 * O conjunto HashSet não garante que os itens sejam exibidos na ordem em que foram incluidos
		 */
		Set<String> conjuntoStrings = new HashSet<>();

		conjuntoStrings.add("abc");
		conjuntoStrings.add("def");
		conjuntoStrings.add("ghi");
		conjuntoStrings.add("jkl");
		conjuntoStrings.add("mno");

		for (String s : conjuntoStrings) {

			System.out.println(s);

		}
		
		System.out.println("\nConjunto LinkedHashSet");
		

		/**
		 * O conjunto LinkedHashSet garante que os itens sejam exibidos na ordem em que foram incluidos
		 */
		Set<String> conjuntoStrings2 = new LinkedHashSet<>();

		conjuntoStrings2.add("mno");
		conjuntoStrings2.add("def");
		conjuntoStrings2.add("abc");
		conjuntoStrings2.add("jkl");
		conjuntoStrings2.add("ghi");

		for (String s2 : conjuntoStrings2) {

			System.out.println(s2);

		}
		
		System.out.println("\nConjunto TreeSet");
		
		/**
		 * O conjunto TreeSet garante que os itens sejam exibidos em uma ordem alfabética ou numérica mesmo que sejam incluidos itens fora da ordem
		 */
		Set<String> conjuntoStrings3 = new TreeSet<>();

		conjuntoStrings3.add("mno");
		conjuntoStrings3.add("def");
		conjuntoStrings3.add("abc");
		conjuntoStrings3.add("jkl");
		conjuntoStrings3.add("ghi");

		for (String s3 : conjuntoStrings3) {

			System.out.println(s3);

		}
		
		

	}

}
