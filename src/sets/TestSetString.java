package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("japon");
		set.add("Chine");
		set.add("Russie");
		set.add("Inde");

		// research the plus grand pays
		int maxi = 0;
		String jerry = null;
		Iterator<String> temp1 = set.iterator();
		while (temp1.hasNext()) {
			String val = temp1.next();
			if (val.length() > maxi) {
				maxi = val.length();
				jerry = val;
			}

		}
		System.out.println("the biggest name is" + " " + jerry);
		// Iterator<String> i = set.iterator();
		// while (i.hasNext()) {
		// System.out.println(i.next());
		// }

		// suprimmer the biggest
		Iterator<String> temp3 = set.iterator();
		while (temp3.hasNext()) {

			if (temp3.next() == jerry) {
				temp3.remove();
			}

		}
		System.out.println();
		Iterator<String> itrint2 = set.iterator();
		while (itrint2.hasNext()) {

			System.out.print(itrint2.next() + " ");
		}

		// modify all to majuscule
		Set<String> set2 = new HashSet<>();
		Iterator<String> temp4 = set.iterator();
		String tomtom = null;
		while (temp4.hasNext()) {
			tomtom = temp4.next().toUpperCase();
			set2.add(tomtom);
		}
		
		//set2.addAll(set);
		
		
		System.out.println();
		Iterator<String> du = set2.iterator();
		while (du.hasNext()) {
			System.out.print(" "+du.next());
		}
	}

}
