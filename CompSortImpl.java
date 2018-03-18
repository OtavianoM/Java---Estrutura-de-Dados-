package SchoolOfNetAulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompSortImpl {

	public static void main(String[] args) {
		List<Person> arr = new ArrayList<Person>();
		
		arr.add(new Person("Otaviano", 23));
		arr.add(new Person("Maria", 24));
		arr.add(new Person("Felipe", 25));
		arr.add(new Person("Clovis", 29));
		arr.add(new Person("Wesley", 27));
		arr.add(new Person("Amanda", 26));
		
		for (Person p : arr) {
			System.out.println(p.getName() + "   " + p.getAge() ); // saida dos dados sem organizacao
			
		}
		
		System.out.println(" ");
		
		
//		Collections.sort((List)arr); // com um argumento vai para compareTO
		
		Collections.sort((List)arr, new Person()); // com dois argumentos vai para compare
		
		for (Person p : arr) {
			System.out.println(p.getName() + "   " + p.getAge() ); // saida dos dados organizados
			
		}
		
		
	}

}
