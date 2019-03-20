package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		// Afficher les elements

		Iterator<Double> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Researcher les elements plus grand
		double timo = 0.0;
		for (Double value : set) {
			if (value > timo) {
				timo = value;
			}
		}
		System.out.println();
		System.out.println("the largest value is :" + " " + timo);

		// supprimer le plus petite
		double pimo = 0.0;
		for (Double value : set) {
			double take = value;
			if (value < pimo) {
				pimo = take;

			}

		}
		Iterator<Double> jumb = set.iterator();
		while (jumb.hasNext()) {
			if (jumb.next() == pimo) {
				jumb.remove();
			}

		}

		System.out.println();
		System.out.println("the smallest value is :" + " " + pimo);

		// researche tout les negatif
		Set<Double> set2 = new HashSet<Double>();
		for (double valeur : set) {
			if (valeur < 0) {
				valeur = -(valeur);
			}
			set2.add(valeur);
		}

		Iterator<Double> du = set2.iterator();
		while (du.hasNext()) {
			System.out.println(du.next());
		}
	}

}
