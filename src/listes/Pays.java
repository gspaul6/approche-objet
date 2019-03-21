package listes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<PaysMan> set = new HashSet<>();
		set.add(new PaysMan("USA", 327167434, 55805.204));
		set.add(new PaysMan("France", 67795000, 38476.7));
		set.add(new PaysMan("Allemagne", 82979100, 47589.972));
		set.add(new PaysMan("UK", 65105246, 43770.688));
		set.add(new PaysMan("Italie", 60483973, 29866));
		set.add(new PaysMan("Japon", 126168156, 39058.5));
		set.add(new PaysMan("Chine", 1417913092, 7989.72));
		set.add(new PaysMan("Russie", 146880400, 11099.20));
		set.add(new PaysMan("Inde", 1296834042, 1626.982));

		// plus important pays
		double max = 0.0;
		String dodo = null;
		for (PaysMan value : set) {

			if (value.getPib() > max) {
				max = value.getPib();
				dodo = value.toString();
			}

		}
		System.out.println("the city with highest population" + " " + dodo);

		// plus important Pib*habitant
		double max2 = 0.0;

		
		String dodo2 = null;
		for (PaysMan value : set) {

			double tot = value.getPib() * value.getNbdhabitants();
			if (tot > max2) {

				max2 = tot;

				dodo2 = value.toString();
			}

		}
		System.out.println("the pib total population" + " " + dodo2);
		// plus petit
		Set<PaysMan> set2 = new HashSet<>();
		double mute = Double.MAX_VALUE;

		PaysMan odod = null;
		for (PaysMan valuer : set) {

			double total = valuer.getPib() * valuer.getNbdhabitants();
			System.out.println(total);
			if (total < mute) {
				mute = total;

				odod = valuer;
			}

		}
		System.out.println("the pib small total population" + " " + odod);
		Iterator<PaysMan> temp4 = set.iterator();
		
		while (temp4.hasNext()) {
			PaysMan country = temp4.next();
			if (country.getNom().equals(odod.getNom())) {
				country.setNom(country.getNom().toUpperCase());
				temp4.remove();
				//set2.addAll(set);
			}
		}
		Iterator<PaysMan> du = set.iterator();
		while (du.hasNext()) {
			System.out.println(" "+du.next());
		}
	}
}


