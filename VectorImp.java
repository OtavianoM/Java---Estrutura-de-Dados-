package SchoolOfNetAulas;

import java.util.Vector;

public class VectorImp {
	public static void main(String[] args) {

		Vector v = new Vector<>(2, 3);
		System.out.println(v.capacity());

		v.addElement(1);
		v.addElement("a");

		System.out.println(v.size());
		v.addElement("bc");

		System.out.println(v.capacity());
		// v.remove(0);

		// while (v.iterator().hasNext()) {
		// System.out.println(v.iterator().next());

		// }

	}
}
