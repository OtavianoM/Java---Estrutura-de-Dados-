package SchoolOfNetAulas;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		
//		NAO É SINCRONIZADA
//		TreeSet tree = new TreeSet(); // modo default
		
		TreeSet <Integer> tree = new TreeSet<Integer>(); // modo generic type
		
//		 se usar em modo default, nao pode juntar uma String com Integer
//		Por isso tem que usar o generic type para trabalhar de modo especifico
		
		tree.add(2); 
		// se definirar, em modo default, no primeiro dado colocado. Nesse exemplo é um Integer de valor 2
		tree.add(5);
		tree.add(4);
		
		System.out.println(tree); // imprime igual array, entre [] 
		
		Iterator<Integer> iterator = tree.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); // imprime normal, default
			
		}
		
		System.out.println(tree.first()); // primeiro dado
		
		System.out.println(tree.pollFirst()); // primeiro dado removido
		
		System.out.println(tree.last()); // ultimo dado
		
		System.out.println(tree.pollLast()); // ultimo dado removido

		System.out.println(tree.size()); // tamanho da lista

		System.out.println(tree.isEmpty()); // ta vazia?

		
	}

}
