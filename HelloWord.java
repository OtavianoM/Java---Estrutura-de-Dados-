package SchoolOfNetAulas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String age = "";
		age = JOptionPane.showInputDialog("Wha is your age ?");
		
		Integer ageInt = Integer.parseInt(age);
		
		JOptionPane.showConfirmDialog(null, "Your age is " + ageInt);
			
		

	}
}
/*
 * // ARRAY
 * 
 * int[] ages = new int[10];
 * 
 * ages[0] = 10; ages[1] = 100; ages[2] = 1000; ages[3] = 10000; ages[4] =
 * 100000; ages[5] = 1000000; ages[6] = 10000000; ages[7] = 100000000; ages[8] =
 * 1000000000;
 * 
 * System.out.println(ages[2]);
 * 
 * // ARRAY LIST List<Integer> list = new ArrayList<Integer>();
 * 
 * list.add(1);
 * 
 * list.add(2);
 * 
 * list.add(3);
 * 
 * //FOR PEGANDO DADOS DO ARRAY LIST for (int i = 0; i < list.size(); i++) {
 * Integer number = list.get(i);
 * 
 * }
 * 
 * int index = 0; //DO WHILE PEGANDO DADOS DO ARRAY LIST do { Integer number =
 * list.get(index); System.out.println(number); index++;
 * 
 * } while (index < list.size());
 * 
 * //WHILE PEGANDO DADOS DO ARRAY LIST while (index < list.size()) { Integer
 * number = list.get(index); System.out.println(number); index++; } } }
 * 
 * 
 * 
 * Scanner pegarValor = new Scanner(System.in);
 * 
 * System.out.print("Escreva o primerio número: "); Double num1 =
 * pegarValor.nextDouble();
 * 
 * 
 * 
 * System.out.print("Selecione uma operacao: 1) + ,2) - ,3) * ,4) / : "); String
 * operacao = pegarValor.next();
 * 
 * 
 * System.out.print("Escreva o segundo número: "); Double num2 =
 * pegarValor.nextDouble();
 * 
 * Double resultado = 0.0;
 * 
 * 
 * if (operacao.equals("1")) { resultado = soma(num1, num2);
 * 
 * } if (operacao.equals("2")) { resultado = subtracao(num1, num2);
 * 
 * } if (operacao.equals("3")) { resultado = multiplicacao(num1, num2);
 * 
 * } if (operacao.equals("4")) { resultado = divisao(num1, num2); }
 * 
 * System.out.println(resultado); }
 * 
 * public static Double soma(Double num1, Double num2) { return num1 + num2; }
 * 
 * public static Double subtracao(Double num1, Double num2) { return num1 -
 * num2; }
 * 
 * public static Double multiplicacao(Double num1, Double num2) { return num1 *
 * num2; }
 * 
 * public static Double divisao(Double num1, Double num2) { return num1 / num2;
 * 
 * }
 */
