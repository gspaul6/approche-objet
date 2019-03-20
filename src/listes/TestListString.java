package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> tom = new ArrayList();
		tom.add("Nice");
		tom.add("Carcassonne");
		tom.add("Narbonne");
		tom.add("Lyon");
		tom.add("Foix");
		tom.add("Pau");
		tom.add("Marseille");
		tom.add("Tarbes");

		///// this section is for search the biggest ville

		int maxi = tom.get(0).length();
		String jerry = null;
		Iterator<String> temp1 = tom.iterator();
		while (temp1.hasNext()) {
			String val = temp1.next();
			if (val.length() > maxi) {
				maxi = val.length();
				jerry = val;
			}

		}

		System.out.println("the biggest number " + jerry);

		// this section is for modify

		// Iterator<String> temp2 = tom.iterator();
		// while (temp2.hasNext()) {
		for (int i = 0; i < tom.size(); i++) {
			// int idea = tom.indexOf(i);
			tom.set(i, tom.get(i).toUpperCase());
		}

		// }
		System.out.println();
		Iterator<String> itrint = tom.iterator();
		while (itrint.hasNext()) {
			System.out.print(itrint.next() + " ");
		}

		// this is section is for deleting

		Iterator<String> temp3 = tom.iterator();
		while (temp3.hasNext()) {
			String val = temp3.next();

			char[] k = val.toCharArray();

			if (k[0] == 'N' || k[0] == 'n') {
				temp3.remove();
			}

		}
		System.out.println();
		Iterator<String> itrint2 = tom.iterator();
		while (itrint2.hasNext()) {
			System.out.println();
			System.out.print(itrint2.next() + " ");
		}
	}

}
