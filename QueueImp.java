package SchoolOfNetAulas;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue queue = new LinkedList<>();

		// lista sincronizada
		// import crtl + shift + o

		System.out.println("Push: " + queue.add("Jose"));
		System.out.println("Push: " + queue.add("Maria"));

		System.out.println("Element: " + queue.element()); // se estiver vazia ele retorna um erro
		System.out.println("Peek: " + queue.peek()); // se estiver vazia ele retorna um null
		System.out.println("Poll: " + queue.poll()); // se estiver vazia ele retorna um false
		System.out.println("Remove: " + queue.remove()); // se estiver vazia ele retorna um erro
		System.out.println("Vazia? " + queue.isEmpty()); // retorna se a lista ta vazia ou nao
		
		// queue.element(); // mostrando o primerio elemento a ser retirado da fila
		// peek.element(); // mostrando o primerio elemento a ser retirado da fila e retorna null caso esteja vazia
		// queue.poll(); //usando para remover e retorna false caso esteja vazia
		// queue.remove(); //usando para remover
	}

}
