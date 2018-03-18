package SchoolOfNetAulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {

	public static void main(String[] args) {
		// List<String> list = Collections.synchronizedList(new ArrayList<String>());
		// usando essa classe de cima, obrigatoriamente tem que sincronizar
		
		List<String> list = new CopyOnWriteArrayList<String>();
		// Quando utilizo essa classe, nao precisa utilizar
		// a formula de sincronziacao, como visto a baixo
		
		list.add("Otaviano");
		list.add("Maria");
		list.add("Wesley");
		list.add("Marques");
		
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
		 System.out.println(iterator.next());
		}
		 
//		 synchronized (list) {
//		 Iterator<String> iterator = list.iterator();
//		
//		 while (iterator.hasNext()) {
//		 System.out.println(iterator.next());
//		 }
//		 }
	}

}
