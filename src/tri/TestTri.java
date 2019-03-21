package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import listes.PaysMan;

public class TestTri {

	public static void main(String[] args) {
		
		List<PaysMan> entierrs = new ArrayList<>();
		PaysMan tim=new PaysMan();
		entierrs.add(new PaysMan("USA", 327167434, 55805.204));
		entierrs.add(new PaysMan("France", 67795000, 38476.7));
		entierrs.add(new PaysMan("Allemagne", 82979100, 47589.972));
		entierrs.add(new PaysMan("UK", 65105246, 43770.688));
		entierrs.add(new PaysMan("Italie", 60483973, 29866));
		entierrs.add(new PaysMan("Japon", 126168156, 39058.5));
		entierrs.add(new PaysMan("Chine", 1417913092, 7989.72));
		entierrs.add(new PaysMan("Russie", 146880400, 11099.2));
		entierrs.add(new PaysMan("Inde", 1296834042, 1626.982));
		
		Collections.sort(entierrs);
		Iterator<PaysMan> itrint = entierrs.iterator();
		while (itrint.hasNext()) {
			System.out.println(itrint.next()+ " ");
		}
		
		entierrs.sort(new TriComparator1());
		Iterator<PaysMan> tub = entierrs.iterator();
		while (tub.hasNext()) {
			System.out.println(tub.next()+ " ");
	}
		entierrs.sort(new TriComparator2());
		Iterator<PaysMan> pub = entierrs.iterator();
		while (pub.hasNext()) {
			System.out.println(pub.next()+ " ");
		}
	}

}
